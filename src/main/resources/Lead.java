package com.javachap.domain;

public interface Lead extends Domain{
	
	enum Status {New, Published commit change lead java file}

	String getTitle();

	void setTitle(String title);

	String getDescription();

	void setDescription(String description);

	String getFirstName();

	void setFirstName(String firstName);

	String getLastName();

	void setLastName(String lastName);

	String getEmail();

	void setEmail(String email);

	String getPhone();

	void setPhone(String phone);

	Float getPrice();

	void setPrice(Float price);

	Category getCategory();

	void setCategory(Category category);

	User getOwner();

	void setOwner(User owner);
	
	String getStatus();
	
	void setStatus(String status);	
}
