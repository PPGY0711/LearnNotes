
/**
 *	动物
 * @author pgy
 *
 */
public class Animal{
    String name;	//动物的名称
    int eyes;		//眼睛个数
    int legs;		//几条腿
    
    /**
 	 *	输出动物吃的东西
 	 * @param food 食物
 	 *
 	 */
    public void eat(String food){
        System.out.println("此种动物的食物是：" + food);
    }
    
    /**
 	 *	输出动物吃的东西
 	 * @param moveType 移动方式
 	 *
 	 */
    public void move(String moveType){
        System.out.println("此种动物的移动方式是：" + moveType);
    }
}