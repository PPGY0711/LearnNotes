package day09;

public class Test1 {
	public static void main(String[] args) {
//		new Person();
//		new Person();
		//�����ڲ���
		Person p = new Person() {
			//��������治����дPerson�Ĺ��췽��/����˵������ķ�ʽȥ��ʽ�Ķ������Ĺ��췽������Ϊ���������ֲ�֪��
			//���⣿�������name�ĳ�lisi�����ǲ��붯Person�Ĵ���
			{
				//�ô������湹�췽��
				super.name = "lisi";
			}
			@Override
			public void test() {
				System.out.println("====");
				//����һ����д
			}
		};//������û��������Person���࣬��������Person����
		//������û���������Ͳ�������ʽ��new��������
		//Ҫ�ǻ�Ҫ�ٹ������г�ʼ�����Ծ�û�а취�������Ļ�����Ҫ�ô��������ʼ������
		
		System.out.println(p.name);
		p.test();
	}
}