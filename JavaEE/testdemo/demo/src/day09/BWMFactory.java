package day09;

/**
 * �������������ӿ�
 * @author Administrator
 *
 */
public interface BWMFactory {
	BWM productBWM();
}

class BWMFactory3 implements BWMFactory{
	@Override
	public BWM productBWM() {
		// TODO Auto-generated method stub
		System.out.println("Produce BWM3");
		return new BWM3();
	}
}

class BWMFactory5 implements BWMFactory{
	@Override
	public BWM productBWM() {
		// TODO Auto-generated method stub
		System.out.println("Produce BWM5");
		return new BWM5();
	}
}

class BWMFactory7 implements BWMFactory{
	@Override
	public BWM productBWM() {
		// TODO Auto-generated method stub
		System.out.println("Produce BWM7");
		return new BWM7();
	}
}