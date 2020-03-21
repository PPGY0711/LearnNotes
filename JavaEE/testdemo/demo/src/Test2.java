
public class Test2 {
    public static void swap(DataSwap ds1){
        ds1.a = 6;
        System.out.println("调用swap方法之后，ds1.a的值是：" + ds1.a);//6
    }
    
    public static void main(String[] args){
        DataSwap ds = new DataSwap();
        System.out.println("调用swap方法之前ds.a的值是：" + ds.a);//0
        swap(ds);//0->6
    }
}
