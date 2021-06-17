package 代理模式;

public class UserOper implements IUserOper{
	public void browse(){
        System.out.println("执行浏览操作");
    }
    public void readWrite(){
        System.out.println("执行读写操作");
    }
    public void AuthorityManagement()
    {
        System.out.println("执行权限管理操作");
    }
}
