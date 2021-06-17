package 工厂模式;

public class Client {
	public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory();
        Phone huawei = phoneFactory.makePhone("huawei");
        huawei.make();
        Phone xiaomi = phoneFactory.makePhone("xiaomi");
        xiaomi.make();
    }
}
