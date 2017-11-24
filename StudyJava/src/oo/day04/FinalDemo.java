package oo.day04;

public class FinalDemo {

	public static void main(String[] args) {
		System.out.println(H.MUAN);
	}

}

class H {
	public static final int MUAN = 100;
}

final class Roo {
}

// class Soo extends Roo{} final的类不能继承
class Aoo {
}

final class Too extends Aoo {
}

class Poo {
	final void show() {

	}

	void test() {
	}
}

class Qoo extends Poo {
	// void show() { }

	void test() {
	}
}

class Ooo {
	/*
	 * final修饰成员变量：两张方式初始化 1）声明的同时初始化 2）构造方法中初始化化 final修饰局部变量，只要在用之前初始化即可
	 * 
	 */
	final int a = 5;
	final int b;

	Ooo() {
		b = 8;
	}

	void show() {
		final int c;
		// a = 55;
	}
}
