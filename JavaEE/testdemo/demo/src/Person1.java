
public class Person1 {
	public String name;//公有的，这样的类的变量可以在类的外部使用
	private int age;//private 私有的，可以在本类的方法中使用，不能做类的外部使用
	public void showAge() {
		System.out.println(age);
	}
}
