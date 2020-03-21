



### java关键字与保留字

1、关键字：就是在Java语言编程的时候，在关键的地方使用的单词，体现关键地方的含义，这些单词都是事先定义好的。

![关键字](Day 2.resource\关键字.PNG)

![关键字2](Day 2.resource\关键字2.PNG)

2、保留字

可能在以后被用来作为关键字的单词，java已经把这些单词预定了，这些单词尽量不要在编程中去随意使用。

![1584591018701](Day 2.resource\1584591018701.png)

### 标识符与命名规范

![标识符](Day 2.resource\标识符.PNG)

不可以单独使用关键字、保留字但是可以包含，比如class1,goto1...

![命名规范](Day 2.resource\命名规范.PNG)

### 变量

java中定义的变量的定义：数据类型 变量名 = 变量的值， 例如：int i = 1

![变量](Day 2.resource\变量.PNG)

int i = 1

i = 2 //i是2了

注意：声明变量过程中的这个=，不是数学意义上的=，在java编程当中叫做赋值（赋予变量值）

![初始化值](Day 2.resource\初始化值.PNG)

int i = 0;才对。

另外i的作用于是Test{}这个大括号，可被main方法使用，而k的作用域只在main方法中，不能被Test{}当中定义的其他方法调用。

### 变量类型

变量的类型：声明的变量的数据类型就是变量的数据类型

在Java中，数据类型分为基本数据类型和引用数据类型，其中基本数据类型有8种，除了这8种之外，其他所有的数据类型都是引用数据类型。

![Java数据类型](Day 2.resource\Java数据类型.PNG)

#### 1、整数类型

![整数类型](Day 2.resource\整数类型.PNG)

byte的范围-128到127之间，声明byte类型变量的时候赋值不能超过这个范围，给byte类型变量赋值也不能超过这个范围

```java
byte b = 130 //超过byte的表示范围，错误

byte b = 126 //正确

int i = 1

short s = 1

声明long类型比较特别;

long l = 3l;

long l1 = 3L;//这个long类型变量赋值的时候要在值的后面跟上一个字母l/L
```



#### 浮点类型

![浮点类型](Day 2.resource\浮点类型.PNG)

double d = 1.22

float f = 1.22f; 	//float类型赋值的时候后面要加上字母f

#### 字符类型

![字符类型](Day 2.resource\字符类型.PNG)

字符：用英文的单括号括起来的单个的字母、数字、符号

比如：

```java
char c1 = 'a'
char c2 = '1'
char c3 = '%'
char c4 = '\n'
char c5 = '\''
```

#### 布尔类型![布尔类型](Day 2.resource\布尔类型.PNG)

```java
boolean b1 = true;
boolean b2 = false;
```

**汇总8种基本数据类型：**

**byte/short/int/long/double/float/char/boolean**

```java
public class Test1{
	public static void main(String[] args){
		//System.out.println("sss");
		//System.out.print("sss\n");
		
		byte b = 1;
		System.out.println(b);
		
		short s = 2;
		System.out.println(s);
		
		int i = 4;
		System.out.println(i);
		
		long l = 7L;
		System.out.println(l);
		
		double d = 791;
		System.out.println(d);
		
		float f = 1.23f;
		System.out.println(f);
		
		char c = 'a';
		System.out.println(c);
		
		boolean b1 = true;
		System.out.println(b1);
	}
}
```

#### 引用类型![String类型](Day 2.resource\String类型.PNG)

字符串：就是由0到多个字母数字符号共同组成的一个串，这个串要用英文的双引号括起来。

```java
String str = "hello world";
System.out.println(str);
```

凡是引用类型，都可以用null作为值，也就意味着可以在初始化的时候赋值为null

String是引用类型，也就是说可以使用null作为值。

**String的值是不可变的！**

```java
int i0 = 1;
int i1 = 1;
//以上会在内存中产生两个存储1的值

String s0 = "hello";
String s1 = "hello";
/*
这种的，不会再内存中存在两个"hello"，只存在一个，这个变量名回去引用一个"hello"（引用其的内存地址），则s0和s1都指向一个地址。
假设"hello"的内存地址xxxxxx，声明s0变量的时候，给s0赋值"hello"，实际上让s0变量引用这个"hello"的内存地址，当我们再声明变量s1，也赋值"hello"的时候也是直接把已经存在的"hello"的内存地址给s1引用。
*/

String s3 = "he" + "ll" + "o";

```

![字符串在内存](Day 2.resource\字符串在内存.PNG)

在没有使用集成开发环境的时候，运行一个java文件的步骤：

1. ​	创建一个Java文件
2. ​	用文本编辑器打开
3. ​	写代码
4. ​	打开dos界面
5. ​	javac编译
6. ​	java运行

#### 基本数据类型转换

![基本数据类型转换](Day 2.resource\基本数据类型转换.PNG)

byte、int、char不能相互转化。

![数字类型运算规则](Day 2.resource\数字类型运算规则.PNG)![强制类型转换](Day 2.resource\强制类型转换.PNG)



### 运算符

#### 1、算术运算符

![运算符](Day 2.resource\运算符.PNG)



当整数除以整数的时候，会把结果的小数部分舍弃，只保留整数部分

++和--分别是加1和减1的运算，++或者--符号在变量之前，先对变量进行运算然后再取变量的值；

如果++或者--符号在变量之后，就先取变量的值，再对变量进行运算。

字符串的加号是字符串拼接

char类型数据是可以做数学运算的，在做数学运算的时候把字符转化为ASCII码进行运算。

字符串与其他数据类型相加时，实际是把其他数据转换为字符串，做字符串的拼接

= 可以连续赋值

字符串的+=是字符串的拼接。

```java
short s = 2;
s = s + 2; //报错
//变量参与运算时候，java程序不知道具体的这个变量在做完运算后会不会查看当前变量的范围，
//所以先把变量转换为一个更大长度，这个例子中，short是一个短整型数据，会转化为默认的int
//s+2运算结束之后，是一个int，不能直接赋给short

s += 2;//不报错
//在使用扩展赋值运算符时，变量在参与运算时会把结果强制类型转换为等号前面的数据的类型。

//那么思考：
int i = 1;
i *= 0.1;
System.out.println(i);
//输出0（0.1强制转换为int是0）

```

#### 2、赋值运算符

![扩展赋值运算符](Day 2.resource\扩展赋值运算符.PNG)

#### 3、比较运算符

![比较运算符](Day 2.resource\比较运算符.PNG)

#### 逻辑运算符

![逻辑运算符](Day 2.resource\逻辑运算符.PNG)

![逻辑运算符补](Day 2.resource\逻辑运算符补.PNG)

在不需要逻辑运算两边都参与运算的时候，尽量使用&&和||

#### 位运算符

![位运算符](Day 2.resource\位运算符.PNG)

110 & 011 = 010 = 2

110 | 011 = 111 = 7

110 ^ 011 = 101 = 5

~0110 = 1001 = -7(-7的补码)

1001（实际上是-7） + 0111 （实际上是+7）= 1,0000(最高位的1舍掉) = 0

">>"右移负数的话，前面是补1的，右移正数，前面补0

">>>"无符号右移是前面补0。

![右移区别](Day 2.resource\右移区别.PNG)

![位运算符小结](Day 2.resource\位运算符小结.PNG)

#### 三元运算符

![三目运算符](Day 2.resource\三目运算符.PNG)

```java
int i = 1;
int k = i > 0 ? 1 : 0;
System.out.println(k); // 1

int m = 1;
int n = 2;
System.out.println(m>n?m:n); //输出m,n中较大的数

int k = 0;
System.out.println(m>n? (m>k?m:k):(n>k?n:k));//获取3个数当中较大的数
//(条件表达式)?表达式1:表达式2
```

### 运算符的优先级

![运算符优先级](Day 2.resource\运算符优先级.PNG)

小括号在所有的运算符里优先级最高。

可以使用小括号来提高你想要的先计算的那部分的优先级。

![Switch语句](Day 2.resource\Switch语句.PNG)

注意和C不同，这里的case可以是字符串。

break是必须写的，不然程序会从匹配到的case一直往下执行。

![switch if 对比](Day 2.resource\switch if 对比.PNG)

![循环结构](Day 2.resource\循环结构.PNG)

![While语句](Day 2.resource\While语句.PNG)

![Do-While](Day 2.resource\Do-While.PNG)

### 一维数组

![一维数组](Day 2.resource\一维数组.PNG)

![一维数组初始化](Day 2.resource\一维数组初始化.PNG)

![数组元素的引用](Day 2.resource\数组元素的引用.PNG)

![初始化](Day 2.resource\初始化.PNG)

注意上图中的特殊写法。

