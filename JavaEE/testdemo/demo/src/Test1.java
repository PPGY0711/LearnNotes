
public class Test1 {
	int t = 0;
	public static void main(String[] args) {
		//实例化Person类，也就是创建Person对象
//		int i = 0;
//		String s= "";
//		Person person = new Person();//声明一个Person类型的变量，名为person，实例化Person类并且给person赋值，赋值就是当前的实例
//		//new Person()就是实例化Person类
//		person.name = "张三";//给person的name属性赋值
//		person.showName();//对象的方法调用
//		int i = person.getAge();//有返回值的方法在调用之后就有一个值，就是方法中return的部分，可用变量接收
//		System.out.println(i);
//		
//		person.age = 11;
//		int a = person.getAge();
//		System.out.println(a);
//		Animal ani = new Animal();
//		ani.eat("老鼠");
//		ani.move("飞");
//		//对于对象的使用无外乎两个地方：1.操作类的变量；2.调用类的方法
//		Person1 p = new Person1();
//		//p.age = 1;//访问不了Person1类中age
		Student stu = new Student();
		stu.name = "小明";
		stu.age = 12;
		stu.course = "语文/数学/英语";
		stu.interest = "打球/街舞/唱歌";
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
//		System.out.println(t);//报错，说明static修饰的方法不能访问非static的类变量
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
	//多个相同名称的方法如果想在一个类中共存，那么这些同名方法一定是参数的个数或者参数的数据类型不一样
	//这样的同名方法就叫做重载
	//顺序不同也是重载
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
