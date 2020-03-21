package day09;

public abstract class Employee {
	public Employee() {}
	String name;
	int id;
	double salary;
	
	public abstract void work();
}

class CommonEmployee extends Employee{
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("This is a common employee");
	}
	
	public void setCommonEmployeeInfo(int id, String name, double salary) {
		super.id = id;
		super.name = name;
		super.salary = salary;
	}
	
	public void getCommonEmployeeInfo() {
		System.out.println(super.id);
		System.out.println(super.name);
		System.out.println(super.salary);
	}
}

class Manager extends Employee{
	double bonus;
	
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("This is a manager");
	}
	
	public void setManagerInfo(int id, String name, double salary,double bonus) {
		super.id = id;
		super.name = name;
		super.salary = salary;
		this.bonus = bonus;
	}
	
	public void getManagerInfo() {
		System.out.println(super.id);
		System.out.println(super.name);
		System.out.println(super.salary);
		System.out.println(this.bonus);
	}
}