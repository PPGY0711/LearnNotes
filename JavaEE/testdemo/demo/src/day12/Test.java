package day12;

import java.io.File;
import java.io.IOException;

public class Test {
	public static void main(String[] args) {
//		File f = new File("D:\\Documents\\Java\\notes\\testFile\\tt.txt");//���f�������tt.txt
////		File f1 = new File("D:\\Documents\\Java","notes\\testFile\\tt.txt");//���f1����Ҳ��tt.txt
////		//�ڶ���ʹ�õ������һЩ
//		//ע�⣬\���ļ�����·���ķָ�����������java�����һ��\��ת�������java��\\����/�����ļ��ķָ���
//		//UNIX����/��windows����\\��������File.separator����
//		System.out.println(f.getName());//��ȡ�ļ������ļ�������
//		System.out.println(f.getPath());//��ȡ�ļ�·�������ļ���·��������new��ʱ���·��
//		System.out.println(f.getAbsolutePath());
//		File f2 = new File("D:\\Documents\\Java","notes\\testFile");
//		System.out.println(f2.getName());
//		
//		File f3 = new File("src/day11/Test.java");
//		System.out.println(f3.getPath());
//		System.out.println(f3.getAbsolutePath());//��ǰ�ļ��ľ���·��
//		
//		System.out.println(f3);
//		System.out.println(f3.getAbsoluteFile());//����һ���õ�ǰ�ļ��ľ���·��������File����
//		
//		System.out.println(f3.getParent());//���ص�ǰ�ļ������ļ��еĸ���·��
//		f.renameTo(new File("D:\\Documents\\Java\\notes\\testFile\\tt1.txt"));//���ļ������ļ���������
//		
////		File f4 = new File("D:\\Documents\\Java\\notes\\testFile\\tt1.txt");//true
//		File f4 = new File("D:\\Documents\\Java\\notes\\testFile\\tt21.txt");//false
//		System.out.println(f4.exists());
//		
//		File f5 = new File("D:\\Documents\\Java\\notes\\testFile\\tt1.txt");
//		System.out.println(f5.canRead());//�Ƿ��д
//		System.out.println(f5.canWrite());//�Ƿ�ɶ�
//		System.out.println(f5.canExecute());//ȫ��true
//		
//		System.out.println(f5.isFile());//�Ƿ�Ϊ�ļ�
//		System.out.println(f2.isFile());
//		System.out.println(f2.isDirectory());//�Ƿ�ΪĿ¼
//		
//		System.out.println(f5.lastModified());//�����ļ�������޸�ʱ�䣬����
//		System.out.println(f5.length());//�����ļ����ȣ���λ���ֽ���
//		
//		File f6 = new File("D:\\Documents\\Java\\notes\\testFile\\tt2.txt");
//		System.out.println(f6.exists());//�ж��ļ��Ƿ����
//		if(!f6.exists()) {
//			try {
//				f6.createNewFile();
//			}catch(IOException e) {
//				e.printStackTrace();
//			}
//		}
////		f6.delete();//ɾ���ļ�
//		File f7 = new File("D:\\Documents\\Java\\notes\\testFile\\cc");
//		f7.mkdir();//��������Ŀ¼�����ʹ����һ�������������Ŀ¼��Ҫһ��һ��Ĵ���
//		
//		File f8 = new File("D:\\Documents\\Java\\notes\\testFile\\a\\b\\c");
//		f8.mkdirs();//�����༶Ŀ¼
//		
//		File f9 = new File("D:\\Documents");
//		String[] fl = f9.list();//���ص��ǵ�ǰ�ļ��е��Ӽ������ƣ�����Ŀ¼���ļ�
//		for(String s : fl) {
//			System.out.println(s);
//		}
//		
//		File[] fs = f9.listFiles();
//		for(File ff : fs) {
//			System.out.println(ff);//���ص��ǵ�ǰ�ļ��е��Ӽ���File���󣬰���Ŀ¼���ļ�
//		}	
		//����d���µ�test�ļ�����test�ļ������е�Ŀ¼���ļ�ȫ���������������۲㼶�ж��Ҫȫ����������
		File f = new File("D:\\Documents\\Java\\notes\\testFile");
		Test t = new Test();
		t.test(f);
	}
	
	/**
	 * �ݹ�����ļ�
	 * @param file
	 */
	public void test(File file) {
		if(file.isFile()) {
			System.out.println(file.getAbsolutePath() + " is a file.");
		}
		else {
			System.out.println(file.getAbsolutePath() + " is a directory.");
			//������ļ��У�����ļ��Ϳ��������ļ��л��ļ�
			File[] fs = file.listFiles();
			if(fs != null && fs.length > 0)
				for(File ff : fs) {
					test(ff);
				}
		}
	}
}	