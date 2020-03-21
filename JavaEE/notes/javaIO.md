## javaIO流

![javaIO流](javaIO.resource\javaIO流.PNG)

File 计算机操作系统中的文件和文件夹

IO：Input/Output  输入输出

![主要IO流](javaIO.resource\主要IO流.PNG)

### File类

 ![File类](javaIO.resource\File类.PNG)

![File类1](javaIO.resource\File类1.PNG)

```java
//熟悉File类操作
import java.io.File;
import java.io.IOException;

public class Test {
	public static void main(String[] args) {
		File f = new File("D:\\Documents\\Java\\notes\\testFile\\tt.txt");//这个f对象就是tt.txt
//		File f1 = new File("D:\\Documents\\Java","notes\\testFile\\tt.txt");//这个f1对象也是tt.txt
//		//第二种使用的相对少一些
		//注意，\在文件中是路径的分隔符，但是在java编程中一个\是转义符，在java中\\或者/才是文件的分隔符
		//UNIX中用/，windows中用\\，可以用File.separator代替
		System.out.println(f.getName());//获取文件名或文件夹名称
		System.out.println(f.getPath());//获取文件路径或者文件夹路径，是在new的时候的路径
		System.out.println(f.getAbsolutePath());
		File f2 = new File("D:\\Documents\\Java","notes\\testFile");
		System.out.println(f2.getName());
		
		File f3 = new File("src/day11/Test.java");
		System.out.println(f3.getPath());
		System.out.println(f3.getAbsolutePath());//当前文件的绝对路径
		
		System.out.println(f3);
		System.out.println(f3.getAbsoluteFile());//返回一个用当前文件的绝对路径构建的File对象
		
		System.out.println(f3.getParent());//返回当前文件或者文件夹的父级路径
		f.renameTo(new File("D:\\Documents\\Java\\notes\\testFile\\tt1.txt"));//给文件或者文件夹重命名
		
//		File f4 = new File("D:\\Documents\\Java\\notes\\testFile\\tt1.txt");//true
		File f4 = new File("D:\\Documents\\Java\\notes\\testFile\\tt21.txt");//false
		System.out.println(f4.exists());
		
		File f5 = new File("D:\\Documents\\Java\\notes\\testFile\\tt1.txt");
		System.out.println(f5.canRead());//是否可写
		System.out.println(f5.canWrite());//是否可读
		System.out.println(f5.canExecute());//全是true
		
		System.out.println(f5.isFile());//是否为文件
		System.out.println(f2.isFile());
		System.out.println(f2.isDirectory());//是否为目录
		
		System.out.println(f5.lastModified());//返回文件最近的修改时间，毫秒
		System.out.println(f5.length());//返回文件长度，单位是字节数
		
		File f6 = new File("D:\\Documents\\Java\\notes\\testFile\\tt2.txt");
		System.out.println(f6.exists());//判断文件是否存在
		if(!f6.exists()) {
			try {
				f6.createNewFile();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
//		f6.delete();//删除文件
		File f7 = new File("D:\\Documents\\Java\\notes\\testFile\\cc");
		f7.mkdir();//创建单层目录。如果使用这一方法来创建多层目录就要一层一层的创建
		
		File f8 = new File("D:\\Documents\\Java\\notes\\testFile\\a\\b\\c");
		f8.mkdirs();//创建多级目录
		
		File f9 = new File("D:\\Documents");
		String[] fl = f9.list();//返回的是当前文件夹的子集的名称，包括目录和文件
		for(String s : fl) {
			System.out.println(s);
		}
		
		File[] fs = f9.listFiles();
		for(File ff : fs) {
			System.out.println(ff);//返回的是当前文件夹的子集的File对象，包括目录和文件
		}	
	}
}
```

```java
//遍历某文件夹的文件
import java.io.File;
import java.io.IOException;

public class Test {
	public static void main(String[] args) {
		File f = new File("D:\\Documents\\Java\\notes\\testFile");
		Test t = new Test();
		t.test(f);
	}
	
	/**
	 * 递归遍历文件
	 * @param file
	 */
	public void test(File file) {
		if(file.isFile()) {
			System.out.println(file.getAbsolutePath() + " is a file.");
		}
		else {
			System.out.println(file.getAbsolutePath() + " is a directory.");
			//如果是文件夹，这个文件就可能有子文件夹或文件
			File[] fs = file.listFiles();
			if(fs != null && fs.length > 0)
				for(File ff : fs) {
					test(ff);
				}
		}
	}
}

/*
testFile is a directory.
testFile\a is a directory.
testFile\a\b is a directory.
testFile\a\b\c is a directory.
testFile\cc is a directory.
testFile\tt1.txt is a file.
testFile\tt2.txt is a file.
*/
```

### Java IO与IO流

![JavaIO原理](javaIO.resource\JavaIO原理.PNG)

![JavaIO原理1](javaIO.resource\JavaIO原理1.PNG)

![流的分类](javaIO.resource\流的分类.PNG)

![IO流体系](javaIO.resource\IO流体系.PNG)

转换流是指字节流转换成字符流

#### 文件字节流

![文件字节输入流](javaIO.resource\文件字节输入流.PNG)

![文件字节输出流](javaIO.resource\文件字节输出流.PNG)

```java
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
	public static void main(String[] args) throws FileNotFoundException{
		Test1.testFileInputStream();
		Test1.testFileOutputStream();
        			         		Test1.copyFile("D:\\Documents\\Java\\notes\\testFile\\FileOutputStream.PNG",
				"D:\\Documents\\Java\\notes\\testFile\\a\\FileOutputStream.PNG");
	}
	
	/**
	 * 文件字节输入流
	 * @throws IOException
	 */
	public static void testFileInputStream() throws FileNotFoundException{
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
			
		} catch (IOException e) {
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
```

**注意：文件字节流非常通用，可以用来操作字符的文档，还可以操作任何的其他类型文件（图片，压缩包等等），引用字节流直接使用二进制。**

#### 文件字符输入流

```java

import java.io.FileReader;
import java.io.FileWriter;


public class Test2 {
	public static void main(String[] args) {
//		Test2.testFileReader("D:\\Documents\\Java\\notes\\testFile\\tt1.txt");
//		Test2.testFileWriter("Hello World", "D:\\Documents\\Java\\notes\\testFile\\tt5.txt");
		Test2.copyFile("D:\\Documents\\Java\\notes\\testFile\\tt5.txt","D:\\Documents\\Java\\notes\\testFile\\a\\tt5.txt");
		
	}
	
	/**
	 * 文件字符输入流FileReader
	 * @param inPath
	 */
	public static void testFileReader(String inPath) {
		try {
			FileReader fr = new FileReader(inPath);
			
			char[] c = new char[100]; //创建临时存数据的字符数组
			
			int len = 0;//定义一个输入流的读取长度
			
			while((len = fr.read(c)) != -1) {
				System.out.println(new String(c,0,len));
			}
			
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}//创建字符输入流的对象
	}
	
	/**
	 * 文件字符输出流FileWriter
	 * @param text 输出内容
	 * @param outPath 输出的文件
	 */
	public static void testFileWriter(String text, String outPath) {
		try {
			FileWriter fw = new FileWriter(outPath);
			
			fw.write(text);
			fw.flush(); //写到内存中
			fw.close(); //把内存的数据刷到硬盘
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 字符流完成拷贝文件（字符文件）
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

```

![读写注意事项](javaIO.resource\读写注意事项.PNG)

