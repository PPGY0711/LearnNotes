
public class Test2 {
    public static void swap(DataSwap ds1){
        ds1.a = 6;
        System.out.println("����swap����֮��ds1.a��ֵ�ǣ�" + ds1.a);//6
    }
    
    public static void main(String[] args){
        DataSwap ds = new DataSwap();
        System.out.println("����swap����֮ǰds.a��ֵ�ǣ�" + ds.a);//0
        swap(ds);//0->6
    }
}
