public class Client {
	public static void main(String[] args) {
        NoLazySingleton instance = NoLazySingleton.getInstance();
        NoLazySingleton instance1 = NoLazySingleton.getInstance();
        NoLazySingleton instance2 = NoLazySingleton.getInstance();
        NoLazySingleton instance3 = NoLazySingleton.getInstance();
    }
}
