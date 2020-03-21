/**
 *	人
 * @author pgy
 *
 */
public class Person{
    //属性，成员变量，类的成员变量可以先声明，不用初始化，类成员变量是有默认值的
    String name;	//姓名，String的默认值是null
    int age;		//年龄，int的默认值是0
    
    //行为，方法，也叫函数
    public void showName(){
        //方法的名称如果是多个单词的话，首个单词的首字母小写，其他的单词首字母大写，即驼峰命名法
        System.out.println("姓名："+name);
    }
    /**
     * 获取年龄
     * @return
     */
    public int getAge(){
        //如果是一个有返回值的方法，那么方法体的最后一行一定是返回相应的数据，使用return关键字
    	return age;
    }
}