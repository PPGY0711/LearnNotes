package day10;

public class Test {
	public static void main(String[] args) {
//		int i = 0;
//		try {//��try()����סһ���п��ܳ����쳣�Ĵ����
//			System.out.println(1);
//			System.out.println(1/i);
//			System.out.println(2);
//		}catch(Exception e) {
//			//����֪���������ʲô���͵��쳣ʱ������ֱ��ʹ�������쳣�ĸ���Exception
//			System.out.println(3);
//		}
//		finally {
//			System.out.println(4);
//		}
//		System.out.println("OK");
		
		String[] strs = new String[] {"a","b"};
		A a = null;
		//try catch��Ϊ�˷�ֹ������ֿ��ܳ��ֵ��쳣
		try {
//		System.out.println(strs[2]);//��⵽java.lang.ArrayIndexOutOfBoundsException: 2
		System.out.println(strs[0]);
		System.out.println(a.i);
		}catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println(e1.getMessage());
			e1.printStackTrace();
		}catch(NullPointerException e2) {
			System.out.println(e2.getMessage());//������ӡstrs[2]ʱ������NullPointerException
			e2.printStackTrace();
		}
		System.out.println("=======");
	}
}

class A{
	int i;
}