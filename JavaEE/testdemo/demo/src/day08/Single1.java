package day08;

public class Single1 {
	//˽�еĹ��죬���췽��˽�л���������������Ͳ���ֱ��ʹ��new������������
	private Single1() {}
	
	//˽�е�Single���͵��������������Ϊnull����ʱ�����������
	private static Single1 single1 = null;
	
	//��һ������getInstance()������ʱ���new����
	public static Single1 getInstance() {
		if(single1 == null)
			single1 = new Single1();
		return single1;
	}
}