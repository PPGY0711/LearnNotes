package day09;

public abstract class Template {
	public abstract void code();
	public final void getTime() {
		long start = System.currentTimeMillis();
		code();
		long end = System.currentTimeMillis();
		System.out.println("code executed for:" + (end-start));
	}
}

class TestTmp extends Template{
	@Override
	public void code() {
		int k = 0;
		// TODO Auto-generated method stub
		for(int i =0 ;i<500000;i++) {
			k+=i;
		}
		System.out.println(k);
	}
}