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
		
		//���Ʊ���������
		@SuppressWarnings({ "unused", "rawtypes" })
		List list = new ArrayList();
	}
}

class TestA{
//	@TestAnn//���ܸ�������ע�⣬��Ϊ�������Ǹ�Field��ע���
	public void test() {
		
	}
}

class TestB extends TestA{
	@TestAnn(id=100,desc="����")
	String name;
	
	//@Override��ʾ��д
	@Override
	public void test() {
		// TODO Auto-generated method stub
		super.test();
	}
	//����̭�ķ���
	@Deprecated
	public void test1() {
		
	}
}

@Target(ElementType.FIELD)//���ע�������������������ע��
@Retention(RetentionPolicy.RUNTIME)//����ע�����������
@Documented
@interface TestAnn{
	public int id() default 0;
	public String desc() default "";
	
}