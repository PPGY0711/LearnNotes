package day10;

import java.util.List;
import java.util.ArrayList;

public class Test5 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("b");//�����±�0
		list.add("d");//�����±�1
		list.add("a");//�����±�2
		list.add("c");//�����±�3
		list.add("d");//�����ظ�
		System.out.println(list);//[b, d, a, c, d]
		System.out.println(list.get(2));//a ͨ����������Ԫ��
		
		list.add(1,"f");//ָ�������±�λ�ò�������
		System.out.println(list);//[b, f, d, a, c, d]
		
		List<String> l = new ArrayList<String>();
		l.add("123");
		l.add("456");
		list.addAll(2,l);//��ָ�������±�λ�ò��뼯��
		System.out.println(list);
		System.out.println(list.indexOf("d"));//��ȡָ��Ԫ�ص�һ�γ��ֵ������±�
		System.out.println(list.lastIndexOf("d"));//��ȡָ��Ԫ�����һ�γ��ֵ������±�
		
		list.remove(2);//����ָ���������±��Ƴ�����
		System.out.println(list);
		
		list.set(1, "ff");//����ָ�������±��޸�Ԫ��ֵ
		System.out.println(list);
		
		List<String>sublist = list.subList(2, 4);//���������±����ʼλ�ý�ȡһ��Ԫ�أ���ȡʱ������ʼ������������������ʱ������
		//[2,4]ʱȡ>=2,<4�������±��Ԫ�ء�
		System.out.println(sublist);
		//ȡlist����
		System.out.println(list.size());
	}
}