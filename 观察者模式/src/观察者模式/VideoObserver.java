package �۲���ģʽ;

public class VideoObserver extends Observer{
	VideoObserver(String name,Subject sub) {
		super(name,sub);
	}
	public void updata() {
		System.out.println(this.sub.getState() +" "+ this.name + "�ر���Ƶ����ʼ����Ƶ��");
	}
}
