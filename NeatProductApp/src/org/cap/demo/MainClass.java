package org.cap.demo;

public class MainClass {

	public static void main(String[] args) {

		ProductApp productApp = new ProductApp();
		productApp.productDisplay();
		greetings();
	}

	public static void greetings() {
		System.out.println("Happy to see all pdt details");
		System.out.println("Test 1");
		System.out.println("Test 2");
	}
	
	public void newMethod() {
		System.out.println("jABA");
	}

}
