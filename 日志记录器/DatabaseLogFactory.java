package 日志记录器;

public class DatabaseLogFactory implements LogFactory{
	public Log createLog()
	{
		System.out.println("数据库工厂！");
		return new DatabaseLog();
	}

}
