package day10;

public class Test1 {
	public static void main(String[] args) throws Exception{//���Լ����׳�������main�����׳��Ļ����׸�JVM�ˣ�û�а취�ٴ���
		B b = new B();
		try {
			//�ڴ������׳����쳣���ڵ��÷�ȥ������
//			b.test1(-1);
			b.test2(-11);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class B{
	int i;
	public void test() throws Exception{
		//����ʹ��throws�����׳��쳣���ڵ��÷��д���
		B b = null;
		System.out.println(b.i);
	}
	
	int age;
	
	public void test1(int age) throws Exception {
		if(age >= 0 && age <= 150) {
			this.age = age;
			System.out.println("Age is: " + this.age);
		}else {
			throw new MyException("Age should be between 0 & 150");
		}
	}
	
	public void test2(int age) throws MyException{
		if(age >= 0 && age <= 150) {
			this.age = age;
			System.out.println("Age is: " + this.age);
		}else {
			throw new MyException("Age should be between 0 & 150");
		}
	}
}

class MyException extends Exception{
	public MyException(String msg) {
		super(msg);
	}
}