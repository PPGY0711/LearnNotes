# Java集合

## Set类

![Java集合概述]java集合.resource\Java集合概述.PNG)

### HashSet

![HashSet集合]java集合.resource\HashSet集合.PNG)

- HashSet不是线程安全的
- HashSet中元素存在HashSet的那个位置由这个值的HashCode决定。
- 不可重复指的是hashcode不相同（equals为true/false无关紧要，但一般情况下是同源的）

![HashSet实现Collection接口]java集合.resource\HashSet实现Collection接口.PNG)

```java
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
	}
}
/*
[1, a]
false
[]
[a, b, c, d]
a
b
c
d
a
b
c
d
4
4
[null, a, b, c, d]

*/
```

![hs判断对象相等]java集合.resource\hs判断对象相等.PNG)

**如果想要让集合只能存某一个类型的对象，怎么做？**

**-》使用泛型！**

```java
Set<String> set1 = new HashSet<String>();//比如指定String为集合的泛型，那么就不能存其他类型的对象了。
set1.add("Abc");//OK
set1.add(1);//illegal

//Set<Object> set = new HashSet<Object>();等价于Set set = new HashSet();
//都能存任何类型的数据
```

### TreeSet

![TreeSet]java集合.resource\TreeSet.PNG)

![ts自然排序]java集合.resource\ts自然排序.PNG)

```java
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test4 {
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<Integer>();
		
		set.add(5);
		set.add(3);
		set.add(2);
		set.add(4);
		System.out.println(set); //[2, 3, 4, 5] 自然排序
		//使用迭代器遍历
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("======");
		//
		for(Integer i : set) {
			System.out.println(i);
		}
	}
}

/*
[2, 3, 4, 5]
2
3
4
5
======
2
3
4
5
*/
```

**问题：自定义的类对象如Person类怎么排序？**

```java
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test4 {
	public static void main(String[] args) {
//		Set<Integer> set = new TreeSet<Integer>();
//		
//		set.add(5);
//		set.add(3);
//		set.add(2);
//		set.add(4);
//		System.out.println(set); //[2, 3, 4, 5] 自然排序
//		//使用迭代器遍历
//		Iterator<Integer> it = set.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
//		System.out.println("======");
//		//
//		for(Integer i : set) {
//			System.out.println(i);
//		}
		
		Person p1 = new Person("zhangsan",23);
		Person p2 = new Person("lisi",20);
		Person p3 = new Person("wangwu",16);
		Person p4 = new Person("Lucy",29);
		Set<Person> set = new TreeSet<Person>(new Person());
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		//按年龄正序排列
		for(Person p : set) {
			System.out.println(p.name + " " + p.age);
		}
	}
}

//把Person对象存到TreeSet中并且按照年龄排序
class Person implements Comparator<Person>{

	int age;
	String name;
	public Person() {
		
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
//	//年龄正序排序
//	@Override
//	public int compare(Person o1, Person o2) {
//		if(o1.age > o2.age) {
//			
//			return 1;
//		}
//		else if(o1.age < o2.age)
//			return -1;
//		return 0;
//	}
	//年龄倒序排序
	@Override
	public int compare(Person o1, Person o2) {
		if(o1.age > o2.age) {
			
			return -1;
		}
		else if(o1.age < o2.age)
			return 1;
		return 0;
	}
}

/*
Lucy 29
zhangsan 23
lisi 20
wangwu 16
*/
```

## List类

![List]java集合.resource\List.PNG)



```java
import java.util.List;
import java.util.ArrayList;

public class Test5 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("b");//索引下标0
		list.add("d");//索引下标1
		list.add("a");//索引下标2
		list.add("c");//索引下标3
		list.add("d");//允许重复
		System.out.println(list);//[b, d, a, c, d]
		System.out.println(list.get(2));//a 通过索引访问元素
		
		list.add(1,"f");//指定索引下标位置插入数据
		System.out.println(list);//[b, f, d, a, c, d]
		
		List<String> l = new ArrayList<String>();
		l.add("123");
		l.add("456");
		list.addAll(2,l);//在指定索引下标位置插入集合
		System.out.println(list);
		System.out.println(list.indexOf("d"));//获取指定元素第一次出现的索引下标
		System.out.println(list.lastIndexOf("d"));//获取指定元素最后一次出现的索引下标
		
		list.remove(2);//根据指定的索引下标移除数据
		System.out.println(list);
		
		list.set(1, "ff");//根据指定索引下标修改元素值
		System.out.println(list);
		
		List<String>sublist = list.subList(2, 4);//根据索引下标的起始位置截取一段元素，截取时包含开始的索引，不包含结束时的索引
		//[2,4]时取>=2,<4的索引下标的元素。
		System.out.println(sublist);
		//取list长度
		System.out.println(list.size());
	}
}

/*
[b, d, a, c, d]
a
[b, f, d, a, c, d]
[b, f, 123, 456, d, a, c, d]
4
7
[b, f, 456, d, a, c, d]
[b, ff, 456, d, a, c, d]
[456, d]
7
*/
```

![ArrayList和Vector]java集合.resource\ArrayList和Vector.PNG)

## Map

![Map]java集合.resource\Map.PNG)

![Map接口]java集合.resource\Map接口.png)

#### HashMap

```java
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

/*
{b=1, c=2, e=2}
1
{b=1, e=2}
2
true
false
true
key: b,value: 1
key: e,value: 2
====
key: b,value: 1
key: e,value: 2
*/
```

![Hs and Ht]java集合.resource\Hs and Ht.PNG)

#### TreeMap

![treeMap]java集合.resource\treeMap.PNG)

一般使用map集合，不会使用过于复杂的对象作为key

```java
public class Test7 {
	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<Integer, String>();
		map.put(2, "c");//添加数据，用put
		map.put(1, "a");
		map.put(4, "b");
		System.out.println(map);//{1=a, 2=c, 4=b}
	}
//TreeMap的自然指的是字典排序
}
```

## 操作集合的工具类Collections

![Collections]java集合.resource\Collections.PNG)

```java
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
        //sort第二个参数是要排序的对象（要实现Comparator接口）
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

/*
[b, cd, ca, a, 1]
[1, a, ca, cd, b]
[ca, cd, b, 1, a]
[1, a, b, ca, cd]
zhangsan,14
lisi,12
wangwu,13
Lucy,11
====================
Lucy,11
lisi,12
wangwu,13
zhangsan,14
*/
```

![Collection其他方法]java集合.resource\Collection其他方法.PNG)

![Collection其他方法2]java集合.resource\Collection其他方法2.PNG)