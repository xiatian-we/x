package ״̬ģʽ;

public abstract class State {
	private Context context;
	
	public void setContext(Context context) {
		this.context=context;
	}
	public Context getContext() {
		return context;
	}
	public abstract void back();
	public abstract void fore();
}
