
public class Person3 {
	public void printInfo() {}
	//问题，我们能够打印的信息都有来源于方法的参数也就是形参的传递
	//但是可能给方法传递不同的参数
	//如果在这种情况下，不知道要传递给方法多少个参数
    public void printInfo(String[] args){
        for(int i = 0;i < args.length;i++)
            System.out.println(args[i]);
    }
    public void printInfo1(String... args){
        for(int i = 0;i < args.length;i++)
            System.out.println(args[i]);
    }
}
