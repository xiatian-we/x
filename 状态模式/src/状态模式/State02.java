package ״̬ģʽ;

public class State02 extends State{
	public void back() {
		System.out.println("State02 back");
		System.out.println("State02 --> State01");
		State01 state01=new State01();
		state01.setContext(super.getContext());
		super.getContext().setState(state01);
	}
	public void fore() {
		System.out.println("State02 fore");
		System.out.println("State02 --> State03");
		State03 state03=new State03();
		state03.setContext(super.getContext());
		super.getContext().setState(state03);
	}
}
