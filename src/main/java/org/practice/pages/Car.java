package org.practice.pages;

public class Car {
	
	 String color;
	    String model;
	    int year;

	    public Car(String color, String model, int year) {
	        this.color = color;
	        this.model = model;
	        this.year = year;
	    }

	    public void startEngine() {
	        System.out.println("The engine of the " + model + " is started.");
	    }

	    public void displayDetails() {
	        System.out.println("Model: " + model + ", Color: " + color + ", Year: " + year);
	    }


	public static void main(String[] args) {
		
		  Car car1 = new Car("Red", "Toyota", 2021);
	        Car car2 = new Car("Blue", "Honda", 2019);

	        car1.startEngine();
	        car2.displayDetails();
	    }

}
