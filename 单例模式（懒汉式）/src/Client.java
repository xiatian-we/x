public class Client {
	public static void main(String[] args) {
        LazySingleton lazyInstance1 = LazySingleton.getLazyInstance();
        LazySingleton lazyInstance2 = LazySingleton.getLazyInstance();
        LazySingleton lazyInstance3 = LazySingleton.getLazyInstance();
    }
}
