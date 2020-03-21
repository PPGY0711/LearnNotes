package day09;

public class Test1 {
	public static void main(String[] args) {
//		new Person();
//		new Person();
		//匿名内部类
		Person p = new Person() {
			//这个类里面不能重写Person的构造方法/或者说以子类的方式去显式的定义该类的构造方法，因为这个类的名字不知道
			//问题？现在想把name改成lisi，但是不想动Person的代码
			{
				//用代码块代替构造方法
				super.name = "lisi";
			}
			@Override
			public void test() {
				System.out.println("====");
				//这是一个重写
			}
		};//构建了没有类名的Person子类，即匿名的Person子类
		//这种类没有类名，就不能用显式的new创建对象
		//要是还要再构造器中初始化属性就没有办法，这样的话就需要用代码块做初始化工作
		
		System.out.println(p.name);
		p.test();
	}
}
