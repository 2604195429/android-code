package oo.day04;

public class StaticDemo {

	public static void main(String[] args) {
		Loo o1 = new Loo();
		o1.show();
		Loo o2 = new Loo();
		o2.show();
		System.out.println(Loo.b);// 建议类名来访问
		System.out.println(o1.b);// 不建议的
		Moo.test();
		Noo o3 = new Noo();
		Noo o4 = new Noo();
	}

}

class Noo {
	static {
		System.out.println("静态块");
	}

	Noo() {
		System.out.println("构造方法");
	}
}

class Moo {
	int a;
	static int b;

	void show() {
		int a = 1;
		b = 2;
	}

	static void test() {
		// a=1;//没有this意味着没有对象
		b = 2;
	}
}

class Loo {
	int a;
	static int b;

	Loo() {
		a++;
		b++;
	}

	void show() {
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}
}
