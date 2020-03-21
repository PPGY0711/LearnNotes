package day08;

/**
 * 饿汉式的单例模式
 * @author Administrator
 *
 */
public class Single {
//	public Single() {
//		//假设构造中执行1000行代码，要消耗很大的资源，耗时10秒
//		//每一次new Single()需要10秒
//		//这种情况适合于单例设计模式
//	}
	//饿汉式，先new出一个对象来，来了就能吃（传这个对象出去）
	
	//私有的构造，构造方法私有化，调用这个类的类就不能直接使用new来创建对象了
	private Single() {}
	
	//私有的Single类型的类变量
	private static Single single = new Single();
	
	public static Single getInstance() {
		return single;
	}
}
