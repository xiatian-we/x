package 观察者模式;

public class Client {
	public static void main(String[] args) {
		Subject haoren=new Teacher();
		Observer xiaoming=new GameObserver("小明  ",haoren);
		Observer xiaobai=new VideoObserver("小白  ",haoren);
		
		haoren.attach(xiaoming);
		haoren.attach(xiaobai);
		
		haoren.setState("向老师过来了，");
		haoren.notifyObserver();
	}
}
