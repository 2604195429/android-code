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

// class Soo extends Roo{} final���಻�ܼ̳�
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
	 * final���γ�Ա���������ŷ�ʽ��ʼ�� 1��������ͬʱ��ʼ�� 2�����췽���г�ʼ���� final���ξֲ�������ֻҪ����֮ǰ��ʼ������
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
