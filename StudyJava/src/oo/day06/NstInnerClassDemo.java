package oo.day06;

//匿名内部类
public class NstInnerClassDemo {

	public static void main(String[] args) {
		// 1.创建了Inter2的一个子类，没有名字
		// 2.为该子类创建一个对象，叫o1
		// 3.大括号中的是那个子类的类体
		Inter2 o1 = new Inter2() {

		};
		final int number = 5;
		Inter3 o3 = new Inter3() {

			@Override
			public void show() {
				System.out.println("showshow");
				System.out.println(number);
			}

		};
		o3.show();
	}

}

interface Inter3 {
	public void show();
}

interface Inter2 {

}
