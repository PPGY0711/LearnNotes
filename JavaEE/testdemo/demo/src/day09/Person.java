package day09;

public class Person {
	String name;
    static int age;
    static TestPerson tp = new TestPerson();
	public Person() {
		this.name = "zhangsan";
	}
	
	//�Ǿ�̬�Ĵ����
	{
		System.out.println("code 1");
		System.out.println("---------");
	}
	
	//�Ǿ�̬�Ĵ����
	{
		System.out.println("code 2");
		System.out.println("---------");
	}
	
	//��̬�����
	static {
		//ֻ��ʹ�þ�̬static���ε����Ժͷ���
		//��������ʼ����ľ�̬����
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