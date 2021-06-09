package com.javaex.ex01;

public class Person {

	// field
	private String name;
	private String hp;



	// constructors
	public Person() {
		// super(); --> Object();
	}

	public Person(String name, String hp) {
		this.name = name;
		this.hp = hp;
	}



	// method getter/setter
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getHp() {
		return hp;
	}

	// method
	public String toString() {
		return "Person [name=" + name + ", hp=" + hp + "]";
	}

	public void showInfo() {
		System.out.println("#이름:" + name + ", #핸드폰:" + hp);
	}



}
