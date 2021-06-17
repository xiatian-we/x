public class NoLazySingleton {
	private NoLazySingleton(){
        System.out.println("����NoLazySingletonʵ��һ�Σ�");
    }
 
    //˽�еġ���̬��ʵ��������Ϊ˽�еķ�ֹ�ⲿֱ�ӷ��ʸ�ʵ������������Ϊ��̬�ģ�˵����ʵ����LazySingleton���͵�Ψһ��
    //��ϵͳ����NoLazySingleton���ļ���ʱ�򣬾ʹ����˸����ʵ��
    private static NoLazySingleton instance = new NoLazySingleton();
 
    //���еķ��ʵ���ʵ���ķ���
    public static NoLazySingleton getInstance(){
        return instance;
    }
}
