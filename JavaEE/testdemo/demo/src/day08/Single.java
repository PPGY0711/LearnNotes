package day08;

/**
 * ����ʽ�ĵ���ģʽ
 * @author Administrator
 *
 */
public class Single {
//	public Single() {
//		//���蹹����ִ��1000�д��룬Ҫ���ĺܴ����Դ����ʱ10��
//		//ÿһ��new Single()��Ҫ10��
//		//��������ʺ��ڵ������ģʽ
//	}
	//����ʽ����new��һ�������������˾��ܳԣ�����������ȥ��
	
	//˽�еĹ��죬���췽��˽�л���������������Ͳ���ֱ��ʹ��new������������
	private Single() {}
	
	//˽�е�Single���͵������
	private static Single single = new Single();
	
	public static Single getInstance() {
		return single;
	}
}
