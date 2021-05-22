package 观察者模式;

public class VideoObserver extends Observer{
	VideoObserver(String name,Subject sub) {
		super(name,sub);
	}
	public void updata() {
		System.out.println(this.sub.getState() +" "+ this.name + "关闭视频，开始做视频。");
	}
}
