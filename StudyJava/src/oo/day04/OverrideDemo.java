package oo.day04;

public class OverrideDemo {

	public static void main(String[] args) {
		Goo o = new Goo();
		Eoo o1 = new Foo();
		o.test(o1);
	}

}

class Goo {
	void test(Eoo o) {
		System.out.println("���Ͳ���");
		o.show();
	}

	void test(Foo o) {
		System.out.println("�������");
		o.show();
	}
}

class Eoo {
	void show() {
		System.out.println("����show");
	}
}

class Foo extends Eoo {
	@Override
	void show() {
		System.out.println("����show");
	}
}
