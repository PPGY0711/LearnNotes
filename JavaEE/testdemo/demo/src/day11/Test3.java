package day11;

public class Test3 {
	public static void main(String[] args) {
		Season spring = Season.SPRING;
		spring.showInfo();
		Season summer = Season.SUMMER;
		summer.showInfo();
		Season autumn = Season.AUTUMN;
		autumn.showInfo();
		Season winter = Season.WINTER;
		winter.showInfo();
		
		Season spring1 = Season.SPRING;
		System.out.println(spring.equals(spring1));//true
		spring1.test();
		//每次执行Season.SPRING获得的是相同的对象，也就是说枚举类中每个枚举都是单例模式
	}
}

enum Season implements ITest{
	SPRING("春天","春暖花开"),//要调用Season的构造方法,相当于在调用有参的私有构造
	SUMMER("夏天","烈日炎炎"),
	AUTUMN("秋天","秋高气爽"),
	WINTER("冬天","寒风凛冽");
	
	private final String name;
	private final String desc;//描述
	
	private Season(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}
	
	public void showInfo() {
		System.out.println(this.name + ": " + this.desc);
	}

	@Override
	public void test() {
		System.out.println("这是实现的ITest接口的test()");
	}
}

interface ITest{
	void test();
}