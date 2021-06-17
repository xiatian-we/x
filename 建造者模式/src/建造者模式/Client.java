package ������ģʽ;

public class Client {
	public static void main(String[] args) {
        PCDirector director=new PCDirector();
        PCBuilder builder=new MacPCBuilder("�¹�ӣ�Ҽ���","�޼����");
        director.makePC(builder);
        PC macPC=builder.getPC();
        System.out.println("mac pc:"+macPC.toString());

        PCBuilder miPCBuilder=new MiPCBuilder("ikbc����","�װ����");
        director.makePC(miPCBuilder);
        PC miPC=miPCBuilder.getPC();
        System.out.println("mi pc:"+miPC.toString());
    }
}
