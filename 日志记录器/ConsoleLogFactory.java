package 日志记录器;

public class ConsoleLogFactory implements LogFactory{
	public Log createLog()
	{
		System.out.println("控制台工厂！");
		return new ConsoleLog();
	}
}
