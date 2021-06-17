package 模板方法模式;

public class Client {
	public static void main(String[] args) {
		abstractClass c;
		c=new ConcreteClassA();
		c.tempLate();
		
		c=new ConcreteClassB();
		c.tempLate();
	}
}
