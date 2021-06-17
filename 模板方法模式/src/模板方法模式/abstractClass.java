package 模板方法模式;

public abstract class abstractClass {
	public abstract void primitiveOperation1();
	public abstract void primitiveOperation2();
	
	public void tempLate() {
		primitiveOperation1();
		primitiveOperation2();
	}
}
