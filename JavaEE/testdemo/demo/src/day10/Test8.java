package day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test8 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("b");
		list.add("cd");
		list.add("ca");
		list.add("a");
		list.add("1");
		System.out.println(list);
		
		Collections.reverse(list); // 反转list集合顺序
		System.out.println(list);
		
		Collections.shuffle(list); // 随机排序list集合元素
		System.out.println(list); 
		
		Collections.sort(list); //list集合字典升序排序
		System.out.println(list);
		
		Student s1 = new Student(14,"zhangsan");
		Student s2 = new Student(12,"lisi");
		Student s3 = new Student(13,"wangwu");
		Student s4 = new Student(11,"Lucy");
		List<Student> stus = new ArrayList<Student>();
		stus.add(s1);
		stus.add(s2);
		stus.add(s3);
		stus.add(s4);
		
		for(Student stu : stus) {
			System.out.println(stu.name + "," + stu.age);//这里还是按照插入顺序排的
		}
		
		Collections.sort(stus, new Student());
		System.out.println("====================");
		for(Student stu : stus) {
			System.out.println(stu.name + "," + stu.age);//这里还是按照插入顺序排的
		}
	}
}

class Student implements Comparator<Student>{
	int age;
	String name;
	
	public Student() {
		
	}
	
	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	@Override
	public int compare(Student o1, Student o2) {//根据年龄升序排序对象
		if(o1.age > o2.age) {
			return 1;
		}else if(o1.age < o2.age) {
			return -1;
		}
		return 0;
	}
}