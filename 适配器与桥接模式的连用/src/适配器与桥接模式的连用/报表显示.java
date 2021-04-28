package 适配器与桥接模式的连用;

public abstract class 报表显示 {
	protected 数据采集 a;
	public void collectShow(数据采集 a) {
		this.a=a;
	}
	public abstract void show1(String content);
}
