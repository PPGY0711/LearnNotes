package day10;

import java.util.Map;
import java.util.TreeMap;

public class Test7 {
	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<Integer, String>();
		map.put(2, "c");//添加数据，用put
		map.put(1, "a");
		map.put(4, "b");
		System.out.println(map);
	}
//TreeMap的自然指的是字典排序
}
