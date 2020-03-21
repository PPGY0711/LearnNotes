package day11;

public class Test1 {
	public static void main(String[] args) {
//		B1<Object> b1 = new B1<Object>();
//		B1<String> b12 = new B1<String>();
//		
//		B2 b2 = new B2();
////		B2<String> b22 = new B2<String>();
		Cc<Object> c = new Cc<Object>();
		c.test("XXXX"); //���͹̶���String
		c.test1(2);		//���͹̶���Integer
		c.test1(true);	//���͹̶���Boolean
		//���ͷ����ڵ���֮ǰû�й̶��������ͣ��ڵ���ʱȷ���������������
		//�ڵ���ʱ����Ĳ�����ʲô���;ͻ��������͸ĳ�ʲô����
	}
}

interface IB<T>{
	T test(T t);
}

/**
 * δ���뷺��ʵ��ʱ���뷺����Ķ�����ͬ�����������ʱ���轫���͵�����Ҳһ��ӵ�����
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
 * ���ʵ�ֽӿ�ʱָ���ӿڵķ��͵ľ�����������
 * �����ʵ�ֽӿ����з�����λ�ö�Ҫ�����滻ʵ�ʵľ�����������
 * @author Administrator
 *
 */
class B2 implements IB<String>{
	@Override
	public String test(String t) {
		// TODO Auto-generated method stub
		return null;
	}
	//Tȫ���ĳ���String
}

class Cc<E>{
	private E e;//�ඨ��ķ���
	/**
	 * ��̬�����ķ��ͷ���
	 * @param <T>
	 * @param t
	 */
	public static <T> void test3(T t) {
		//�ھ�̬�����У�����ʹ���ඨ�巺�ͣ����Ҫʹ�÷��ͣ�ֻ��ʹ�þ�̬�����Լ�����ķ���
//		System.out.println(this.e);//illegal
		
		System.out.println(t);//OK
	}
	
	/**
	 * �޷���ֵ�ķ��ͷ���
	 * @param <T>
	 * @param s
	 */
	public <T> void test(T s) {
		//�����϶���ķ��ͣ���������ͨ�ķ�����ʹ��
		System.out.println(this.e);
		T t = s;
	}
	
	/**
	 * �з���ֵ�ķ��ͷ���
	 * @param <T>
	 * @param s
	 * @return
	 */
	//���巺����<T>����������庯������ֵ�����ǲ���ͻ��
	public <T> T test1(T s) {
		return s;
	}
	
	/**
	 * �β�Ϊ�ɱ䳤�ȵķ��ͷ���
	 * @param <T>
	 * @param strs
	 */
	public <T> void test2(T... strs) {
		for(T s : strs) {
			System.out.println(s);
		}
	}
}