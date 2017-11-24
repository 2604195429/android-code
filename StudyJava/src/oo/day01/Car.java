package oo.day01;

public class Car {
	String brand;
	double price;
	String color;

	public Car(String brand ,double price , String color) {
		this.brand=brand;
		this.price=price;
		this.color =color;
	}

	void show() {
		System.out.println(brand + price + color);
	}

	void startup() {
		System.out.println(brand + "∆Ù∂Ø¡À");
	}
}
