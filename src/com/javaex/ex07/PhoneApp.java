package com.javaex.ex07;

public class PhoneApp {

	public static void main(String[] args) {

		Phone phone = new SmartPhone();
		phone.execute("앱");
		phone.execute("음악");
		phone.execute("통화");

		System.out.println();
		System.out.println();

		// superTest
		Phone testP = new Phone();
		System.out.println(testP.toString());
		System.out.println("---------------------------------");

		MusicPhone testMP = new MusicPhone();
		System.out.println(testMP.toString());
		System.out.println("---------------------------------");

		SmartPhone testSP = new SmartPhone();
		System.out.println(testSP.toString());

	}

}
