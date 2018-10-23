package com.priyanka.app.ws.ui.model.response;
//used at the UI level and used to send a response to a calling client

public class UserRest {
	private String userId; // not same as database userId, used to identify user in the http request
	private String firstName;
	private String lastName;
	private String email; //cannot contain password
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
