package oo.day06;

public class InnerClassDemo {
	// 内部类的演示
	public static void main(String[] args) {
		Mother m = new Mother();
		// Baby b = new Baby();对外不可见
	}

}

class Mother {// 外部类
	private String name;

	Baby createBaby() {
		return new Baby();
	}

	class Baby {// 内部类
		public void showMotherName() {
			System.out.println(name);
			System.out.println(Mother.this.name);
			// System.out.println(this.name);this本类的
		}
	}
}
