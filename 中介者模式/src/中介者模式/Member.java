package �н���ģʽ;

public abstract class Member {
	protected Mediator mediator;
    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void notifyOthers(String info);
    public void getInfo(String fromWho, String info){
        System.out.println(this.getClass().getName() + " �յ����� " + fromWho + " ����Ϣ: " + info);
    }
}

