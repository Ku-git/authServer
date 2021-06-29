package com.ku.auth.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class UserConfig extends GlobalAuthenticationConfigurerAdapter {

	PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
	
//	@Override
//	public void init(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication()
//			.withUser("ku")
//			.password(passwordEncoder.encode("kupass"))
//			.roles("USER","ADMIN","MANAGER")
//			.authorities("CAN_READ","CAN_WRITE","CAN_DELETE")
//			.and()
//			.withUser("rex")
//			.password(passwordEncoder.encode("rexpass"))
//			.roles("USER")
//			.authorities("CAN_READ","CAN_WRITE");
//	}
}
