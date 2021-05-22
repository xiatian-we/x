package ״̬ģʽ;

public class State01 extends State{
	public void back() {
		System.out.println("State01 back");
		System.out.println("State01 --> State03");
		State03 state03=new State03();
		state03.setContext(super.getContext());
		super.getContext().setState(state03);
	}
	public void fore() {
		System.out.println("State01 fore");
		System.out.println("State01 --> State02");
		State02 state02=new State02();
		state02.setContext(super.getContext());
		super.getContext().setState(state02);
	}

}
