
public class Test1 {
	int t = 0;
	public static void main(String[] args) {
		//ʵ����Person�࣬Ҳ���Ǵ���Person����
//		int i = 0;
//		String s= "";
//		Person person = new Person();//����һ��Person���͵ı�������Ϊperson��ʵ����Person�ಢ�Ҹ�person��ֵ����ֵ���ǵ�ǰ��ʵ��
//		//new Person()����ʵ����Person��
//		person.name = "����";//��person��name���Ը�ֵ
//		person.showName();//����ķ�������
//		int i = person.getAge();//�з���ֵ�ķ����ڵ���֮�����һ��ֵ�����Ƿ�����return�Ĳ��֣����ñ�������
//		System.out.println(i);
//		
//		person.age = 11;
//		int a = person.getAge();
//		System.out.println(a);
//		Animal ani = new Animal();
//		ani.eat("����");
//		ani.move("��");
//		//���ڶ����ʹ������������ط���1.������ı�����2.������ķ���
//		Person1 p = new Person1();
//		//p.age = 1;//���ʲ���Person1����age
		Student stu = new Student();
		stu.name = "С��";
		stu.age = 12;
		stu.course = "����/��ѧ/Ӣ��";
		stu.interest = "����/����/����";
		stu.showInfo();
		
		Test1 t1 = new Test1();
		int area = t1.getArea(2, 3);
		System.out.println(area);
		
		Person2 p2 = new Person2();
		p2.name = "lisi";
		p2.sex = 1;
		p2.age = 11;
		p2.study();
		p2.showAge();
		int a = p2.addAge(2);
		System.out.println("a: " + a + "  p2.age: " + p2.age);
		
		System.out.println(new Circle().area(2));
//		System.out.println(t);//������˵��static���εķ������ܷ��ʷ�static�������
		Test1 t2 = new Test1();
		t2.mOL(2);
		t2.mOL(2,3);
		t2.mOL("Hello overload");
		
		Person3 p3 = new Person3();
		String[] ss = new String[] {"zhangsan","11","basketball"};
		p3.printInfo(ss);
		String[] sss = new String[] {"Beijing U","Peking U"};
		p3.printInfo1(sss);
	}
	public int getArea(int x, int y) {
		return x*y;
	}
	//�����ͬ���Ƶķ����������һ�����й��棬��ô��Щͬ������һ���ǲ����ĸ������߲������������Ͳ�һ��
	//������ͬ�������ͽ�������
	//˳��ͬҲ������
	//
	public int add(int x, int y) {
		return x+y;
	}
	public double add(int x,double y) {
		return x+y;
	}
	public int add(int x,int y,int z) {
		return x+y+z;
	}
	public void mOL(int i) {
		System.out.println(i*i);
	}
	public void mOL(int x,int y) {
		System.out.println(x*x+y*y);
	}
	public void mOL(String s) {
		System.out.println(s);
	}
}