package day07;

public class Kk extends Kids{
	public void test() {
		super.salary = 1;// ����ʹ��super����׷�ݸ���ĸ��࣬��Ȼ����һֱ����׷�ݣ��������ô��㼶�Ļ�
		super.yearsOld = 1;//����ʹ��superֱ��׷�ݸ���ĳ�Ա����
		super.employeed();//����ʹ��superֱ��׷�ݸ���ĳ�Ա����
		super.manOrWoman();//����ʹ��super����׷�ݸ���ĳ�Ա��������Ȼ����һֱ����׷�ݣ������ô��㼶�Ļ�
	}
	public static void main(String[] args) {
		Kk someKid = new Kk();
		someKid.setSalary(100);
		someKid.setSex(0);
		someKid.employeed();
		
	}
}