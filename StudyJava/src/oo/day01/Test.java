package oo.day01;

public class Test {

	public static void main(String[] args) {
		Zhu zhu1=new Zhu();
		Zhu zhu2=zhu1;
		zhu1.a=2;
		zhu2.a=3;
		System.out.println(zhu1.a);//等于3
		
		String zhu3=new String("zhang");
		String zhu4=zhu3;
		zhu4="aaaa";
		System.out.println(zhu3);//为什么不是aaaa
	}

}

class Zhu{
	int a;
	
}
