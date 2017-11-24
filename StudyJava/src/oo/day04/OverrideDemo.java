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
		System.out.println("父型参数");
		o.show();
	}

	void test(Foo o) {
		System.out.println("子类参数");
		o.show();
	}
}

class Eoo {
	void show() {
		System.out.println("父类show");
	}
}

class Foo extends Eoo {
	@Override
	void show() {
		System.out.println("子类show");
	}
}
