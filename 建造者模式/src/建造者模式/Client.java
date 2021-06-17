package 建造者模式;

public class Client {
	public static void main(String[] args) {
        PCDirector director=new PCDirector();
        PCBuilder builder=new MacPCBuilder("德国樱桃键盘","罗技鼠标");
        director.makePC(builder);
        PC macPC=builder.getPC();
        System.out.println("mac pc:"+macPC.toString());

        PCBuilder miPCBuilder=new MiPCBuilder("ikbc键盘","雷柏鼠标");
        director.makePC(miPCBuilder);
        PC miPC=miPCBuilder.getPC();
        System.out.println("mi pc:"+miPC.toString());
    }
}
