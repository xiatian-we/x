package ����ģʽ;

public class Client {
	public static void main(String[] args){
        System.out.println("�οͲ���");
        GenericUserProxy gu = new GenericUserProxy();
        gu.browse();
        gu.readWrite();
        gu.AuthorityManagement();
        System.out.println("ע���û�����");
        RegisteredUserProxy ru = new RegisteredUserProxy();
        ru.browse();
        ru.readWrite();
        ru.AuthorityManagement();
        System.out.println("����Ա����");
        AdministratorProxy au = new AdministratorProxy();
        au.browse();
        au.readWrite();
        au.AuthorityManagement();
    }
}
