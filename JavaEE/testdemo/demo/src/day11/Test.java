package day11;

public class Test {
	public static void main(String[] args) {
		A<String> a1 = new A<String>();//��new A�Ķ���ָ�����͵�����String
		a1.setKey("xxxx");//����ʹ��setKey()�����е�key�βξ���String����
		String s = a1.getKey();//T getKey()������ֵ����new����ȷ������ֵ��String����
	
		A<Integer> a2 = new A<Integer>();//��new A�Ķ���ָ�����͵�����Integer
		a2.setKey(123);//����ʹ��setKey()�����е�key�βξ���Integer����
		Integer i = a2.getKey();//T getKey()������ֵ����new����ȷ������ֵ��Integer����
		
		A a3 = new A();//��new A�Ķ���ָ�����͵����ͣ��൱��ָ����Object����		
		//ͬ�����࣬������new����ʱ����ָ���˲�ͬ���������ͣ���Щ�����ܻ��ำֵ
	}
}

/**
 * �˴��ķ���T��������ȡ����B,A,V...
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