package com.javaex.ex05;

public class Depart extends Employee {

	//코드작성
	// field
	private String department;
	
	
	
	// constructors
	public Depart() {
		// super(); 생략됨 --> Employee();
	}
	
	public Depart(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}
	
	
	
	// method getter/setter
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDepartment() {
		return department;
	}
	
	// method
	public String toString() {
		return super.toString() + "\tDepart [department=" + department + "]";
	}
	
	public void showInformation() {
        System.out.println("이름:" + getName() + "  연봉:" + getSalary() + "  부서:" + department);
    }

}
