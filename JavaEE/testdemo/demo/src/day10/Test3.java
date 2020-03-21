package day10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test3 {
	public static void main(String[] args) {
		Set set = new HashSet();
		
		//Set��������
		set.add(1);
		set.add("a");
		System.out.println(set);
		
		//Set�Ƴ�����
		set.remove(1);
		
		//�鿴�Ƿ����ĳԪ��
		System.out.println(set.contains(1));
		
		//��ռ���
		set.clear();
		System.out.println(set);
		
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		System.out.println(set);
		//1.ʹ�õ�������������
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//for each��������
		for(Object obj : set) {
			//�������˼��˵��Set��ÿһ��Ԫ��ȡ������ֵ��obj��ֱ��ѭ��set������ֵ
			System.out.println(obj);
		}
		
		//���ϴ�С
		System.out.println(set.size());
		
		//set���ϴ���ǲ��ظ���ֵ
		set.add("d");
		System.out.println(set.size());
		
		//���Դ�null��������������ӵ�����˳��
		set.add(null);
		System.out.println(set);
		
		Set<String> set1 = new HashSet<String>();
		set1.add("Abc");//OK
//		set1.add(1);//illegal
	}
}