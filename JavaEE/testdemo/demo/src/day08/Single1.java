package day08;

public class Single1 {
	//私有的构造，构造方法私有化，调用这个类的类就不能直接使用new来创建对象了
	private Single1() {}
	
	//私有的Single类型的类变量声明，先为null，暂时不创建类对象
	private static Single1 single1 = null;
	
	//第一个调用getInstance()方法的时候会new对象
	public static Single1 getInstance() {
		if(single1 == null)
			single1 = new Single1();
		return single1;
	}
}
