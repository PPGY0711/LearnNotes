package day12;

import java.io.FileReader;
import java.io.FileWriter;


public class Test2 {
	public static void main(String[] args) {
//		Test2.testFileReader("D:\\Documents\\Java\\notes\\testFile\\tt1.txt");
//		Test2.testFileWriter("Hello World", "D:\\Documents\\Java\\notes\\testFile\\tt5.txt");
		Test2.copyFile("D:\\Documents\\Java\\notes\\testFile\\tt5.txt","D:\\Documents\\Java\\notes\\testFile\\a\\tt5.txt");
		
	}
	
	/**
	 * �ļ��ַ�������FileReader
	 * @param inPath
	 */
	public static void testFileReader(String inPath) {
		try {
			FileReader fr = new FileReader(inPath);
			
			char[] c = new char[100]; //������ʱ�����ݵ��ַ�����
			
			int len = 0;//����һ���������Ķ�ȡ����
			
			while((len = fr.read(c)) != -1) {
				System.out.println(new String(c,0,len));
			}
			
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}//�����ַ��������Ķ���
	}
	
	/**
	 * �ļ��ַ������FileWriter
	 * @param text �������
	 * @param outPath ������ļ�
	 */
	public static void testFileWriter(String text, String outPath) {
		try {
			FileWriter fw = new FileWriter(outPath);
			
			fw.write(text);
			fw.flush(); //д���ڴ���
			fw.close(); //���ڴ������ˢ��Ӳ��
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * �ַ�����ɿ����ļ����ַ��ļ���
	 * @param inPath
	 * @param outPath
	 */
	public static void copyFile(String inPath, String outPath) {
		try {
			FileReader fr = new FileReader(inPath);
			FileWriter fw = new FileWriter(outPath);
			
			char c[] = new char[100];
			
			int len = 0;
			
			while((len = fr.read(c)) != -1)
			{
				fw.write(c,0,len);
			}
			
			fw.flush();
			fw.close();
			fr.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}