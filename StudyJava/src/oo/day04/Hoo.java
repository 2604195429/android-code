package oo.day04;

public class Hoo {
	public int a;// �κ���
	protected int b;// ���ࡢ���ࡢͬ����
	int c;// ���ࡢͬ����
	private int d;// ����

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