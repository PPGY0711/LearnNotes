package day09;

/**
 * 宝马车产品接口
 * @author Administrator
 *
 */

public interface BWM {
	//产品的信息介绍
	//车的发动方式
	void showInfo();
}

/**
 * 构建具体的车系
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