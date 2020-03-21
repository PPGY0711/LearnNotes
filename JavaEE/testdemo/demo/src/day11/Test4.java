package day11;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
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
//	@TestAnn//不能给方法做注解，因为定义了是给Field做注解的
	public void test() {
		
	}
}

class TestB extends TestA{
	@TestAnn(id=100,desc="姓名")
	String name;
	
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

@Target(ElementType.FIELD)//这个注解类是其他类的属性做注解
@Retention(RetentionPolicy.RUNTIME)//定义注解的声明周期
@Documented
@interface TestAnn{
	public int id() default 0;
	public String desc() default "";
	
}