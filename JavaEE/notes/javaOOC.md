## 面向对象编程

### 类基础知识

#### 三条主线

1. java类及类的成员
2. 面向对象的三大特征
3. 其他关键字

![OOP,POP](javaOOC.resource\OOP,POP.PNG)

汽车设计图（零部件+运行）->类

实际的多辆汽车->对象

成员变量->零部件

成员方法->运行

**java类及类的成员**

Java代码由诸多不同的**类**构成。

- 属性：对应类中的成员变量
- 行为：对应类中的成员方法

Field = 属性 = 成员变量， Method = （成员）方法 = 函数

```java
class Person{
    String name;
    int age;
    boolean isMarried;
    //属性，或成员变量
    
    public void walk(){
        System.out.println("人走路...");
    }
    public String display(){
        return "名字是:"+name+",年龄是:"+age+",Married:"+isMarried;
    }
    //方法，或函数
}
```

![面向对象思想分析](javaOOC.resource\面向对象思想分析.PNG)

#### 类的语法格式

```java
/**
 *	人
 * @author pgy
 *
 */
public class Person{
    //属性，成员变量，类的成员变量可以先声明，不用初始化，类成员变量是有默认值的
    String name;	//姓名，String的默认值是null
    int age;		//年龄，int的默认值是0
    
    //行为，方法，也叫函数
    public void showName(){
        //方法的名称如果是多个单词的话，首个单词的首字母小写，其他的单词首字母大写，即驼峰命名法
        System.out.println("姓名："+name);
    }
    /**
     * 获取年龄
     * @return
     */
    public int getAge(){
        //如果是一个有返回值的方法，那么方法体的最后一行一定是返回相应的数据，使用return关键字
    	return age;
    }
}

/**
 *	动物
 * @author pgy
 *
 */
class Animal{
    String name;	//动物的名称
    int eyes;		//眼睛个数
    int legs;		//几条腿
    
    /**
 	 *	输出动物吃的东西
 	 * @param food 食物
 	 *
 	 */
    public void eat(String food){
        System.out.println("此种动物的食物是：" + food);
    }
    
    /**
 	 *	输出动物吃的东西
 	 * @param moveType 移动方式
 	 *
 	 */
    public void move(String moveType){
        System.out.println("此种动物的移动方式是：" + moveType);
    }
}
```

![定义类](javaOOC.resource\定义类.PNG)

![类成员 属性](javaOOC.resource\类成员 属性.PNG)![类的创建](javaOOC.resource\类的创建.PNG)

![类成员 属性](javaOOC.resource\类成员 属性.PNG)

private 私有的，只能在该类内部使用。

修饰符可以用来修饰变量，可以指明一个变量是公有的还是私有的，私有的类变量不能通过对象.属性的方式访问。

![变量区分](javaOOC.resource\变量区分.PNG)

实例变量就是说在类实例化成对象之后才能使用的

static，意思是静态的，这样的变量不需要类实例化成独享就可以使用，直接可以通过类名.属性这样的属性直接调用。

```java
public class Person1{
    public static String sex = "male";//可以通过Person1.sex访问
    
    {
        int i;//代码块局部变量
    }
    public static void main(String[] args){
        int j;//方法局部变量
    }
}
```

![代码块局部变量](javaOOC.resource\代码块局部变量.PNG)

**局部变量与成员属性的区别**

![变量补](javaOOC.resource\变量补.PNG)

#### 类方法

![类方法](javaOOC.resource\类方法.PNG)

![对象创建使用2](javaOOC.resource\对象创建使用2.PNG)

类有一个，通过类实例化出来的对象可以有多个，每个对象是独立的，互不干扰。

![方法定义](javaOOC.resource\方法定义.PNG)

![方法调用过程](javaOOC.resource\方法调用过程.PNG)

![方法的调用](javaOOC.resource\方法的调用.PNG)

同一个类中所有的方法可以直接互相调用，不用new去实例化对象。

#### 关于对象

![类成员变量初始化默认值](javaOOC.resource\类成员变量初始化默认值.PNG)

匿名对象：new了一个对象直接用。

e.g. new Student().showInfo();//用于这个对象以后不再使用的情况



![匿名对象](javaOOC.resource\匿名对象.PNG)

![提示](javaOOC.resource\提示.PNG)

![OOC实现一](javaOOC.resource\OOC实现一.PNG)

#### 方法的重载（overload）

![重载](javaOOC.resource\重载.PNG)

#### 可变个数的形参

```java
public class Person3{
    /* 用数组的方式来传递可变个数的参数
    public void printInfo(String[] args){
        for(int i = 0;i < args.length;i++)
            System.out.println(args[i]);
    }
    */
    //用java特有的...方式来传递可变个数的参数，这种参数在使用时与数组的使用方式相同（可通过下标形式访问
    public void printInfo1(String... args){
        for(int i = 0;i < args.length;i++)
            System.out.println(args[i]);
    }
}
```

![可变个数的形参](javaOOC.resource\可变个数的形参.PNG)

```java
//当传入的可变参数个数为0时，以上两种定义方法略有不同
new Person3().printInfo(null);//数组的话填null
new Person3().printInfo1();//...可以不填
```

#### 方法的参数传递

![形参实参](javaOOC.resource\形参实参.PNG)

##### JVM内存模型

![JVM内存模型](javaOOC.resource\JVM内存模型.PNG)

```java
Person p = new Person();
//p这个Person对象存在堆中，比如说p在堆中的地址是BE9500
//那么在栈中，存的是p的地址，比如这个地址存在栈中地址为AG84300的地方
//这就是引用对象的存储

int i = 1;
//基本数据类型的值保存在栈中
//引用对象，值保存在堆中，栈中存的对象是在堆中的地址
```

![JVM内存模型举例](javaOOC.resource\JVM内存模型举例.PNG)

##### 参数传递之基本数据类型

```java
public class TestTransfer{
    public static void swap(int i){
        i = 6;
        System.out.println("swap方法里，i的值是：" + i);//6
    }
    
    public static void main(String[] args){
        int a = 0;
        swap(a);
        System.out.println("main方法里，变量a的值是：" + a);//0
    }
} 
```

![基本数据类型的传递](javaOOC.resource\基本数据类型的传递.PNG)

##### 方法参数传递之引用类型

```java
public class DataSwap {
	public int a;
}

public class Test2 {
    public static void swap(DataSwap ds1){
        ds1.a = 6;
        System.out.println("调用swap方法之后，ds1.a的值是：" + ds1.a);//6
    }
    
    public static void main(String[] args){
        DataSwap ds = new DataSwap();
        System.out.println("调用swap方法之前ds.a的值是：" + ds.a);//0
        swap(ds);//0->6
    }
}
```

![引用对象传递](javaOOC.resource\引用对象传递.png)

在这个例子中，ds和ds1操作的是同一个对象。

方法的参数传递小结：

1. 如果方法的形参是基本数据类型，那么实参（实际的数据）向形参传递参数时，就是直接传递值，把实参的值复制给形参。
2. 如果方法的形参是对象，那么实参（实际的对象），向形参传递参数的同时，也是把值给形参，这个值是实参在栈内存中的值，也就是引用对象在堆内存中的地址。
3. 基本数据类型都是保存在栈内存中，引用对象在栈内存中保存的是引用对象的地址，那么方法的参数传递是传递值（变量在栈内存的当中的值）

#### 包package和import

在java中，包package的概念与文件夹类似，可以有多级，也就是包中可以有包和文件，多级的包使用的是.分割。

e.g. com包下的cn包下的test包 com.cn.test

同样的，包的存在也是为了解决文件太乱和重名的问题。

![package](javaOOC.resource\package.PNG)

import关键字

![import](javaOOC.resource\import.PNG)

import关键字补充

调用同一个包下的类，import可省略。

![JDLK中主要的包](javaOOC.resource\JDLK中主要的包.PNG)![import补](javaOOC.resource\import补.PNG)

### 封装和隐藏

![封装](javaOOC.resource\封装.PNG)

```java
public class Person {
	private int age;
	public void printAge() {
		System.out.println(age);
	}
	
	public void setAge(int a) {
		if(a>0 && a <150){
			age = a;
		}
		else {
			System.out.println("Invalid age");
		}
	}
}
```

![封装隐藏好处](javaOOC.resource\封装隐藏好处.PNG)

#### 四类访问权限修饰符

![访问权限修饰符](javaOOC.resource\访问权限修饰符.PNG)

修饰类成员变量和类成员函数是一样的。

对于类，在同一个java文件中可以写多个class，但是只有一个是public的，其他class只能是缺省的。

![调用关系](javaOOC.resource\调用关系.PNG)

#### 类的构造方法

```java
Person p = new Person();//new 对象的原理
//调用的是Person类中public Person()方法
//如果Person是public类的话
//否则对于缺省的类
class T0{
    T0(){}//默认的构造方法，是缺省的
}

public class T1{
	public T1(){}//默认的构造方法，public修饰
}

public class Person{
    public String name;
    public int age;
    
    public Person(){
        age = 5;
        name = "lisi";
    }//如果显式的定义了不带参数的构造方法没那么就会使用显式的构造，不会使用缺省的构造方法了。
    public Person(int a, String n){
        age = a;
        name = n;
    }//可以自己写带参数的构造方法
}
```

![构造器](javaOOC.resource\构造器.PNG)

new对象实际上就是调用类的构造方法。

构造器可以重载，具体的要求和函数重载相同。

#### 关键字this

![关键字this](javaOOC.resource\关键字this.PNG)

![this的用处](javaOOC.resource\this的用处.PNG)

![this的用处补](javaOOC.resource\this的用处补.PNG)

**使用this必须放在构造方法的首行**

**使用this调用本类中其他的构造器，保证至少有一个构造器是不用this的**（实际上就是不能出现构造器自己调用自己

#### JavaBean

![JavaBean](javaOOC.resource\JavaBean.PNG)

```java
//一个JavaBean
//私有的属性
//属性对应的get/set方法
//Person.java
public class Person{
    private String name; //年龄
    private int sex; //性别，0男，1女
    private int age; //年龄
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    
    public void setSex(int sex){
        this.sex = sex;
    }
    public int getSex(){
        return this.sex;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
}

//Test.java
public class Test{
    public static void main(String[] args){
        Person p = new Person();
        p.setName("zhangsan");
        p.setSex(0);
        p.setAge(20);
        System.out.println(p.getName());
        System.out.println(p.getSex());
        System.out.println(p.getAge());
    }
}
```

在Eclipse当中可以自动生成JavaBean

Source-》Generate Getters and Setters

![Eclipse当中生成JavaBean](javaOOC.resource\Eclipse当中生成JavaBean.PNG)

之后选中类成员变量就可以。

### 高级类特性1

#### 继承

![继承1](javaOOC.resource\继承1.PNG)

![继承2](javaOOC.resource\继承2.PNG)

![父子类的关系](javaOOC.resource\父子类的关系.PNG)

通过继承父类省掉重复代码。

子类的共性代码都是来源于父类。![继承之后类图](javaOOC.resource\继承之后类图.PNG)

![继承3](javaOOC.resource\继承3.PNG)

![继承4](javaOOC.resource\继承4.PNG)

继承是要有逻辑关系在其中的，不要随意继承。

比如不能写一个狗类，因为也有名字/性别/年龄等就继承Person类，逻辑上不对。

![继承5](javaOOC.resource\继承5.PNG)

#### 单继承与多层继承

![Java单继承](javaOOC.resource\Java单继承.PNG)

![单继承举例](javaOOC.resource\单继承举例.PNG)

每一子类只能有一个唯一的父类。

```java
//Circle.java
public class Circle {
	double radius;
	
	public Circle() {
		this.radius = 1;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double findArea() {
		return 3.14*this.radius*this.radius;
	}
}

//Cylinder.java
public class Cylinder extends Circle{
	double length;
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public Cylinder() {
		this.length = 1;
	}
	public double findVolume() {
		double area = this.findArea();
		return area*this.length;
	}
	
	public static void main(String[] args) {
		Cylinder c = new Cylinder();
		c.setLength(2);
		c.setRadius(2);
		System.out.println(c.findVolume());//25.12
	}
}
```

#### 方法的重写

![方法的重写](javaOOC.resource\方法的重写.PNG)

重写的方法如果在父类中是public，子类中也必须是，不能比父类中的访问权限更严格。

在子类中按Alt+/，可以选中要重写的方法

![快捷键重写](javaOOC.resource\快捷键重写.PNG)

![快捷键重写2](javaOOC.resource\快捷键重写2.PNG)

**注意重载和重写的区别**

方法的重载，一个类可以有多个同名方法

方法的重写，子类可以重新写父类的方法，覆盖父类的方法

![重写方法举例](javaOOC.resource\重写方法举例.PNG)

#### 父子类与访问修饰符之间的关系

- 如果子类和父类在同一个包下，那么对于父类的成员修饰符只要不是私有的private，那就都可以使用
- 如果子类和父类不在同一个包下，子类只能使用父类中protected和pubic修饰的成员

![访问控制父子类](javaOOC.resource\访问控制父子类.PNG)

#### 关键字super

![super](javaOOC.resource\super.PNG)

由于Java的多层继承

使用super，子类可以调用子类之上的所有父类层级。

**super练习题**

![练习super](javaOOC.resource\练习super.PNG)

```java
//1.
public class Kids extends ManKind{
    ...
    @Override
	public void employeed() {
		// TODO Auto-generated method stub
		super.employeed();
		System.out.println("But kids should study and no job");
	}
    ...
}

//2.
public class Cylinder extends Circle{
	double length;
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public Cylinder() {
		this.length = 1;
	}
	public double findVolume() {
		double area = super.findArea();
		return area*this.length;
	}
	
	@Override
	public double findArea() {
		return 2*3.14*this.radius*this.length;
	}
	
	public static void main(String[] args) {
		Cylinder c = new Cylinder();
		c.setLength(3);
		c.setRadius(4);
		System.out.println(c.findVolume());//150.72
		System.out.println(c.findArea());//75.36	
    }
}
```

**子类调用父类的构造器**

![子类调用父类构造器](javaOOC.resource\子类调用父类构造器.PNG)

```java
public class ManKind {

	int sex;
	int salary;
	public ManKind() {
		System.out.println("ManKind constructor");
	}
}

public class Kids extends ManKind{
	int yearsOld;

	public static void main(String[] args) {
		Kids someKid = new Kids();//打印ManKind constructor
	}
}
```

#### this和super的区别

![super与this的区别](javaOOC.resource\super与this的区别.PNG)

#### Java类的实例化过程

1. 简单类对象实例化过程

   ![简单类对象实例化过程](javaOOC.resource\简单类对象实例化过程.PNG)

2. 子类对象的实例化过程

   **注：显式初始化**

   ![子类对象实例化过程](javaOOC.resource\子类对象实例化过程.PNG)

#### 多态性

![多态性](javaOOC.resource\多态性.PNG)

![多态2](javaOOC.resource\多态2.PNG)

```java
//1.
Person p = new Person();
Student s = new Student();
//以上是正常情况

//2.
Person e = new Student(); //父类的引用对象可以指向子类的实例

//3.
Person p1 = new Person();
p1 = new Student();//当前这个引用对象p1引用的是Student对象
//经过测试，p1不能访问到子类中有但是父类没有的成员变量，可以访问到子类中重写的父类有的成员方法（按子类中该方法的逻辑执行，不能访问到子类中有但是父类没有的成员方法。
//e.g.
//Person.java
public class Person {

	public String name;
	public int sex;
	public int age;
	
	public void showInfo() {
		System.out.println(this.name);
		System.out.println(this.sex);
		System.out.println(this.age);
	}
	
	public void setInfo(int age, String name, int sex) {
		this.age = age;
		this.name = name;
		this.sex = sex;
	}
}

//Student.java
public class Student extends Person{
	private String school;

	@Override
	public void showInfo() {
		System.out.println("Override showInfo() below");
		super.showInfo();
		System.out.println(this.school);
	}
	
	@Override
	public void setInfo(int age, String name, int sex) {
		// TODO Auto-generated method stub
		super.setInfo(age, name, sex);
		this.school = "ZJU";
	}
	
	public void test() {
		System.out.println("super class can't access this function");
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		
		Person p = new Student();
		p.setInfo(0, "zhangsan", 1);
		p.showInfo();
        //调用Student子类的showInfo()方法
        /*
            Override showInfo() below
            zhangsan
            1
            0
            ZJU
        */
        p.school = "PKU";//报错，访问不到
        s.school = "PKU";//不报错
		p.test();//报错，访问不到
		s.test();//不报错		
	}
}
```

![父类子类转型过程](javaOOC.resource\父类子类转型过程.PNG)

**向上转型**：可以把子类的对象给父类的类型变量引用。

以上的例子当中体现以下两个重点。

1. ![多态3](javaOOC.resource\多态3.PNG)
2. ![虚拟方法调用](javaOOC.resource\虚拟方法调用.PNG)

![动态绑定详解](javaOOC.resource\动态绑定详解.PNG)

**多态小结**

![多态小结1](javaOOC.resource\多态小结1.PNG)

![多态小结2](javaOOC.resource\多态小结2.png)

**如果子类没有重写父类的方法，那么子类就是直接使用父类的方法，如果重写了，就使用子类重写的**

**比如父类Person的成员变量中定义了int age，那么在子类中也定义一个成员变量为int age，这个不会产生覆盖。**

![多态性应用举例](javaOOC.resource\多态性应用举例.PNG)

#### instanceof操作符

![instanceof](javaOOC.resource\instanceof.PNG)

就是检验某个对象是不是A的子类（或者本身的类）

#### Object类

![Object类](javaOOC.resource\Object类.png)

```java
public class Test{
    /**
     * 问题，想给test方法设置一个形参参数，这个参数不确定到底传进来一个什么类
     * 可以确定的是传递实参一定会是一个类，那么test方法的形参要设置一个什么类型？
     */
    public void test(Object obj){
		
    }
    public static void main(String[] args){
        Test t = new Test();
        Person p = new Person();
        Student s = new Student();
        t.test(p);
        t.test(s);
        t.test(new Kk());
        //以上都可以传，因为Object是所有类的基类
    }
}
```

**Object类中主要方法**

![Object类主要方法](javaOOC.resource\Object类主要方法.PNG)

```java
public class Test{
    /**
     * 问题，想给test方法设置一个形参参数，这个参数不确定到底传进来一个什么类
     * 可以确定的是传递实参一定会是一个类，那么test方法的形参要设置一个什么类型？
     */
    public void test(Object obj){
		
    }
    
    public static void main(String[] args){
        Test t = new Test();
        Person p = new Person();
        Student s = new Student();
        t.test(p);
        t.test(s);
        t.test(new Kk());
        //以上都可以传，因为Object是所有类的基类
        
        Person e = new Person();
        System.out.println(p.equals(e));//false
        //堆中有两个Person对象
    }
}
```

![equals解释](javaOOC.resource\equals解释.PNG)

```java
public class Test{
    /**
     * 问题，想给test方法设置一个形参参数，这个参数不确定到底传进来一个什么类
     * 可以确定的是传递实参一定会是一个类，那么test方法的形参要设置一个什么类型？
     */
    public void test(Object obj){
		
    }
    
    public static void main(String[] args){
        Test t = new Test();
        Person p = new Person();
        Student s = new Student();
        t.test(p);
        t.test(s);
        t.test(new Kk());
        //以上都可以传，因为Object是所有类的基类
        
        Person e = new Person();
        e = p;
        System.out.println(p.equals(e));//true
        //堆中有两个Person对象
    }
}
```

![equals解释2](javaOOC.resource\equals解释2.PNG)

为什么p对象可以执行Object的equals()方法？

​	子类可以执行父类的方法，所以Person类的对象可以执行Object类的方法。

#### 对象类型转换

![对象类型转换](javaOOC.resource\对象类型转换.PNG)

```java
long l = 10l;
int i = (int)l;//强制类型转换

Student s = new Student();
Person p = s;//子类的类型赋给父类的变量，可以自动进行

Person p1 = new Person();
Student s = (Student)p1;//父类-》子类，必须进行强制类型转换

Test t1 = new Test();
Person p2 = t1;//报错，非法操作，完全不能做，这两个类没有父子关系
/*以上的代码在编译时不会报错，运行时会报错java.lang.ClassCastException
原因：

我们刚才说从父类到子类的强制类型转换并不总是能够成功，那什么时候不能成功呢？
 
在于这个的对象的真实类型，也就是它是使用什么类的构造方法构造出来的。如果它本身就是父类的类型，那么强制类型转换是不会成功的。
 
还是举个例子：
FatherClass f = new FatherClass();
SonClass s = (SonClass)f; //这时候就会报错，运行时报错，编译能通过的
 
编译器只检查类型之间有无继承关系，有则通过；运行时检查真正类型，是则通过
 
结论：只有父类对象本身就是用子类new出来的时候, 才可以在将来被强制转换为子类对象
*/

//Object是所有类的最高父类
String s = "hello";
Object obj = s;//可以进行
System.out.println(obj);//hello

Object obj1 = "hello";
String s1 = (String) obj1;
System.out.println(s1);//hello
```

#### ==与equals

```java
int i = 3;
System.out.println(i==3);//true

Person p1 = new Person();
Person p2 = new Person();
System.out.println(p1==p2);//false,p1与p2指向不同的对象
System.out.println(p1.equals(p2));//此时相同于==
Person p3 = p2;
System.out.println(p2==p3);//true,p2与p3指向同一个对象

Test t = new Test();
System.out.println(p1 == t);//编译时报错，因为Test类和Person类之间一点关系都没有
//即用==进行比较时，符号两边的数据类型必须兼容

String s1 = new String("abc");
String s2 = new String("abc");
System.out.println(s1 == s2);//false 是两个String对象
System.out.println(s1.equals(s2));//true,类型/内容相同
//对于对象来说：
//特殊的类，如String/File/Date，使用==比较的是对象（对象的地址）
//equals比较的内容
//除了特殊的类之外的其他普通的类的对象，==和equals比较的都是对象（对象的内存地址）
//如果你想改变某一个类的equals，不想用equals来比较对象的内存地址，就需要重写equals方法
```

![==与equals方法1](javaOOC.resource\==与equals方法1.PNG)

![equals方法](javaOOC.resource\equals方法.png)

String对象的创建

 ![String变量的创建](javaOOC.resource\String变量的创建.PNG)

```java
String s1 = new String("abc");
String s2 = "abc";
System.out.println(s1==s2);//false，对象的内存地址和常量池中的字符串不相等
//用字面量创建对象的时候，只在常量池创建一个对象
//new的时候，常量池有对象，堆中也要有对象
//字面量方法要比new省内存
//==是比较对象的内存地址
//equals，对于String是比较内容（值）
```

![==与equals练习](javaOOC.resource\==与equals练习.PNG)

![equals练习](javaOOC.resource\equals练习.PNG)

```java
public class Order {
	public int orderId;
	public String OrderName;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderName() {
		return OrderName;
	}
	public void setOrderName(String orderName) {
		OrderName = orderName;
	}
	public Order(int orderId,String OrderName) {
		this.orderId = orderId;
		this.OrderName = OrderName;
	}
	@Override
	public boolean equals(Object obj) {
		boolean flag = false;
		if(obj instanceof Order) {
			Order o = (Order) obj;
			if(this.orderId == o.orderId && this.OrderName.equals(o.OrderName)) {
				flag = true;
			}
		}
		return flag;
	}
    
    	public static void main(String[] args) {
		
		Order o1 = new Order(1,"o1");
		Order o2 = new Order(2,"o2");
		System.out.println(o1.equals(o2));//false
		
		o2.setOrderId(o1.getOrderId());
		o2.setOrderName(o1.getOrderName());
		System.out.println(o1.equals(o2));//true
		
	}
}
```

#### 包装类（wrapper）

![包装类](javaOOC.resource\包装类.PNG)

![包装类装箱拆箱](javaOOC.resource\包装类装箱拆箱.png)

```java
Integer i1 = new Integer(111);//111
Integer i2 = new Integer("123");//123
Integer i3 = new Integer("abc");//编译不报错，运行时报错,java.lang.NumberFormatException

Integer i4 = new Integer(112);
int i0 = i4.intValue();
System.out.println(i0);//112

boolean b = new Boolean("false").booleanValue();
//boolean b = new Boolean("false");
//Boolean b0 = false;
System.out.println(b);//false

//在Jdk1.5之后可以自动装箱拆箱
Integer i5 = 112;//自动装箱
int i6 = i5;//自动拆箱
int i7 = new Integer(112);//也可以

int i8 = Integer.parseInt("123");//字符串转换成整数类型
float f = Float.parseFloat("0.40");
boolean b1 = Boolean.parseBoolean("true");

String istr = String.valueOf(i8);
String fstr = String.valueOf(f);
String bstr = String.valueOf(b1);
System.out.println(istr+" "+fstr+" "+bstr);//123 0.4 true
```

主要应用：

基本数据类的包装类实现基本数据类型与字符串直接的转化

**Object类中的toString()方法**

```java
Test t = new Test();
System.out.println(t.toString());//day08.Test@15db9742
//父类的Object的toString()方法就是输出当前对象的内存地址
//如果要输出类的其他信息，就要重写toString()方法
System.out.println(t);//day08.Test@15db9742
//直接输出t对象也是一样，就相当于打印t.toString()，这个在其他对象也是如此。

//如果在Test类中重写了toString()方法
public class Test(){
    ...
   	public String toString() {
		return "Test rewrite the toString() method";
	}
    public static void main(String[] args){
        Test t = new Test();
		System.out.println(t.toString());//"Test rewrite the toString() method"
		System.out.println(t);//"Test rewrite the toString() method"
    }
    ...
}	
@Override
	public String toString() {
		return "Test rewrite the toString() method";
	}
```

### 高级类特性2

#### 关键字static

![static](javaOOC.resource\static.png)

```java
public class Chinese {
	static String country;
    //类变量不用实例化，直接类名.属性名就可以使用，是类的一部分，被所有这个类实例化对象所共享，也可以叫做静态变量
	String name;
	int age;
    //实例变量，只有实例化之后才可以使用，属于实例化对象的一部分，不能共用
	public static void main(String[] args) {
		Chinese.country = "China";
		Chinese c = new Chinese();
		c.name = "zhangsan";
		c.age = 11;
		Chinese c1 = new Chinese();
		c1.name = "lisi";
		c1.age = 12;
		System.out.println(c.country);
		System.out.println(c1.country);
		System.out.println(Chinese.country);
		System.out.println(Chinese.class);
	}
}
```

![static修饰变量](javaOOC.resource\static修饰变量.PNG)

static可以修饰类的成员变量也可修饰类的成员方法

```java
public class Chinese {
	static String country;
	String name;
	int age;
	public static void test() {
		System.out.println("This is a static method");
	}
	public static void main(String[] args) {
		Chinese.test();//This is a static method
	}
}
```

![类属性 方法的设计思想](javaOOC.resource\类属性 方法的设计思想.PNG)

类方法，也就是静态方法用得较多。

![定义判断字符串是否不为空的工具类1](javaOOC.resource\定义判断字符串是否不为空的工具类1.PNG)

![定义判断字符串是否不为空的工具类2](javaOOC.resource\定义判断字符串是否不为空的工具类2.PNG)

```java
//使用
String s = "ll";
System.out.println(Utils.isEmpty(s));//true这里可能是反的，不空返回true了。
```

![static2](javaOOC.resource\static2.PNG)

1. 类加载以后，静态方法或者属性就可以使用了。
2. 不用new就能用
3. 访问权限是指static的成员变量或者方法之前的修饰符是public/protected/private，一般static类型的都是public的。

![static3](javaOOC.resource\static3.PNG)

类变量，这种可以被所有的实例化对象共享的属性，使用起来要慎重，因为只要一改，所有类对象都能得到变化。

类方法，做工具类用的最多。

![类方法注意点](javaOOC.resource\类方法注意点.PNG)

#### 单例设计模式

![设计模式与单例设计模式](javaOOC.resource\设计模式与单例设计模式.PNG)

- 设计模式就是在我们实际编程过程中，逐渐总结出的一些解决问题的套路
- 单例（singleton）设计模式就是只有一个实例（实例化对象），即在整个软件系统运行过程中，这个类制备实例化一次，以后不论在哪都只调用这一个实例
  - 例如实例化对象的创建要消耗大量的时间和资源
- 使用单例模式解决什么问题？
  - new新对象太费劲
  - 频频的new新的对象没有必要

**单例设计模式两种实现方式**

1. 饿汉式

   ![单例模式饿汉式](javaOOC.resource\单例模式饿汉式.PNG)

   ```java
   /**
    * Single.java
    * 饿汉式的单例模式
    * @author Administrator
    *
    */
   public class Single {
   //	public Single() {
   //		//假设构造中执行1000行代码，要消耗很大的资源，耗时10秒
   //		//每一次new Single()需要10秒
   //		//这种情况适合于单例设计模式
   //	}
   	//饿汉式，先new出一个对象来，来了就能吃（传这个对象出去）
   	
   	//私有的构造，构造方法私有化，调用这个类的类就不能直接使用new来创建对象了
   	private Single() {}
   	
   	//私有的Single类型的类变量
   	private static Single single = new Single();
   	
   	public static Single getInstance() {
   		return single;
   	}
   }
   
   //Test.java
   public class Test{
       public static void main(String[] args){
           //Single s = new Single();//报错，Single对象的构造函数不可在别的类中使用
          	Single s1 = Single.getInstance();
   		Single s2 = Single.getInstance();
   		Single s3 = Single.getInstance();
   		Single s4 = Single.getInstance();
           //s1,s2,s3,s4全是同一个对象，是Single类中的静态变量single(调用之前就存在)
       }
   }
   ```

   ![饿汉式单例](javaOOC.resource\饿汉式单例.PNG)

2. 懒汉式

![懒汉式单例](javaOOC.resource\懒汉式单例.PNG)

**与饿汉式的区别就是对象什么时候创建。**

```java
/**
 * Single1.java
 * 懒汉式的单例模式
 * @author Administrator
 *
 */
public class Single1 {
	//私有的构造，构造方法私有化，调用这个类的类就不能直接使用new来创建对象了
	private Single1() {}
	
	//私有的Single类型的类变量声明，先为null，暂时不创建类对象
	private static Single1 single1 = null;
	
	//第一个调用getInstance()方法的时候会new对象
	public static Single1 getInstance() {
		if(single1 == null)
			single1 = new Single1();
		return single1;
	}
}

//Test.java
public class Test{
    public static void main(String[] args){
        //Single s = new Single1();//报错，Single1对象的构造函数不可在别的类中使用
        Single1 s = Single1.getInstance();//执行new Singleq1();
       	Single1 s1 = Single1.getInstance();
		Single1 s2 = Single1.getInstance();
		Single1 s3 = Single1.getInstance();
		Single1 s4 = Single1.getInstance();
        //s1,s2,s3,s4全是同一个对象，是Single1类中的静态变量single1(调用之前就存在，因为s的调用产生)
    }
}
```

**单例模式小结**

![单例模式小结](javaOOC.resource\单例模式小结.PNG)

**单例模式举例**（饿汉式）

![单例模式举例饿汉式](javaOOC.resource\单例模式举例饿汉式.PNG)

#### 理解main方法的语法

![main方法的语法](javaOOC.resource\main方法的语法.PNG)

```java
public class TestMain {
	public static void main(String[] args) {
		for(int i = 0 ; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
}
```

![传String[]args参数](javaOOC.resource\传String[]args参数.png)

#### 代码块

在类中直接写一个{code}/static{code}，就是代码块

![初始化块](javaOOC.resource\初始化块.PNG)

- 非静态代码块

```java
//Person.java
public class Person {
	String name;
    int age = 1;
	public Person() {
		this.name = "zhangsan";
		System.out.println("Person constructor");
		System.out.println(this.name);
	}
	
	//非静态的代码块
	{
		System.out.println("nonstatic code segment executed");
		System.out.println(this.name);
        System.out.println(this.age);
		System.out.println("---------");
	}
}

//Test.java
public class Test {
	public static void main(String[] args) {
		new Person();
	}
}

//result:
/*
nonstatic code segment executed
null
1
---------
Person constructor
zhangsan
*/

//在new Person()执行的时候：
//1.类的属性的默认初始化和显式初始化
//2.执行代码块的代码
//3.执行构造器的代码
```

```java
public class Person {
	String name;
    int age = 1;
	public Person() {
		this.name = "zhangsan";
		System.out.println("Person constructor");
		System.out.println(this.name);
	}
	
	//非静态的代码块
	{
		System.out.println("code 1");
		System.out.println("---------");
	}
	
	//非静态的代码块
	{
		System.out.println("code 2");
		System.out.println("---------");
	}
	
	//非静态的代码块
	{
		System.out.println("code 3");
		System.out.println("---------");
	}
}

//Test.java
public class Test {
	public static void main(String[] args) {
		new Person();
	}
}

//result:
/*
code 1
---------
code 2
---------
code 3
---------
Person constructor
zhangsan
*/
//如果有多个静态代码块则按照程序编写顺序执行
```

- 静态代码块

![静态代码块](javaOOC.resource\静态代码块.PNG)

静态代码块中只能使用静态static修饰的属性和方法

```java
//Person.java
public class Person {
	String name;
    static int age;
	public Person() {
		this.name = "zhangsan";
	}
	
	//非静态的代码块
	{
		System.out.println("code 1");
		System.out.println("---------");
	}
	
	//非静态的代码块
	{
		System.out.println("code 2");
		System.out.println("---------");
	}
	
	//静态代码块
	static {
		//只能使用静态static修饰的属性和方法
		age = 1;
		showAge();
	}
	public static void showAge() {
		System.out.println(age);
		System.out.println("===static code===");
	}
}

//Test.java
public class Test {
	public static void main(String[] args) {
		new Person();
		new Person();
	}
}

//result:
/*
1
===static code===
code 1
---------
code 2
---------
code 1
---------
code 2
---------
*/
//在程序运行过程中，非静态代码块每次new对象都要执行，静态代码块只执行一次，而且在所有非静态代码块之前执行
```

**代码块小结**

![初始化块小结](javaOOC.resource\初始化块小结.PNG)

在实际开发中，static静态代码用的会多一些，用在初始化类的静态属性（static类型的属性）。

```java
//TestPerson.java
public class TestPerson {
	int age;
	String name;
}

//Person.java
public class Person {
	String name;
    static int age;
    static TestPerson tp = new TestPerson();
	public Person() {
		this.name = "zhangsan";
	}
	
	//非静态的代码块
	{
		System.out.println("code 1");
		System.out.println("---------");
	}
	
	//静态代码块
	static {
		//只能使用静态static修饰的属性和方法
		//多用来初始化类的静态变量
		age = 1;
		showAge();
		tp.age = 1;
		tp.name = "ABC";
	}
	public static void showAge() {
		System.out.println(age);
		System.out.println("===static code===");
	}
	
	public void test() {
		System.out.println("Person Test()");
	}
    
    //Test.java
    public class Test {
	public static void main(String[] args) {
//		new Person();
//		new Person();
		//匿名内部类
		Person p = new Person() {
			@Override
			public void test() {
				// TODO Auto-generated method stub
				super.test();
				//这是一个重写
			}
		};//构建了没有类名的Person子类，即匿名的Person子类
		//这种类没有类名，就不能用显式的new创建对象
		//要是还要再构造器中初始化属性就没有办法，这样的话就需要用代码块做初始化工作
		
		System.out.println(p.name);
        p.test();
        /*result:
        1
        ===static code===
        code 1
        ---------
        code 2
        ---------
        zhangsan
        Person Test()
        */
        //p.name是zhangsan是因为在Person的构造方法中this.name赋值为zhangsan了。
	}
}
    
//Test1.java
public class Test1 {
	public static void main(String[] args) {
//		new Person();
//		new Person();
		//匿名内部类
		Person p = new Person() {
			//问题？现在想把name改成lisi，但是不想动Person的代码
			{
				//用代码块代替构造方法
				super.name = "lisi";
			}
			@Override
			public void test() {
				System.out.println("====");
				//这是一个重写
			}
		};//构建了没有类名的Person子类，即匿名的Person子类
		//这种类没有类名，就不能用显式的new创建对象
		//要是还要再构造器中初始化属性就没有办法，这样的话就需要用代码块做初始化工作
		
		System.out.println(p.name);
        p.test();
                /*result:
        1
        ===static code===
        code 1
        ---------
        code 2
        ---------
        lisi
        ====
        */
        //p.name是lisi是因为在new这个匿名对象的时候执行了代码块中的语句。
        //即在匿名类中用代码块代替构造方法
	}
}
```

Java除了老的版本中的东西以外，其他现存的这些东西都是有作用的，而且是在某一个方向上有不可替代的作用。

#### 关键字final

![final](javaOOC.resource\final.PNG)

![final类不可以被继承](javaOOC.resource\final类不可以被继承.png)

![final修饰方法不能重写](javaOOC.resource\final修饰方法不能重写.PNG)

```java
final String NAME = "";//final修饰的变量是常量，常量必须显式赋值
//NAME ="abc"//非法。常量只能赋值一次
final static String NAME_1 = "";//final static修饰的变量是全局常量
//常量定义名称约定使用大写，如果多个单个组成名称用_连接
```

#### 抽象类（abstract class）

![抽象类](javaOOC.resource\抽象类.PNG)

Animal类中move()是写不出来的，因为无法描述，范围太大。

所以动物类和其方法都是抽象化处理![抽象类2](javaOOC.resource\抽象类2.PNG)，就是不写具体的实现，在子类中去重写。

只要类中有一个抽象的方法，那么这个就必须是一个抽象类。

```java
public abstract class Animal {
	public abstract void test(); //只要类中有一个抽象的方法，那么这个就必须是一个抽象类
	public abstract void move();
}

class Dog extends Animal{

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move() {
		System.out.println("Dog runs");
		
	}
	
}

class Fish extends Animal{

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Fish swims");
	}
	
}

abstract class Bird extends Animal{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Bird flies");
	}
	
	public abstract void test();//只要类中有一个抽象的方法，那么这个就必须是一个抽象类，抽象类也可以作为子类存在
}
```

![抽象类应用](javaOOC.resource\抽象类应用.PNG)

![抽象类解决方法](javaOOC.resource\抽象类解决方法.PNG)

![抽象类思考](javaOOC.resource\抽象类思考.PNG)

final是最终，它修饰的类是最终的类，不能被继承

abstrat是抽象，如果想要使用，必须继承抽象类，实现那些抽象的方法

```java
//Employee.java
public abstract class Employee {
	public Employee() {}
	String name;
	int id;
	double salary;
	
	public abstract void work();
}

class CommonEmployee extends Employee{
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("This is a common employee");
	}
	
	public void setCommonEmployeeInfo(int id, String name, double salary) {
		super.id = id;
		super.name = name;
		super.salary = salary;
	}
	
	public void getCommonEmployeeInfo() {
		System.out.println(super.id);
		System.out.println(super.name);
		System.out.println(super.salary);
	}
}

class Manager extends Employee{
	double bonus;
	
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("This is a manager");
	}
	
	public void setManagerInfo(int id, String name, double salary,double bonus) {
		super.id = id;
		super.name = name;
		super.salary = salary;
		this.bonus = bonus;
	}
	
	public void getManagerInfo() {
		System.out.println(super.id);
		System.out.println(super.name);
		System.out.println(super.salary);
		System.out.println(this.bonus);
	}
}

//Test.java
public class Test{
    public static void main(String[] args){
        CommonEmployee ce = new CommonEmployee();
		ce.work();
		ce.setCommonEmployeeInfo(0, "lisi", 123.33);
		ce.getCommonEmployeeInfo();
    }
}

/*
This is a common employee
0
lisi
123.33
*/
```

#### 模板方法设计模式（TemplateMethod）

![模板方法设计模式](javaOOC.resource\模板方法设计模式.PNG)

抽象类就像一个大纲，里面的抽象方法就是每个章节的标题

子类，去根据这些标题把每个章节写出。

![模板方法举例](javaOOC.resource\模板方法举例.PNG)

```java
//Template.java
public abstract class Template {
	public abstract void code();
	public final void getTime() {
		long start = System.currentTimeMillis();
		code();
		long end = System.currentTimeMillis();
		System.out.println("code executed for:" + (end-start));
	}
}

class TestTmp extends Template{
	@Override
	public void code() {
		int k = 0;
		// TODO Auto-generated method stub
		for(int i =0 ;i<500000;i++) {
			k+=i;
		}
		System.out.println(k);
	}
}

//Test.java
public class Test{
    public static void main(String[] args){
		TestTmp tt= new TestTmp();
		tt.getTime();
    }
}
/*
445698416
code executed for:4
*/
```

#### 接口Interface

![接口](javaOOC.resource\接口.PNG)

![接口2](javaOOC.resource\接口2.PNG)

```java
//1.
public interface TestIn {
	int ID = 1; //等同于public static final ID = 1;
	void test();//等同于public abstract void test()
}
//2.
public interface TestIn1 {
	void test1();
}
//3.
public interface TestIn2 extends TestIn1{

}
//4.
/**
 * 子类继承父类，只能继承一个父类
 * 类可以实现多个接口，多个接口用','分隔
 * @author Administrator
 *
 */
public class TestInImpl implements TestIn,TestIn1{
	@Override
	public void test() {
		// TODO Auto-generated method stub
		//TestIn
	}
	@Override
	public void test1() {
		// TODO Auto-generated method stub
		//TestIn1
	}	
}
//5.
//如果一个没有实现接口中的所有方法，仍为抽象类
public abstract class TestInImpl1 implements TestIn{

}
//6.
//如果又有继承又有实现接口，先继承后实现接口
public class TestInImpl3 extends Person implements TestIn,TestIn1{

	@Override
	public void test1() {
		
	}
	@Override
	public void test() {
		
	}
}
```

![接口3](javaOOC.resource\接口3.PNG)

**问题：接口和抽象类很相似，似乎接口能做的事用抽象类能做，有什么区别？**

![接口4](javaOOC.resource\接口4.PNG)

![接口5](javaOOC.resource\接口5.PNG)

Cook继承Singer从逻辑上讲是不对的。反之亦然。

接口是一系列动作的集合，实现接口可以认为是实现了什么动作。

![接口6](javaOOC.resource\接口6.PNG)

```java
//1.
public interface Cook {
	void fry();
}
//2.
public interface Singer {
	void singing();
}
//3.
public abstract class Person1 {
	int age;
	String name;
	int sex;
	
	public abstract void showInfo();
}
//4.
public class SCTeacher extends Person1 implements Cook,Singer{

	String course; //教的科目
	@Override
	public void singing() {
		// TODO Auto-generated method stub
		System.out.println(super.name + "老师擅长美声");
	}

	@Override
	public void fry() {
		// TODO Auto-generated method stub
		System.out.println(super.name + "老师拿手的厨艺是粤菜");
	}

	public void setInfo() {
		super.name = "王富贵";
		super.age = 30;
		super.sex = 1;
		this.course = "math";
	}
	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("会唱歌的厨子的老师的信息是：");
		System.out.println(super.name);
		System.out.println(super.age);
		System.out.println(super.sex);
		System.out.println(this.course);
	}
	public static void main(String[] args) {
		SCTeacher sct = new SCTeacher();
		sct.setInfo();
		sct.showInfo();
		sct.fry();
		sct.singing();
	}
}

/*
会唱歌的厨子的老师的信息是：
王富贵
30
1
math
王富贵老师拿手的厨艺是粤菜
王富贵老师擅长美声
*/
```

![接口7](javaOOC.resource\接口7.PNG)

```java
//Cook.java
public interface Cook {
	String DISH = "Chinese food";
	void fry();
}

//Test.java
...
//用接口接收对象，可以体系对象多态
Cook c = new SCTeacher();
c.fry();
System.out.println(c.DISH);//Chinese food
//只能访问与这个Cook接口有关的变量和方法
//null老师拿手的厨艺是粤菜
Singer s = new SCTeacher();
s.singing();
System.out.println(s.DISH);//非法，访问不到
//只能访问与这个Singer接口有关的变量和方法
//null老师擅长美声
...
```

![接口8](javaOOC.resource\接口8.PNG)

#### 工厂方法（FactoryMethod）

![工厂模式](javaOOC.resource\工厂模式.PNG)

在真正的开发工作中，都是合作开发，每个开发人员写部分代码，大家集合在一起就是一个项目。

![工厂方法举例](javaOOC.resource\工厂方法举例.PNG)

```java
//开发人员A
//1.BWM.java
/**
 * 宝马车产品接口
 * @author Administrator
 *
 */

public interface BWM {
	//产品的信息介绍
	//车的发动方式
	void showInfo();
}

/**
 * 构建具体的车系
 * @author Administrator
 *
 */
class BWM3i implements BWM{
	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("BWM3");
	}
}
class BWM5 implements BWM{
	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("BWM5");
	}
}
class BWM7 implements BWM{
	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("BWM7");
	}
}

//2.BWMFactory.java
/**
 * 汽车生产工厂接口
 * @author Administrator
 *
 */
public interface BWMFactory {
	BWM productBWM();
}

class BWMFactory3 implements BWMFactory{
	@Override
	public BWM productBWM() {
		// TODO Auto-generated method stub
		System.out.println("Produce BWM3");
        System.out.println("Transform BWM3 to BWM3i"); 
		return new BWM3i();
	}
}

class BWMFactory5 implements BWMFactory{
	@Override
	public BWM productBWM() {
		// TODO Auto-generated method stub
		System.out.println("Produce BWM5");
		return new BWM5();
	}
}

class BWMFactory7 implements BWMFactory{
	@Override
	public BWM productBWM() {
		// TODO Auto-generated method stub
		System.out.println("Produce BWM7");
		return new BWM7();
	}
}

//开发人员B
//Test2.java

public class Test2 {
	//开发人员B的工作
	public static void main(String[] args) {
		BWM b3 = new BWMFactory3().productBWM();//改成BWM3i也不影响这里用BWM接受b3
        b3.showInfo();
		BWM b5 = new BWMFactory5().productBWM();
        b5.showInfo();
		BWM b7 = new BWMFactory7().productBWM();	
		b7.showInfo();
	}
}

/*
Produce BWM3
Transform BWM3 to BWM3i
BWM3
Produce BWM5
BWM5
Produce BWM7
BWM7
*/
//通过工厂把new对象给隔离，通过产品的接口接受不同实际产品的实现类，实例的类名的改变不影响其他合作开发人员的编程。
```

#### 内部类

![内部类](javaOOC.resource\内部类.PNG)

内部类，一个类的内部可以再写一个类。

```java
public class Test3 {
	int i;
	public int z;
	private int k;
	class A{
		int i;//这个i是A内部的i
		public void setTest3Fields() {
			Test3.this.i = 1;
			Test3.this.k = 3;
			Test3.this.z = 2;
		}
		
		public void set() {
			this.i = 10;
		}
	}
	static class B{
		
	}
	
	abstract class C{
		
	}
	
	class D extends C{
		
	}
	
	public void setInfo() {
		new A().setTest3Fields();
	}
	
	public void showInfo() {
		System.out.println(this.i + " " + this.k + " " + this.z);//外部类要用自己的内部类的方法，要先new内部类的对象
        //1 3 2
	}
	
	public static void main(String[] args) {
		Test3 t = new Test3();
		t.setInfo();
		t.showInfo();
	}
}
```

![内部类特性](javaOOC.resource\内部类特性.PNG)

**内部类主要是解决Java不能多重继承的问题。**

```java
public class Test4 {
	public static void main(String[] args) {
		A a = new A();
		a.testB();
		a.testC();
		//变相的同时重写了testB()和testC()
	}
}
/**
 * 现在类A想同时获得类B和类C的方法并且重写，不能同时继承B，C两个类
 * 可以使用内部类来变相的实现类的多重继承，可以同时继承多个类
 * @author Administrator
 *
 */
class A{
	public void testB() {
		new InnerB().testB();
	}
	
	public void testC() {
		new InnerC().testC();
	}
	
	private class InnerB extends B{
		@Override
		public void testB() {
			System.out.println("rewrites testB()");
		}
	}
	
	private class InnerC extends C{
		@Override
		public void testC() {
			System.out.println("rewrites testC()");
		}
	}
}

class B{
	public void testB() {
		
	}
}

class C{
	public void testC() {
		
	}
}

/*
rewrites testB()
rewrites testC()
*/
```

## 面向对象内容总结

![面向对象总结](javaOOC.resource\面向对象总结.PNG)

