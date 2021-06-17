package ��Ԫģʽ;
import java.util.*;
public class IgoChessmanFactory {
	//��Ԫ������
	private static IgoChessmanFactory instance = new IgoChessmanFactory();  
    private static Hashtable<String, IgoChessman> ht; //ʹ��Hashtable���洢��Ԫ���󣬳䵱��Ԫ��  

    private IgoChessmanFactory() {  
        ht = new Hashtable<String, IgoChessman>();  
        IgoChessman black,white;  
        black = new BlackIgoChessman();  
        ht.put("b",black);  
        white = new WhiteIgoChessman();  
        ht.put("w",white);  
    }  

    //������Ԫ�������Ψһʵ��  
    public static IgoChessmanFactory getInstance() {  
        return instance;  
    }  

    //ͨ��key����ȡ�洢��Hashtable�е���Ԫ����  
    public static IgoChessman getIgoChessman(String color) {  
        return (IgoChessman)ht.get(color);    
    }  
}
