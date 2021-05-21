package 中介者模式;

public class Member02 extends Member{
    public void notifyOthers(String info){
        super.mediator.notifyOthers(info,this);
    }
}
