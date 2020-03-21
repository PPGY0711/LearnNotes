package day07;

public class Student extends Person{
	private String school;

	@Override
	public void showInfo() {
		System.out.println("Override showInfo() below");
		super.showInfo();
		System.out.println(this.school);
	}
	
	@Override
	public void setInfo(int age, String name, int sex) {
		// TODO Auto-generated method stub
		super.setInfo(age, name, sex);
		this.school = "ZJU";
	}
	
	public void test() {
		System.out.println("super class can't access this function");
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		
//		Person p = new Student();
//		p.setInfo(0, "zhangsan", 1);
//		p.showInfo();
//        p.school = "PKU";//报错，访问不到
//        s.school = "PKU";//不报错
//		p.test();//报错，访问不到
//		s.test();//不报错	
		Person p = new Person();
		System.out.println(s instanceof Person);
		System.out.println(p instanceof Person);
		System.out.println(p instanceof Student);
		
		Person p2 = new Student();
		System.out.println(p2 instanceof Student);
	}
}
