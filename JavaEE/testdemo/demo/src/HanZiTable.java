public class HanZiTable
{
    public static void main(String[] args){
        int q,w,i,j,k;
        i = j = k = 0;
        byte[] b = new byte[87*94*2];//��ʾ���ֵ��ַ�����
        for(q=1;q<=87;q++){//����1��ʼ����87
			for(w=1;w<=94;w++){//λ��1��ʼ����94
                b[k++] = (byte)(q + 0x80 + 0x20); //���λ�ȱ��1���ټ�0x20��ƫ�ƣ�������0xA0
                b[k++] = (byte)(w + 0x80 + 0x20); //λͬ��
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