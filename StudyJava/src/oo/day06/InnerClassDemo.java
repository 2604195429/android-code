package oo.day06;

public class InnerClassDemo {
	// �ڲ������ʾ
	public static void main(String[] args) {
		Mother m = new Mother();
		// Baby b = new Baby();���ⲻ�ɼ�
	}

}

class Mother {// �ⲿ��
	private String name;

	Baby createBaby() {
		return new Baby();
	}

	class Baby {// �ڲ���
		public void showMotherName() {
			System.out.println(name);
			System.out.println(Mother.this.name);
			// System.out.println(this.name);this�����
		}
	}
}
