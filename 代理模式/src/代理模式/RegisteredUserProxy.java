package ����ģʽ;

public class RegisteredUserProxy implements IUserOper{
	private UserOper userOper = new UserOper();
    public void browse(){
        System.out.print("Ȩ��ͨ������");
        userOper.browse();
    }
    public void readWrite()
    {
        System.out.print("Ȩ��ͨ������");
        userOper.readWrite();
    }
    public void AuthorityManagement(){
 
        System.out.println("���޷���ø�Ȩ�޲�������");
        
    }
}
