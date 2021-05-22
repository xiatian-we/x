package ״̬ģʽ;

public class Context {
	private State state;
	
	public Context() {
		State01 state=new State01();
		state.setContext(this);
		this.state=state;
	}
	public void setState(State state) {
		this.state=state;
	}
	public void back() {
		this.state.back();
	}
	public void fore() {
		this.state.fore();
	}
}
