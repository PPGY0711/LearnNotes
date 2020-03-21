package day07;

public class Kids extends ManKind{
	
//	public Kids(int sex, int salary) {
//		super(sex, salary);
//		// 当父类只有有参构造可以使用的时候，子类必须显式的构建一个构造来调用父类的有参构造，并且调用父类有参构造要写在第一行
//	}
	int yearsOld;
	public void printAge() {
		System.out.println(this.yearsOld);
	}
	public int getYearsOld() {
		return yearsOld;
	}
	public void setYearsOld(int yearsOld) {
		this.yearsOld = yearsOld;
	}
	public static void main(String[] args) {
		Kids someKid = new Kids();
//		someKid.setSex(0);
//		someKid.setSalary(100);
//		someKid.manOrWoman();
//		someKid.employeed();
	}
	@Override
	public void employeed() {
		// TODO Auto-generated method stub
		super.employeed();
		System.out.println("But kids should study and no job");
	}
}
