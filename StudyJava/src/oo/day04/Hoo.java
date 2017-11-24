package oo.day04;

public class Hoo {
	public int a;// 任何类
	protected int b;// 本类、子类、同包类
	int c;// 本类、同包类
	private int d;// 本类

	void show() {
		a = 1;
		b = 2;
		c = 3;
		d = 4;
	}
}

class Ioo {
	void show() {
		Hoo h = new Hoo();
		h.a = 1;
		h.b = 2;
		h.c = 3;
		// h.d=4;
	}
}