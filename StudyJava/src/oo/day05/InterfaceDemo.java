//package oo.day05;
//
//public class InterfaceDemo {
//
//	public static void main(String[] args) {
//		Inter6 o2 = new Foo();// 向上造型
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
//// 又继承类有实现接口
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
//// 接口是实现
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
////	int NUM = 250;// 默认public static final
////
////	public void say();// 默认public abstract
////	// int COUNT;编译错误，常量必须声明是初始化
////	// void say(){}接口方法默认都是抽象方法
////
////}
