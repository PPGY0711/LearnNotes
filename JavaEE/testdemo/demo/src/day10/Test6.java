package day10;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test6 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("b", 1);//添加数据，用put
		map.put("c", 2);
		map.put("e", 2);
		System.out.println(map);
		
		System.out.println(map.get("b"));//根据key取值
		
		map.remove("c");//根据Key来移除键值对
		System.out.println(map);
		System.out.println(map.size());//map集合长度
		
		//判断当前Map集合是否包含某个Key
		System.out.println(map.containsKey("b"));
		System.out.println(map.containsKey("a"));
		
		System.out.println(map.containsValue(1));
		
//		map.clear();//清空集合
		
		//遍历Map集合
		Set<String> keys = map.keySet();//获取map集合的key的集合
//		map.values();//获取map集合的value的集合
		
		for(String key : keys) {
			System.out.println("key: " + key + ",value: " + map.get(key));
		}
		System.out.println("====");
		
		//通过map.entrySet()遍历map集合，Entry<Type1,Type2>是Map<Type1,Type2>的集合
		Set<Entry<String, Integer>> entrys = map.entrySet();
		for(Entry<String, Integer> en : entrys) {
			System.out.println("key: " + en.getKey() + ",value: " + en.getValue());
		}
	}
}
