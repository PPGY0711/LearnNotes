package day07;

public class Kids extends ManKind{
	
//	public Kids(int sex, int salary) {
//		super(sex, salary);
//		// ������ֻ���вι������ʹ�õ�ʱ�����������ʽ�Ĺ���һ�����������ø�����вι��죬���ҵ��ø����вι���Ҫд�ڵ�һ��
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
