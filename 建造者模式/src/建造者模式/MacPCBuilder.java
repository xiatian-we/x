package ������ģʽ;

public class MacPCBuilder extends PCBuilder {
    private PC pc;

    public MacPCBuilder(String keyboard, String mouse) {
        pc = new PC(keyboard, mouse);
    }

    public void setMonitor() {
        pc.setMonitor("ƻ����ʾ��");
    }

    public void setMaster() {
        pc.setMaster("ƻ������");
    }

    public PC getPC() {
        return pc;
    }
}