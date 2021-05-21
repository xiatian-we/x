package 中介者模式;

public class Mediator {
	private Member member01;
    private Member member02;
    private Member member03;

    public Mediator(Member member01, Member member02, Member member03) {
        this.member01 = member01;
        this.member02 = member02;
        this.member03 = member03;
    }

    public void notifyOthers(String info, Member member){
        String name = member.getClass().getName();
        name = name.substring(name.lastIndexOf(".")+1);
        switch (name){
            case "Member01": {
                member02.getInfo(name,info);
                member03.getInfo(name,info);
                break;
            }
            case "Member02": {
                member01.getInfo(name,info);
                member03.getInfo(name,info);
                break;
            }
            case "Member03": {
                member01.getInfo(name,info);
                member02.getInfo(name,info);
                break;
            }
        }
    }
}

