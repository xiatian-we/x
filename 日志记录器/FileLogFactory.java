package 日志记录器;

public class FileLogFactory implements LogFactory{
	public Log createLog()
	{
		System.out.println("文件工厂！");
		return new FileLog();
	}

}
