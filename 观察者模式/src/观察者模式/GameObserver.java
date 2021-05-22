package 观察者模式;

public class GameObserver extends Observer{
	GameObserver(String name,Subject sub){
		super(name,sub);
	}
	public void updata() {
		System.out.println(this.sub.getState() + " " +this.name + "关闭游戏，开始做实验。");
	}
}
