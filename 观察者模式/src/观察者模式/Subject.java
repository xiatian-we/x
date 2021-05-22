package 观察者模式;

import java.util.ArrayList;

public abstract class Subject {
	protected ArrayList<Observer> gObservers=new ArrayList<Observer> ();
	public void attach(Observer gOb) {
		gObservers.add(gOb);
	}
	public void Detach(Observer gOb) {
		gObservers.remove(gOb);
	}
	public void notifyObserver() {
		for(Observer part:gObservers) {
			part.updata();
		}
	}
	public abstract void setState(String action);
	public abstract String getState();
}
