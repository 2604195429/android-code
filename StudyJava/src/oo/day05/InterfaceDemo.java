//package oo.day05;
//
//public class InterfaceDemo {
//
//	public static void main(String[] args) {
//		Inter6 o2 = new Foo();// ��������
//		Inter5 o3 = new Foo();
//	}
//
//}
//
//interface Inter5 {
//	void show();
//}
//
//interface Inter6 extends Inter5 {
//	void say();
//}
//
//class Foo implements Inter6 {
//
//	@Override
//	public void show() {
//
//	}
//
//	@Override
//	public void say() {
//
//	}
//
//}
//
//// �ּ̳�����ʵ�ֽӿ�
//interface Inter3 {
//	void show();
//}
//
//interface Inter4 {
//	void say();
//}
//
//abstract class Doo {
//	abstract void test();
//}
//
//class Eoo extends Doo implements Inter3, Inter4 {
//
//	@Override
//	public void say() {
//
//	}
//
//	@Override
//	public void show() {
//
//	}
//
//	@Override
//	void test() {
//
//	}
//
//}
//
//// �ӿ���ʵ��
//interface Inter2 {
//	void show();
//
//	void say();
//}
//
//class Coo implements Inter2 {
//
//	@Override
//	public void show() {
//
//	}
//
//	@Override
//	public void say() {
//
//	}
//
//}
////
////interface Inter1 {
////	public static final double PI = 3.14;
////
////	public abstract void show();
////
////	int NUM = 250;// Ĭ��public static final
////
////	public void say();// Ĭ��public abstract
////	// int COUNT;������󣬳������������ǳ�ʼ��
////	// void say(){}�ӿڷ���Ĭ�϶��ǳ��󷽷�
////
////}
