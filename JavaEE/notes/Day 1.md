# Day 1

窗口键r，一起按下，输入cmd，可以打开dos界面

注意：在输入dos命令时，要用英文输入，所有标点都有是英文
d:
这冒号是英文

面向过程，例如张三打篮球，还有再做一个李四踢足球的程序？

面向对象，人的对象，人的运动的动作，运动的器械这三个对象，
1.实例化一个张三的对象，对象有一个打篮球的动作，器械是篮球
2.实例化一个李四的对象，对象有一个踢足球的动作，器械是足球

面向对象能够更好的在抽象的层面来分析问题，在程序实现上能够极大的复用之前的代码
这些是面向过程编程很难实现的

Java先编译，再解释

Java两种核心机制
	Java虚拟机（JVM）
	垃圾回收机制（GC）
	
C,C++，由程序员回收，手动编写代码回收（优点：能够在内存不使用时快速回收，准确高效；缺点：容易出现失误出现bug）
Java，垃圾回收是自动的，开了一个系统级线程自动去检测哪些内存不用了，然后回收掉。
优点：自动的，意味着不会出现忘记回收的
缺点：回收不及时

一般的观点是宁可回收不及时，但是一定要回收，使用自动的垃圾回收更合适。

jvm/jre/jdk的关系

![捕获](Day 1.resource\JDK JRE解释.PNG)

![JDK JRE JVM关系](Day 1.resource\JDK JRE JVM关系.PNG)

#### Helloworld程序

```java
public class Test{
	public static void main(String[] args)//
	{
		System.out.print("Hello world");
	}
}
```

运行规则

![第一个程序小结](Day 1.resource\第一个程序小结.png)

声明为public的类要和.java文件的名字一样。

![常见问题](Day 1.resource\常见问题.PNG)

**注释：**

![注释](Day 1.resource\注释.PNG)

作业代码：

![Day1 作业](Day 1.resource\Day1 作业.PNG)

```java
1.
public class HelloJava{
    public static void main(String[] args){
        //Main entrance
        System.out.println("HelloJava");
    }
}

//compile in cmdline:
javac HelloJava.java
//run
java HelloJava
```

![1584589867951](Day 1.resource\1584589867951.png)

```java
2.
public class Person{
    public static void main(String[] args){
        System.out.println("name:\tJane Doe");
        System.out.println("Sex:\tFemale");
        System.out.println("Addr:\tJingzhou Hubei Pro.");
    }
}
//compile in cmdline:
javac Person.java
//run
java Person
```

![1584590267960](Day 1.resource\1584590267960.png)

```java
3.
public class Picture{
	public static void main(String[] args){
        System.out.println("\t*\t\t\t\t\t*\t");
        System.out.println("*\t\t*\tI love Java\t*\t\t*");
        System.out.println("\t\t*\t\t\t*\t\t");
        System.out.println("\t\t\t*\t*\t\t\t");
        System.out.println("\t\t\t\t*\t\t\t");
    }   
}
```



