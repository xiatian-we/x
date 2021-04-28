package 适配器与桥接模式的连用;

public class 读取文本文件  implements 数据采集{
	public void mode(String show,String content) {
		System.out.println(show +"从文本文件中读取的数据"+content +".");
	}
}
