package oo.day06;

public class DebugDemo {

	public static void main(String[] args) {
		int a = 5, b = 6;
		int n = plus(a, b);
		System.out.println(n);
		show();
		System.out.println("over");
	}

	public static int plus(int num1, int num2) {
		int num = num1 + num2;
		return num;
	}

	public static void show() {
		System.out.println(111);
		System.out.println(222);
		System.out.println(333);
	}
}
