package 观察者模式;

	
public abstract class Observer {
	protected String name;
	protected Subject sub;
	Observer(String name,Subject sub) {
		this.name=name;
		this.sub=sub;
	}
	public String getName() {
		return this.name;
	}
	public abstract void updata();
}
