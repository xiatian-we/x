package ����ģʽ;

public class Client {
	public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory();
        Phone huawei = phoneFactory.makePhone("huawei");
        huawei.make();
        Phone xiaomi = phoneFactory.makePhone("xiaomi");
        xiaomi.make();
    }
}
