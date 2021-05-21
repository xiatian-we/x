package 中介者模式;

public class Member01 extends Member{
    public void notifyOthers(String info){
        super.mediator.notifyOthers(info,this);
    }
}