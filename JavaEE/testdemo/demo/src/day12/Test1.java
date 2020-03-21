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
	 * 文件字节输入流
	 * @throws IOException
	 */
	public static void testFileInputStream(){
		try {
			FileInputStream in = new FileInputStream("D:\\Documents\\Java\\notes\\testFile\\tt1.txt");
			byte[] b = new byte[100];//设置一个byte数组接收读取的文件的内容
			
			int len = 0;//设置一个读取数据的长度
			
			in.read(b);//in.read()方法有一个返回值，返回值是读取的数据的长度，如果读取到最后一个数据，还会向后读取一个，返回值是-1
			//也就意味着当in.read的返回值是-1的时候整个文件就读取完毕了
			
			while((len = in.read(b)) != -1) {
				System.out.println(new String(b,0,len));
			}//参数1是缓冲数据的数组，参数2是从哪个位置开始转化字符串，参数3是总共转化的字节数
			System.out.println(new String(b));
			in.close();//注意，流在使用完毕之后一定要关闭
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 文件字节输出流
	 */
	public static void testFileOutputStream() {
		try {
		FileOutputStream out = new FileOutputStream("D:\\Documents\\Java\\notes\\testFile\\tt4.txt");
		//指定向tt4.txt中输出数据
		String str = "Good Night";
		out.write(str.getBytes()); // 把数据写到内存
		out.flush();//把内存中的数据刷写到硬盘
		out.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 复制文件到指定位置
	 * @param inPath 源文件路径
	 * @param outPath 复制到文件夹位置
	 */
	public static void copyFile(String inPath, String outPath) {
		try {
			FileInputStream in = new FileInputStream(inPath);
			FileOutputStream out = new FileOutputStream(outPath);
			byte[] b = new byte[100];
			
			int len = 0;
			
			while((len = in.read(b)) != -1) {
				out.write(b,0,len);//参数1是写的缓冲数组，参数2是从数组的哪个位置开始，参数3是总共写的字节数
			}
			out.flush();
			out.close();
			in.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
