package day09;

public class SCTeacher extends Person1 implements Cook,Singer{

	String course; //教的科目
	@Override
	public void singing() {
		// TODO Auto-generated method stub
		System.out.println(super.name + "老师擅长美声");
	}

	@Override
	public void fry() {
		// TODO Auto-generated method stub
		System.out.println(super.name + "老师拿手的厨艺是粤菜");
	}

	public void setInfo() {
		super.name = "王富贵";
		super.age = 30;
		super.sex = 1;
		this.course = "math";
	}
	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("会唱歌的厨子的老师的信息是：");
		System.out.println(super.name);
		System.out.println(super.age);
		System.out.println(super.sex);
		System.out.println(this.course);
	}

}
