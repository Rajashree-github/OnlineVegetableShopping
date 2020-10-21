package com.cg.vegetable.mgmt.entities;

public class User {
	@Id
	private String userId;
	private String password;
	private String confirmPassword;
	private String role;
}
