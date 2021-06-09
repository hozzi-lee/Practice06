package com.javaex.ex04;

public class User {

	// field
	private String id;
	private String password;
	private String name;



	// constructors
	public User() {
		// super(); 생략 --> Object();
	}

	public User(String id, String password, String name) {
		this.id = id;
		this.password = password;
		this.name = name;
	}



	// method getter/setter
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}



	// method
	public String toString() {
		return "User [id=" + id + ", passwore=" + password + ", name=" + name + "]";
	}

	public void showInfo() {
		System.out.println("#아이디:" + id + ", #패스워드:" + password + ", #이름: " + name);
	}

}
