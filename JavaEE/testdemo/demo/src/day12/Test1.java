package day12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
	public static void main(String[] args) throws Exception{
//		Test1.testFileInputStream();
//		Test1.testFileOutputStream();
		Test1.copyFile("D:\\Documents\\Java\\notes\\testFile\\FileOutputStream.PNG",
				"D:\\Documents\\Java\\notes\\testFile\\a\\FileOutputStream.PNG");
	}
	
	/**
	 * �ļ��ֽ�������
	 * @throws IOException
	 */
	public static void testFileInputStream(){
		try {
			FileInputStream in = new FileInputStream("D:\\Documents\\Java\\notes\\testFile\\tt1.txt");
			byte[] b = new byte[100];//����һ��byte������ն�ȡ���ļ�������
			
			int len = 0;//����һ����ȡ���ݵĳ���
			
			in.read(b);//in.read()������һ������ֵ������ֵ�Ƕ�ȡ�����ݵĳ��ȣ������ȡ�����һ�����ݣ���������ȡһ��������ֵ��-1
			//Ҳ����ζ�ŵ�in.read�ķ���ֵ��-1��ʱ�������ļ��Ͷ�ȡ�����
			
			while((len = in.read(b)) != -1) {
				System.out.println(new String(b,0,len));
			}//����1�ǻ������ݵ����飬����2�Ǵ��ĸ�λ�ÿ�ʼת���ַ���������3���ܹ�ת�����ֽ���
			System.out.println(new String(b));
			in.close();//ע�⣬����ʹ�����֮��һ��Ҫ�ر�
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * �ļ��ֽ������
	 */
	public static void testFileOutputStream() {
		try {
		FileOutputStream out = new FileOutputStream("D:\\Documents\\Java\\notes\\testFile\\tt4.txt");
		//ָ����tt4.txt���������
		String str = "Good Night";
		out.write(str.getBytes()); // ������д���ڴ�
		out.flush();//���ڴ��е�����ˢд��Ӳ��
		out.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * �����ļ���ָ��λ��
	 * @param inPath Դ�ļ�·��
	 * @param outPath ���Ƶ��ļ���λ��
	 */
	public static void copyFile(String inPath, String outPath) {
		try {
			FileInputStream in = new FileInputStream(inPath);
			FileOutputStream out = new FileOutputStream(outPath);
			byte[] b = new byte[100];
			
			int len = 0;
			
			while((len = in.read(b)) != -1) {
				out.write(b,0,len);//����1��д�Ļ������飬����2�Ǵ�������ĸ�λ�ÿ�ʼ������3���ܹ�д���ֽ���
			}
			out.flush();
			out.close();
			in.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}