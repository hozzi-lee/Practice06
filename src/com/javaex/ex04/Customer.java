package com.javaex.ex04;

public class Customer extends User {

	// field
	private int point;
	
	
	
	// constructors
	public Customer() {
		// super(); 생략 --> User();
	}
	
	public Customer(String id, String password, String name, int point) {
		super(id, password, name);
		this.point = point;
	}
	
	
	
	// method getter/setter
	public void setPoint(int point) {
		this.point = point;
	}
	public int getPoint() {
		return point;
	}
	
	// method
	public String toString() {
		return super.toString() + " Customer [point=" + point + "]";
	}
	
	public void showInfo() {
		System.out.println("#아이디:" + getId() + ", #패스워드:" + getPassword() + ", #이름:" + getName() + ", #포인트:" + point);
	}

}
