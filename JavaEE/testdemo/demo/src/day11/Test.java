package day11;

public class Test {
	public static void main(String[] args) {
		A<String> a1 = new A<String>();//在new A的对象指定泛型的类型String
		a1.setKey("xxxx");//对象使用setKey()方法中的key形参就是String类型
		String s = a1.getKey();//T getKey()，返回值就有new对象确定返回值是String类型
	
		A<Integer> a2 = new A<Integer>();//在new A的对象指定泛型的类型Integer
		a2.setKey(123);//对象使用setKey()方法中的key形参就是Integer类型
		Integer i = a2.getKey();//T getKey()，返回值就有new对象确定返回值是Integer类型
		
		A a3 = new A();//在new A的对象不指定泛型的类型，相当于指定了Object类型		
		//同样的类，但是在new对象时泛型指定了不同的数据类型，这些对象不能互相赋值
	}
}

/**
 * 此处的泛型T可以任意取名，B,A,V...
 * @author Administrator
 *
 * @param <T>
 */
class A<T>{
	private T key;
	public void setKey(T key) {
		this.key = key;
	}
	
	public T getKey() {
		return this.key;
	}
}