package day07;

public class Test{
    /**
     * ���⣬���test��������һ���ββ��������������ȷ�����״�����һ��ʲô��
     * ����ȷ�����Ǵ���ʵ��һ������һ���࣬��ôtest�������β�Ҫ����һ��ʲô���ͣ�
     */
    public void test(Object obj){
		
    }
    
    public static void main(String[] args){
        Test t = new Test();
        Person p = new Person();
        Student s = new Student();
        t.test(p);
        t.test(s);
        t.test(new Kk());
        //���϶����Դ�����ΪObject��������Ļ���
        
        Person e = new Person();
        System.out.println(p.equals(e));//false
        System.out.println(e.hashCode());
        System.out.println(e.toString());
    }
}