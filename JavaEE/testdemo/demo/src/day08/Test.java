package day08;

public class Test {
	public void method(Person e) {
//		System.out.println(e.getschool); //�Ƿ�������ʱ������ΪPerson����û��getSchool()����
		if(e instanceof Student) {
			Student me = (Student)e;
			System.out.println(me.getSchool());
		}
		else
			e.test();
	}
	public static void main(String[] args) {
//		//Object�����������߸���
//		String s = "hello";
//		Object obj = s;//���Խ���
//		System.out.println(obj);
//		
//		Object obj1 = "hello";
//		String s1 = (String) obj1;
//		System.out.println(s1);//hello
//		Test t = new Test();
//		Person p1 = new Person();
//		Student s = (Student)p1;//����-�����࣬�������ǿ������ת��
//		//��������ʱ������
////		t.method(m);
//		t.method(s);
//		
//		System.out.println("---------1");
//		t.method(new Person());
//		System.out.println("---------2");
//		t.method(new Student());
//		System.out.println("---------3");
//		t.method((Student)new Person());
//		
//		String s1 = new String("abc");
//		String s2 = "abc";
//		System.out.println(s1==s2);
		
//		Order o1 = new Order(1,"o1");
//		Order o2 = new Order(2,"o2");
//		System.out.println(o1.equals(o2));
//		
//		o2.setOrderId(o1.getOrderId());
//		o2.setOrderName(o1.getOrderName());
//		System.out.println(o1.equals(o2));
//		
//		int i1 = new Integer(112);
//		System.out.println(i1);
		//��Jdk1.5֮������Զ�װ�����
		Integer i5 = 112;//�Զ�װ��
		int i6 = i5;//�Զ�����
		int i7 = new Integer(112);//Ҳ����

		int i8 = Integer.parseInt("123");//�ַ���ת������������
		float f = Float.parseFloat("0.40");
		boolean b1 = Boolean.parseBoolean("true");

//		String istr = String.valueOf(i8);
//		String fstr = String.valueOf(f);
//		String bstr = String.valueOf(b1);
//		System.out.println(istr+" "+fstr+" "+bstr);//123 0.4 true
//		System.out.println(i5.toString());
//		Test t = new Test();
//		System.out.println(t.toString());
//		System.out.println(t);//day08.Test@15db9742
//		Chinese.country = "China";
//		Chinese c = new Chinese();
//		c.name = "zhangsan";
//		c.age = 11;
//		Chinese c1 = new Chinese();
//		c1.name = "lisi";
//		c1.age = 12;
//		System.out.println(c.country);
//		System.out.println(c1.country);
//		System.out.println(Chinese.country);
//		System.out.println(Chinese.class);
//		Single s = new Single();
		Single s1 = Single.getInstance();
		Single s2 = Single.getInstance();
		Single s3 = Single.getInstance();
		Single s4 = Single.getInstance();
	}
//	
//	@Override
//	public String toString() {
//		return "Test rewrite the toString() method";
//	}
}