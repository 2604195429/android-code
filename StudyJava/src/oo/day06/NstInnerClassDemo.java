package oo.day06;

//�����ڲ���
public class NstInnerClassDemo {

	public static void main(String[] args) {
		// 1.������Inter2��һ�����࣬û������
		// 2.Ϊ�����ഴ��һ�����󣬽�o1
		// 3.�������е����Ǹ����������
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
