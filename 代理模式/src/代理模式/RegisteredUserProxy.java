package 代理模式;

public class RegisteredUserProxy implements IUserOper{
	private UserOper userOper = new UserOper();
    public void browse(){
        System.out.print("权限通过——");
        userOper.browse();
    }
    public void readWrite()
    {
        System.out.print("权限通过——");
        userOper.readWrite();
    }
    public void AuthorityManagement(){
 
        System.out.println("您无法获得该权限操作——");
        
    }
}
