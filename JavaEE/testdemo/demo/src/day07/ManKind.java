package day07;

public class ManKind {

	int sex;
	int salary;
	public ManKind() {
		System.out.println("ManKind constructor");
	}
	//��������ʽ�Ĺ�������ʱ�򣬾�û��Ĭ�ϵĲ��������Ĺ������ˡ�
	public ManKind(int sex,int salary) {
		this.sex = sex;
		this.salary = salary;
	}
	
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void manOrWoman() {
		if(this.sex == 1)
			System.out.println("man");
		else
			System.out.println("woman");
	}
	public void employeed() {
		if(this.salary == 0)
			System.out.println("no job");
		else
			System.out.println("job");
	}
	
	
}