package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {

		// TestUser
		User user = new User("hogenie93", "ghwls1007#", "hojin lee");
		System.out.println(user.toString());
		user.showInfo();
		System.out.println();
		// TestEmployee
		Employee Euser = new Employee("hogenie93", "ghwls1007#", "hojin lee", 5500000);
		System.out.println(Euser.toString());
		Euser.showInfo();
		System.out.println();
		// TestCustomer
		Customer Cuser = new Customer("hogenie93", "ghwls1007#", "hojin lee", 5500000);
		System.out.println(Cuser.toString());
		Cuser.showInfo();
		System.out.println();
		System.out.println("----------------------------------");
		System.out.println();


		User[] userArray = {
				new Customer("jws", "j1234", "정우성", 1000),
				new Customer("yjs", "y2345", "이효리", 2000),
				new Employee("master", "m7788", "운영자", 5000000)
		};

		for ( int i = 0; i < userArray.length; i++ ) {
			userArray[i].showInfo();
		}
		System.out.println(userArray[2].getName() + "의 월급은 " + ((Employee)userArray[2]).getSalary() + "원 입니다.");
	}

}
