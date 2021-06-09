package com.javaex.ex02;

public class Triangle extends Shape{

	// field
	private int width;
	private int height;



	// constructors
	public Triangle() {
		// super(); --> Shape();
		System.out.println("Triangle()");
	}

	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
		System.out.println("Triangle(2)");
	}

	public Triangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
		System.out.println("Triangle(4)");
	}



	// method getter/setter
	public void setWidth(int width) {
		this.width = width;
	}
	public int getWidth() {
		return width;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	public int getHeight() {
		return height;
	}

	// method
	public String toString() {
		return super.toString() + "\tTriangle [width=" + width + ", height=" + height + "]";
	}

}


