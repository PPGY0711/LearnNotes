package day09;

public class Test2 {
	//开发人员B的工作
	public static void main(String[] args) {
		BWM b3 = new BWMFactory3().productBWM();
        b3.showInfo();
		BWM b5 = new BWMFactory5().productBWM();
        b5.showInfo();
		BWM b7 = new BWMFactory7().productBWM();	
		b7.showInfo();
	}
}
