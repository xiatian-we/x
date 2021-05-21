package 中介者模式;

public class Client {
	public static void main(String[] args) {

        Member member01 = new Member01();
        Member member02 = new Member02();
        Member member03 = new Member03();
        Mediator mediator = new Mediator(member01, member02, member03);
        member01.setMediator(mediator);
        member02.setMediator(mediator);
        member03.setMediator(mediator);

        member01.notifyOthers("消息1");
        member02.notifyOthers("消息2");
        member03.notifyOthers("消息3");
    }
}

