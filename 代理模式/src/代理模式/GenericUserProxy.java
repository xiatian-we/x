package ����ģʽ;

public class GenericUserProxy implements IUserOper{
	private UserOper userOper = new UserOper();
    public void browse(){
        System.out.print("Ȩ��ͨ������");
        userOper.browse();
    }
    public void readWrite(){
        System.out.println("���޷���ø�Ȩ�޲�������");
    }
    public void AuthorityManagement()
    {
        System.out.println("���޷���ø�Ȩ�޲�������");
    }
}
