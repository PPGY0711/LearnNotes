
/**
 *	����
 * @author pgy
 *
 */
public class Animal{
    String name;	//���������
    int eyes;		//�۾�����
    int legs;		//������
    
    /**
 	 *	�������ԵĶ���
 	 * @param food ʳ��
 	 *
 	 */
    public void eat(String food){
        System.out.println("���ֶ����ʳ���ǣ�" + food);
    }
    
    /**
 	 *	�������ԵĶ���
 	 * @param moveType �ƶ���ʽ
 	 *
 	 */
    public void move(String moveType){
        System.out.println("���ֶ�����ƶ���ʽ�ǣ�" + moveType);
    }
}