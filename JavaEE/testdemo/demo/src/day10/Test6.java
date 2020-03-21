package day10;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test6 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("b", 1);//������ݣ���put
		map.put("c", 2);
		map.put("e", 2);
		System.out.println(map);
		
		System.out.println(map.get("b"));//����keyȡֵ
		
		map.remove("c");//����Key���Ƴ���ֵ��
		System.out.println(map);
		System.out.println(map.size());//map���ϳ���
		
		//�жϵ�ǰMap�����Ƿ����ĳ��Key
		System.out.println(map.containsKey("b"));
		System.out.println(map.containsKey("a"));
		
		System.out.println(map.containsValue(1));
		
//		map.clear();//��ռ���
		
		//����Map����
		Set<String> keys = map.keySet();//��ȡmap���ϵ�key�ļ���
//		map.values();//��ȡmap���ϵ�value�ļ���
		
		for(String key : keys) {
			System.out.println("key: " + key + ",value: " + map.get(key));
		}
		System.out.println("====");
		
		//ͨ��map.entrySet()����map���ϣ�Entry<Type1,Type2>��Map<Type1,Type2>�ļ���
		Set<Entry<String, Integer>> entrys = map.entrySet();
		for(Entry<String, Integer> en : entrys) {
			System.out.println("key: " + en.getKey() + ",value: " + en.getValue());
		}
	}
}
