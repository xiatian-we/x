public class LazySingleton {
	
    private LazySingleton() {
        System.out.println("����LazySingletonʵ��һ�Σ�");
    }
 
    //˽�еġ���̬��ʵ��������Ϊ˽�еķ�ֹ�ⲿֱ�ӷ��ʸ�ʵ������������Ϊ��̬�ģ�˵����ʵ����LazySingleton���͵�Ψһ��
    //����ʼʱ��û�е��÷���ʵ���ķ�������ôʵ���Ͳ����Լ�����
    private static LazySingleton lazyInstance = null;
 
    //���еķ��ʵ���ʵ���ķ��������ⲿ���÷��ʸ�ʵ���ķ���ʱ��ʵ���ű�����
    public static LazySingleton getLazyInstance() {
        //��ʵ����û�д������򴴽�ʵ������ʵ���Ѿ��������ˣ���ֱ�ӷ���֮ǰ������ʵ��,�����᷵��2��ʵ��
        if (lazyInstance == null) {
            lazyInstance = new LazySingleton();
        }
        return lazyInstance;
    }
}
