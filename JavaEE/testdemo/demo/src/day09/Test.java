package day09;

public class Test {
	public static void main(String[] args) {
//		new Person();
//		new Person();
//		//�����ڲ���
//		Person p = new Person() {
//			@Override
//			public void test() {
//				// TODO Auto-generated method stub
//				super.test();
//				//����һ����д
//			}
//		};//������û��������Person���࣬��������Person����
//		//������û���������Ͳ�������ʽ��new��������
//		//Ҫ�ǻ�Ҫ�ٹ������г�ʼ�����Ծ�û�а취�������Ļ�����Ҫ�ô��������ʼ������
//		
//		System.out.println(p.name);
//		p.test();
//		Dog d = new Dog();
//		d.move();
		
//		CommonEmployee ce = new CommonEmployee();
//		ce.work();
//		ce.setCommonEmployeeInfo(0, "lisi", 123.33);
//		ce.getCommonEmployeeInfo();
//		TestTmp tt= new TestTmp();
//		tt.getTime();
		SCTeacher sct = new SCTeacher();
		sct.setInfo();
		sct.showInfo();
		sct.fry();
		sct.singing();
		
		Cook c = new SCTeacher();
		c.fry();
		System.out.println(c.DISH);
		Singer s = new SCTeacher();
		s.singing();
//		System.out.println(s.DISH);//�Ƿ�
	}
}