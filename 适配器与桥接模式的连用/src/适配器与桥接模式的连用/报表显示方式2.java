package 适配器与桥接模式的连用;

public class 报表显示方式2 extends 报表显示{
	public void show1(String content) {
		String show="报表2显示";
		this.a.mode(show,content);
	}
}
