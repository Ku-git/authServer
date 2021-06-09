package com.ku.auth.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AccountStatusUserDetailsChecker;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ku.auth.entity.User;
import com.ku.auth.model.AuthUserDetail;
import com.ku.auth.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> optionalUser = userRepository.findByUsername(username);
		optionalUser.orElseThrow( () -> new UsernameNotFoundException("Username or Password wrong"));
		
		AuthUserDetail userDetail = new AuthUserDetail(optionalUser.get());
		new AccountStatusUserDetailsChecker().check(userDetail);
		
		return userDetail;
	}

}
