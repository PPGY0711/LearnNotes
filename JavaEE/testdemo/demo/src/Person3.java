
public class Person3 {
	public void printInfo() {}
	//���⣬�����ܹ���ӡ����Ϣ������Դ�ڷ����Ĳ���Ҳ�����βεĴ���
	//���ǿ��ܸ��������ݲ�ͬ�Ĳ���
	//�������������£���֪��Ҫ���ݸ��������ٸ�����
    public void printInfo(String[] args){
        for(int i = 0;i < args.length;i++)
            System.out.println(args[i]);
    }
    public void printInfo1(String... args){
        for(int i = 0;i < args.length;i++)
            System.out.println(args[i]);
    }
}