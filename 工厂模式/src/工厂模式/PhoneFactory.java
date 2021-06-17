package 工厂模式;

public class PhoneFactory {
	 public Phone makePhone(String phoneType) {
	        if(phoneType.equalsIgnoreCase("xiaomi")){
	            return new XiaoMiPhone();
	        }
	        else if(phoneType.equalsIgnoreCase("huawei")) {
	            return new HuaWeiPhone();
	        }
	        return null;
	    }
}
