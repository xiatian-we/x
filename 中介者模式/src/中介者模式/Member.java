package 中介者模式;

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
        System.out.println(this.getClass().getName() + " 收到来自 " + fromWho + " 的消息: " + info);
    }
}

