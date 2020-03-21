package day10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test3 {
	public static void main(String[] args) {
		Set set = new HashSet();
		
		//Set添加数据
		set.add(1);
		set.add("a");
		System.out.println(set);
		
		//Set移除数据
		set.remove(1);
		
		//查看是否存在某元素
		System.out.println(set.contains(1));
		
		//清空集合
		set.clear();
		System.out.println(set);
		
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		System.out.println(set);
		//1.使用迭代器遍历集合
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//for each迭代集合
		for(Object obj : set) {
			//这个的意思是说把Set的每一个元素取出来赋值给obj，直到循环set的所有值
			System.out.println(obj);
		}
		
		//集合大小
		System.out.println(set.size());
		
		//set集合存的是不重复的值
		set.add("d");
		System.out.println(set.size());
		
		//可以存null，且输出不按添加的排列顺序
		set.add(null);
		System.out.println(set);
		
		Set<String> set1 = new HashSet<String>();
		set1.add("Abc");//OK
//		set1.add(1);//illegal
	}
}
