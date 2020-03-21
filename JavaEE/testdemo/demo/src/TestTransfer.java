public class TestTransfer{
    public static void swap(int i){
        i = 6;
        System.out.println("swap方法里，i的值是：" + i);
    }
    
    public static void main(String[] args){
        int a = 0;
        swap(a);
        System.out.println("main方法里，变量a的值是：" + a);
    }
} 