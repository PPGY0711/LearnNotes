package day09;

public class Test3 {
	int i;
	public int z;
	private int k;
	class A{
		int i;//���i��A�ڲ���i
		public void setTest3Fields() {
			Test3.this.i = 1;
			Test3.this.k = 3;
			Test3.this.z = 2;
		}
		
		public void set() {
			this.i = 10;
		}
	}
	static class B{
		
	}
	
	abstract class C{
		
	}
	
	class D extends C{
		
	}
	
	public void setInfo() {
		new A().setTest3Fields();
	}
	
	public void showInfo() {
		System.out.println(this.i + " " + this.k + " " + this.z);//�ⲿ��Ҫ���Լ����ڲ���ķ�����Ҫ��new�ڲ���Ķ���
	}
	
	public static void main(String[] args) {
		Test3 t = new Test3();
		t.setInfo();
		t.showInfo();
	}
}
