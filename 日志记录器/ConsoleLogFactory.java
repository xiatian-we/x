package ��־��¼��;

public class ConsoleLogFactory implements LogFactory{
	public Log createLog()
	{
		System.out.println("����̨������");
		return new ConsoleLog();
	}
}
