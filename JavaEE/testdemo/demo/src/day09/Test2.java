package day09;

public class Test2 {
	//������ԱB�Ĺ���
	public static void main(String[] args) {
		BWM b3 = new BWMFactory3().productBWM();
        b3.showInfo();
		BWM b5 = new BWMFactory5().productBWM();
        b5.showInfo();
		BWM b7 = new BWMFactory7().productBWM();	
		b7.showInfo();
	}
}
