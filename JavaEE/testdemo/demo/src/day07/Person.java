package day07;

public class Person {

	public String name;
	public int sex;
	public int age;
	
	public void showInfo() {
		System.out.println(this.name);
		System.out.println(this.sex);
		System.out.println(this.age);
	}
	
	public void setInfo(int age, String name, int sex) {
		this.age = age;
		this.name = name;
		this.sex = sex;
	}
}