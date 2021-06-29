package com.ku.auth.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "oauth_access_token")
public class AuthToken implements Serializable{
	
	@Column(name = "token_id")
	private String tokeId;
	private byte[] token;
	@Id
	@Column(name = "authentication_id")
	private String authenticationId;
	@Column(name = "user_name")
	private String userName;
	@Column(name = "client_id")
	private String clientId;
	private byte[] authentication;
	@Column(name = "refresh_token")
	private String refreshToken;
	
}
