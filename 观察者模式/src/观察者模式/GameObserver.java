package �۲���ģʽ;

public class GameObserver extends Observer{
	GameObserver(String name,Subject sub){
		super(name,sub);
	}
	public void updata() {
		System.out.println(this.sub.getState() + " " +this.name + "�ر���Ϸ����ʼ��ʵ�顣");
	}
}
