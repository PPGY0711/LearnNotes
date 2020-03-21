package day10;

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