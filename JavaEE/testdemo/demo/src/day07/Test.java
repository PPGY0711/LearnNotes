package day07;

public class Test{
    /**
     * 问题，想给test方法设置一个形参参数，这个参数不确定到底传进来一个什么类
     * 可以确定的是传递实参一定会是一个类，那么test方法的形参要设置一个什么类型？
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
        //以上都可以传，因为Object是所有类的基类
        
        Person e = new Person();
        System.out.println(p.equals(e));//false
        System.out.println(e.hashCode());
        System.out.println(e.toString());
    }
}