package day09;

/**
 * ��������Ʒ�ӿ�
 * @author Administrator
 *
 */

public interface BWM {
	//��Ʒ����Ϣ����
	//���ķ�����ʽ
	void showInfo();
}

/**
 * ��������ĳ�ϵ
 * @author Administrator
 *
 */
class BWM3 implements BWM{
	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("BWM3");
	}
}
class BWM5 implements BWM{
	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("BWM5");
	}
}
class BWM7 implements BWM{
	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("BWM7");
	}
}