package com.javaex.ex02;

public class Shape {

	// field
	private String fillColor;
	private String lineColor;



	// constructors
	public Shape() {
		// super(); --> Object();
		System.out.println("Shape()");
	}

	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		System.out.println("Shape(2)");
	}



	// method getter/setter
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	public String getFillColor() {
		return fillColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	public String getLineColor() {
		return lineColor;
	}

	// method
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", [lineColor=" + lineColor + "]";
	}

}

