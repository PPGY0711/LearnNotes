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
		//ÿ��ִ��Season.SPRING��õ�����ͬ�Ķ���Ҳ����˵ö������ÿ��ö�ٶ��ǵ���ģʽ
	}
}

enum Season implements ITest{
	SPRING("����","��ů����"),//Ҫ����Season�Ĺ��췽��,�൱���ڵ����вε�˽�й���
	SUMMER("����","��������"),
	AUTUMN("����","�����ˬ"),
	WINTER("����","��������");
	
	private final String name;
	private final String desc;//����
	
	private Season(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}
	
	public void showInfo() {
		System.out.println(this.name + ": " + this.desc);
	}

	@Override
	public void test() {
		System.out.println("����ʵ�ֵ�ITest�ӿڵ�test()");
	}
}

interface ITest{
	void test();
}