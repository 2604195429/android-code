package oo.day06;

public class MulTypeDemo {
	// 多态的演示
	public static void main(String[] args) {
		Aoo o1 = new Boo();// 向上造型
		Boo o2 = (Boo) o1;// 引用所指向对象，就是该类型
		Inter1 o3 = (Inter1) o1;// 引用多指向的对象实习了次接口
		// Coo o4=(Coo) o1;classcastexception类型转换异常
		if (o1 instanceof Coo) {// false
			Coo o5 = (Coo) o1;
		}
	}

}

interface Inter1 {

}

class Aoo {

}

class Boo extends Aoo implements Inter1 {

}

class Coo extends Aoo {

}
