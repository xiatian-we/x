package ��Ԫģʽ;

public class Client {
	public static void main(String args[]) {  
        IgoChessman black1,black2,black3,white1,white2;  
        //ͨ����Ԫ������ȡ���ź���  
        black1 = IgoChessmanFactory.getIgoChessman("b");  
        black2 = IgoChessmanFactory.getIgoChessman("b");  
        black3 = IgoChessmanFactory.getIgoChessman("b");  
        System.out.println("�ж����ź����Ƿ���ͬ��" + (black1==black2));  

        //ͨ����Ԫ������ȡ���Ű���  
        white1 = IgoChessmanFactory.getIgoChessman("w");  
        white2 = IgoChessmanFactory.getIgoChessman("w");  
        System.out.println("�ж����Ű����Ƿ���ͬ��" + (white1==white2));  

        //��ʾ����  
        black1.display();  
        black2.display();  
        black3.display();  
        white1.display();  
        white2.display();  
    }  
}
