package ��־��¼��;

public class FileLogFactory implements LogFactory{
	public Log createLog()
	{
		System.out.println("�ļ�������");
		return new FileLog();
	}

}
