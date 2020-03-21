package day09;

public class Test4 {
	public static void main(String[] args) {
		A a = new A();
		a.testB();
		a.testC();
		//�����ͬʱ��д��testB()��testC()
	}
}
/**
 * ������A��ͬʱ�����B����C�ķ���������д������ͬʱ�̳�B��C������
 * @author Administrator
 *
 */
class A{
	public void testB() {
		new InnerB().testB();
	}
	
	public void testC() {
		new InnerC().testC();
	}
	
	private class InnerB extends B{
		@Override
		public void testB() {
			System.out.println("rewrites testB()");
		}
	}
	
	private class InnerC extends C{
		@Override
		public void testC() {
			System.out.println("rewrites testC()");
		}
	}
}

class B{
	public void testB() {
		
	}
}

class C{
	public void testC() {
		
	}
}