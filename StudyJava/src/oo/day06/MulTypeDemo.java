package oo.day06;

public class MulTypeDemo {
	// ��̬����ʾ
	public static void main(String[] args) {
		Aoo o1 = new Boo();// ��������
		Boo o2 = (Boo) o1;// ������ָ����󣬾��Ǹ�����
		Inter1 o3 = (Inter1) o1;// ���ö�ָ��Ķ���ʵϰ�˴νӿ�
		// Coo o4=(Coo) o1;classcastexception����ת���쳣
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
