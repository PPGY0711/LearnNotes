package day09;

public class SCTeacher extends Person1 implements Cook,Singer{

	String course; //�̵Ŀ�Ŀ
	@Override
	public void singing() {
		// TODO Auto-generated method stub
		System.out.println(super.name + "��ʦ�ó�����");
	}

	@Override
	public void fry() {
		// TODO Auto-generated method stub
		System.out.println(super.name + "��ʦ���ֵĳ���������");
	}

	public void setInfo() {
		super.name = "������";
		super.age = 30;
		super.sex = 1;
		this.course = "math";
	}
	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("�ᳪ��ĳ��ӵ���ʦ����Ϣ�ǣ�");
		System.out.println(super.name);
		System.out.println(super.age);
		System.out.println(super.sex);
		System.out.println(this.course);
	}

}