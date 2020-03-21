package day11;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
	public static void main(String[] args) {
		Dd d = new Dd();
		List<String> l1 = new ArrayList<String>();
		d.test(l1);
		List<Integer> l2 = new ArrayList<Integer>();
		d.test(l2);
		
		List<A1> a1 = new ArrayList<A1>();
		
		List<C1> c1 = new ArrayList<C1>();
		d.test1(c1);
		
		List<D1> d1 = new ArrayList<D1>();
		d.test1(d1);
		
		List<B3> b3 = new ArrayList<B3>();
//		d.test1(b3);//illegal
		d.test2(b3);
		d.test2(c1);
//		d.test2(d1);//illegal
		
		List<IAImpl> lia = new ArrayList<IAImpl>();
		d.test3(lia);
//		d.test3(a1);//illegal
	}
}

class Dd{
	public void test(List<?> list) {
		//test方法需要一个list集合的参数，不确定list集合到底是存的数的类型是什么
		
	}
	
	public void test1(List<? extends C1> list) {
		//list的参数的元素数据类型是C1及其子类
	}
	
	public void test2(List<? super C1> list) {
		//list的参数的元素数据类型是C1及其父类
	}
	
	//接口实现也是extends
	public void test3(List<? extends IA> list) {
		//list的参数的元素数据类型是IA的实现类
	}
}

class A1{
	
}

class B3 extends A1{
	
}

class C1 extends B3{
	
}

class D1 extends C1{
	
}

interface IA{}

class IAImpl implements IA{
	
}