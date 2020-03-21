package day09;

public class Person {
	String name;
    static int age;
    static TestPerson tp = new TestPerson();
	public Person() {
		this.name = "zhangsan";
	}
	
	//非静态的代码块
	{
		System.out.println("code 1");
		System.out.println("---------");
	}
	
	//非静态的代码块
	{
		System.out.println("code 2");
		System.out.println("---------");
	}
	
	//静态代码块
	static {
		//只能使用静态static修饰的属性和方法
		//多用来初始化类的静态变量
		age = 1;
		showAge();
		tp.age = 1;
		tp.name = "ABC";
	}
	public static void showAge() {
		System.out.println(age);
		System.out.println("===static code===");
	}
	
	public void test() {
		System.out.println("Person Test()");
	}
}
