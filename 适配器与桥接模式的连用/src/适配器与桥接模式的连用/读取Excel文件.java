package 适配器与桥接模式的连用;

public class 读取Excel文件  extends ExcelAPI implements 数据采集{
	public void mode(String show,String content) {
		System.out.println(show +"从Excel中读取的数据"+content +".");
	}
}
