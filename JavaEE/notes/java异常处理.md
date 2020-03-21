## Java异常处理

### Java异常

![Java异常](java异常处理.resource\Java异常.PNG)

![Java异常2](java异常处理.resource\Java异常2.PNG)

```java
public class Test {
	public static void main(String[] args) {
//		String[] strs = new String[] {"a","b","c"};
//		
//		for(int i =0; i < 4;i++) {//0，1，2，3这个数组没有第四个元素
//			//数组越界异常java.lang.ArrayIndexOutOfBoundsException
//			System.out.println(strs[i]);
//		}
		A a = new A();
		System.out.println(a.i);//正确
		A a1 = null;
		//在下一语句中，引用变量a1没有指向任何对象，指向null，什么都没有
		//System.out.println(a1.i);//报错，空指针异常java.lang.NullPointerException
		int i = 0;
		System.out.println(1/i);//报错，除0错
        //java.lang.ArithmeticException: / by zero
	}
}

class A{
	int i;
}
```

![Java异常3](java异常处理.resource\Java异常3.PNG)

![常见异常](java异常处理.resource\常见异常.PNG)

### Java异常处理机制

![异常处理机制](java异常处理.resource\异常处理机制.PNG)

```java
public class Test {
	public static void main(String[] args) {
		int i = 0;
		try {//用try()来括住一段有可能出现异常的代码段
			System.out.println(1/i);
		}catch(Exception e) {
			//当不知道捕获的是什么类型的异常时，可以直接使用所有异常的父类Exception
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("OK");
	}
}

/*
java.lang.ArithmeticException: / by zero
	at day10.Test.main(Test.java:7)
/ by zero
OK
*/
```

![异常处理机制2](java异常处理.resource\异常处理机制2.PNG)

```java
public class Test {
	public static void main(String[] args) {
		int i = 0;
		try {//用try()来括住一段有可能出现异常的代码段
			System.out.println(1);
			System.out.println(1/i);
			System.out.println(2);
		}catch(Exception e) {
			//当不知道捕获的是什么类型的异常时，可以直接使用所有异常的父类Exception
			System.out.println(3);
		}
		finally {
            //finally可写可不写，它时捕获异常的体系中最终一定会执行的部分
            //IO操作和JDBC都会用到
			System.out.println(4);
		}
		System.out.println("OK");
	}
}
/*
1
3
4
OK
*/
```

```java
public class Test {
	public static void main(String[] args) {
//		int i = 0;
//		try {//用try()来括住一段有可能出现异常的代码段
//			System.out.println(1);
//			System.out.println(1/i);
//			System.out.println(2);
//		}catch(Exception e) {
//			//当不知道捕获的是什么类型的异常时，可以直接使用所有异常的父类Exception
//			System.out.println(3);
//		}
//		finally {
//			System.out.println(4);
//		}
//		System.out.println("OK");
		
		String[] strs = new String[] {"a","b"};
		A a = null;
		//try catch是为了防止程序出现可能出现的异常
        //在捕获异常的代码块中（try{}里的代码），如果前面的代码报异常了，后面的不会再执行了
		try {
//		System.out.println(strs[2]);//检测到java.lang.ArrayIndexOutOfBoundsException: 2
		System.out.println(strs[0]);
		System.out.println(a.i);
		}catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println(e1.getMessage());
			e1.printStackTrace();
		}catch(NullPointerException e2) {
			System.out.println(e2.getMessage());//当不打印strs[2]时，捕获到NullPointerException
			e2.printStackTrace();
		}
		System.out.println("=======");
	}
}

class A{
	int i;
}

```

![异常捕获](java异常处理.resource\异常捕获.PNG)

![异常捕获2](java异常处理.resource\异常捕获2.PNG)

![异常捕获3](java异常处理.resource\异常捕获3.PNG)

### 声明抛出异常

```java
public class Test1 {
	public static void main(String[] args) throws Exception{//可以继续抛出，但是main方法抛出的化就抛给JVM了，没有办法再在程序中处理
		B b = new B();
		try {
			//在代码这抛出的异常，在调用方去捕获处理
			b.test();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class B{
	int i;
	public void test() throws Exception{
		//可以使用throws在这抛出异常，在调用方中处理
		B b = null;
		System.out.println(b.i);
	}
}
```

![抛出异常](java异常处理.resource\抛出异常.PNG)

```java
public class Test1 {
	public static void main(String[] args) throws Exception{//可以继续抛出，但是main方法抛出的化就抛给JVM了，没有办法再处理
		B b = new B();
		try {
			//在代码这抛出的异常，在调用方去捕获处理
			b.test1(-1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

/*
java.lang.Exception: Age should be between 0 & 150
	at day10.B.test1(Test1.java:30)
	at day10.Test1.main(Test1.java:8)
*/

class B{
	int i;
	public void test() throws Exception{
		//可以使用throws在这抛出异常，在调用方中处理
		B b = null;
		System.out.println(b.i);
	}
	
	int age;
	
	public void test1(int age) throws Exception {
		if(age >= 0 && age <= 150) {
			this.age = age;
			System.out.println("Age is: " + this.age);
		}else {//可以人工抛出异常
			throw new Exception("Age should be between 0 & 150");
		}
	}
}
```

![创建自定义异常类](java异常处理.resource\创建自定义异常类.PNG)![人工抛出异常](java异常处理.resource\人工抛出异常.PNG)

```java
public class Test1 {
	public static void main(String[] args) throws Exception{//可以继续抛出，但是main方法抛出的化就抛给JVM了，没有办法再处理
		B b = new B();
		try {
			//在代码这抛出的异常，在调用方去捕获处理
//			b.test1(-1);
			b.test2(-11);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

/*
day10.MyException: Age should be between 0 & 150
	at day10.B.test2(Test1.java:40)
	at day10.Test1.main(Test1.java:9)
*/
//test2()抛自定义的MyException异常了。
class B{
	int i;
	public void test() throws Exception{
		//可以使用throws在这抛出异常，在调用方中处理
		B b = null;
		System.out.println(b.i);
	}
	
	int age;
	
	public void test1(int age) throws Exception {
		if(age >= 0 && age <= 150) {
			this.age = age;
			System.out.println("Age is: " + this.age);
		}else {
			throw new MyException("Age should be between 0 & 150");
		}
	}
	
	public void test2(int age) throws MyException{
		if(age >= 0 && age <= 150) {
			this.age = age;
			System.out.println("Age is: " + this.age);
		}else {
			throw new MyException("Age should be between 0 & 150");
		}
	}
}

class MyException extends Exception{
	public MyException(String msg) {
		super(msg);
	}
}
```

Java提供的异常的类一般是够用的，只有特殊的情况可以需要自己编写异常类。

