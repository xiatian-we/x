package �۲���ģʽ;

public class Client {
	public static void main(String[] args) {
		Subject haoren=new Teacher();
		Observer xiaoming=new GameObserver("С��  ",haoren);
		Observer xiaobai=new VideoObserver("С��  ",haoren);
		
		haoren.attach(xiaoming);
		haoren.attach(xiaobai);
		
		haoren.setState("����ʦ�����ˣ�");
		haoren.notifyObserver();
	}
}
