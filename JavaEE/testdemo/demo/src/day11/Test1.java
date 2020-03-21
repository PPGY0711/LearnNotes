package day11;

public class Test1 {
	public static void main(String[] args) {
//		B1<Object> b1 = new B1<Object>();
//		B1<String> b12 = new B1<String>();
//		
//		B2 b2 = new B2();
////		B2<String> b22 = new B2<String>();
		Cc<Object> c = new Cc<Object>();
		c.test("XXXX"); //泛型固定成String
		c.test1(2);		//泛型固定成Integer
		c.test1(true);	//泛型固定成Boolean
		//泛型方法在调用之前没有固定数据类型，在调用时确定具体的数据类型
		//在调用时传入的参数是什么类型就会把这个泛型改成什么类型
	}
}

interface IB<T>{
	T test(T t);
}

/**
 * 未传入泛型实参时，与泛型类的定义相同，在声明类的时候，需将泛型的声明也一起加到类中
 * @author Administrator
 *
 * @param <T>
 */
class B1<T> implements IB<T>{
	@Override
	public T test(T t) {
		return t;
	}
}

/**
 * 如果实现接口时指定接口的泛型的具体数据类型
 * 这个类实现接口所有方法的位置都要泛型替换实际的具体数据类型
 * @author Administrator
 *
 */
class B2 implements IB<String>{
	@Override
	public String test(String t) {
		// TODO Auto-generated method stub
		return null;
	}
	//T全部改成了String
}

class Cc<E>{
	private E e;//类定义的泛型
	/**
	 * 静态方法的泛型方法
	 * @param <T>
	 * @param t
	 */
	public static <T> void test3(T t) {
		//在静态方法中，不能使用类定义泛型，如果要使用泛型，只能使用静态方法自己定义的泛型
//		System.out.println(this.e);//illegal
		
		System.out.println(t);//OK
	}
	
	/**
	 * 无返回值的泛型方法
	 * @param <T>
	 * @param s
	 */
	public <T> void test(T s) {
		//在类上定义的泛型，可以在普通的方法中使用
		System.out.println(this.e);
		T t = s;
	}
	
	/**
	 * 有返回值的泛型方法
	 * @param <T>
	 * @param s
	 * @return
	 */
	//定义泛型用<T>，这里跟定义函数返回值类型是不冲突的
	public <T> T test1(T s) {
		return s;
	}
	
	/**
	 * 形参为可变长度的泛型方法
	 * @param <T>
	 * @param strs
	 */
	public <T> void test2(T... strs) {
		for(T s : strs) {
			System.out.println(s);
		}
	}
}