package oo.day05;

public class ShapeTest {
	// 找一组图形的最大面积
	public static void main(String[] args) {
		// new Sape();抽象类不能实例化
		Shape[] shapes = new Shape[4];
		shapes[0] = new Square(1);
		shapes[1] = new Square(2);
		shapes[2] = new Circle(3);
		shapes[3] = new Circle(4);
		maxArea(shapes);
	}

	public static void maxArea(Shape[] shapes) {
		double max = shapes[0].area();
		int maxIndex = 0;
		for (int i = 0; i < shapes.length - 1; i++) {
			double area = shapes[i + 1].area();
			if (area > max) {
				max = area;
				maxIndex = i + 1;
			}
		}
		System.out.println(max + "  " + maxIndex);
	}
}

abstract class Shape {
	protected double c;// 周长

	public abstract double area();
}

class Square extends Shape {
	public Square(double c) {
		super.c = c;
	}

	@Override
	public double area() {
		return 0.7833 * c * c;
	}

}

class Circle extends Shape {
	public Circle(double c) {
		super.c = c;
	}

	@Override
	public double area() {
		return 0.333 * c * c;
	}

}
