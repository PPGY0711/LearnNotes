package day09;

public class TestPerson {
	int age;
	String name = "";//final修饰的变量是常量，常量必须显式赋值
	final static String name1 = "";//final static修饰的变量是全局常量
	
	public void test() {
		
	}
}

class T0 extends TestPerson{
	@Override
	public void test() {
		// TODO Auto-generated method stub
		super.test();
	}
}