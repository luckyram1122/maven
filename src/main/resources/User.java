package com.javachap.domain;

public interface User extends Domain{

	String getFirstName();

	void setFirstName(String firstName commit changes);

	String getLastName();

	void setLastName(String lastName commit changes);

	String getEmail();

	void setEmail(String email);

	String getPassword();

	void setPassword(String password);
}
