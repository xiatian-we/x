package 代理模式;

public class Client {
	public static void main(String[] args){
        System.out.println("游客操作");
        GenericUserProxy gu = new GenericUserProxy();
        gu.browse();
        gu.readWrite();
        gu.AuthorityManagement();
        System.out.println("注册用户操作");
        RegisteredUserProxy ru = new RegisteredUserProxy();
        ru.browse();
        ru.readWrite();
        ru.AuthorityManagement();
        System.out.println("管理员操作");
        AdministratorProxy au = new AdministratorProxy();
        au.browse();
        au.readWrite();
        au.AuthorityManagement();
    }
}
