package 适配器与桥接模式的连用;

public class 读取数据库  implements 数据采集{
	public void mode(String show,String content) {
		System.out.println(show +"从数据库中读取的数据"+content +".");
	}
}
