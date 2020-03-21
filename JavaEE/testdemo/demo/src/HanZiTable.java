public class HanZiTable
{
    public static void main(String[] args){
        int q,w,i,j,k;
        i = j = k = 0;
        byte[] b = new byte[87*94*2];//显示汉字的字符数组
        for(q=1;q<=87;q++){//区从1开始，到87
			for(w=1;w<=94;w++){//位从1开始，到94
                b[k++] = (byte)(q + 0x80 + 0x20); //最高位先变成1，再加0x20的偏移，即加上0xA0
                b[k++] = (byte)(w + 0x80 + 0x20); //位同理
            }
        }
        try{
            String s = new String(b,"gb2312");
        	System.out.println(s);
        }catch(Exception e){
            System.out.println("Error");
        }
        System.out.println("Hello world");
    }
}