## 泛型Generic![为什么要使用泛型](java泛型.resource\为什么要使用泛型.PNG)

![泛型编译阶段](java泛型.resource\泛型编译阶段.PNG)

### 泛型类

![泛型类](java泛型.resource\泛型类.PNG)

![泛型举例](java泛型.resource\泛型举例.png)

```java
public class Test {
	public static void main(String[] args) {
		A<String> a1 = new A<String>();//在new A的对象指定泛型的类型String
		a1.setKey("xxxx");//对象使用setKey()方法中的key形参就是String类型
		String s = a1.getKey();//T getKey()，返回值就有new对象确定返回值是String类型
	
		A<Integer> a2 = new A<Integer>();//在new A的对象指定泛型的类型Integer
		a2.setKey(123);//对象使用setKey()方法中的key形参就是Integer类型
		Integer i = a2.getKey();//T getKey()，返回值就有new对象确定返回值是Integer类型
		
		A a3 = new A();//在new A的对象不指定泛型的类型，相当于指定了Object类型		
		//同样的类，但是在new对象时泛型指定了不同的数据类型，这些对象不能互相赋值
	}
}

/**
 * 此处的泛型T可以任意取名，B,A,V...
 * @author Administrator
 *
 * @param <T>
 */
class A<T>{
	private T key;
	public void setKey(T key) {
		this.key = key;
	}
	
	public T getKey() {
		return this.key;
	}
}
```

### 泛型接口

```java
//定义一个泛型接口
interface Generator<T>{
	T next();
}
```

![泛型接口定义](java泛型.resource\泛型接口定义.PNG)

**指定了泛型类型的接口不能再指定**

![指定了泛型类型的接口不能再指定](java泛型.resource\指定了泛型类型的接口不能再指定.png)

```java
public class Test1 {
	public static void main(String[] args) {
		B1<Object> b1 = new B1<Object>();
		B1<String> b12 = new B1<String>();
		
		B2 b2 = new B2();
//		B2<String> b22 = new B2<String>();
		
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
```

### 泛型方法

![泛型方法](java泛型.resource\泛型方法.PNG)

```java
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
```

### 通配符

![通配符](java泛型.resource\通配符.PNG)

![通配符做限制](java泛型.resource\通配符做限制.PNG)

```java
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
```

## 枚举和注解

![枚举类概述](java泛型.resource\枚举类概述.PNG)

![Season类实现](java泛型.resource\Season类实现.PNG)

单例模式编写以上代码。

![enum枚举类](java泛型.resource\enum枚举类.PNG)

```java

public class Test3 {
	public static void main(String[] args) {
		Season spring = Season.SPRING;
		spring.showInfo();
		Season summer = Season.SUMMER;
		summer.showInfo();
		Season autumn = Season.AUTUMN;
		autumn.showInfo();
		Season winter = Season.WINTER;
		winter.showInfo();
		
		Season spring1 = Season.SPRING;
		System.out.println(spring.equals(spring1));//true
		//每次执行Season.SPRING获得的是相同的对象，也就是说枚举类中每个枚举都是单例模式
	}
}

enum Season{
	SPRING("春天","春暖花开"),//要调用Season的构造方法,相当于在调用有参的私有构造
	SUMMER("夏天","烈日炎炎"),
	AUTUMN("秋天","秋高气爽"),
	WINTER("冬天","寒风凛冽");
	
	private final String name;
	private final String desc;//描述
	
	private Season(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}
	
	public void showInfo() {
		System.out.println(this.name + ": " + this.desc);
	}
}
```

![枚举类实现接口](java泛型.resource\枚举类实现接口.PNG)

![枚举类方法](java泛型.resource\枚举类方法.PNG)

## Annotation注解

![Annotation注解](java泛型.resource\Annotation注解.PNG)

![基本的注解](java泛型.resource\基本的注解.PNG)

![自定义注解](java泛型.resource\自定义注解.PNG)

```java
import java.util.ArrayList;
import java.util.List;

public class Test4 {
	
	public static void main(String[] args) {
		new TestB().test1(); 
		
		//抑制编译器警告
		@SuppressWarnings({ "unused", "rawtypes" })
		List list = new ArrayList();
	}
}

class TestA{
	public void test() {
		
	}
}

class TestB extends TestA{
	//@Override表示重写
	@Override
	public void test() {
		// TODO Auto-generated method stub
		super.test();
	}
	//被淘汰的方法
	@Deprecated
	public void test1() {
		
	}
}
```

显示出的效果：

![注解示意](java泛型.resource\注解示意.PNG)

```

```

