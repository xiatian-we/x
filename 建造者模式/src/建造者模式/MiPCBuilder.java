package ������ģʽ;

public class MiPCBuilder extends PCBuilder {
    private PC pc;

    public MiPCBuilder(String keyboard, String mouse) {
        pc = new PC(keyboard, mouse);
    }

    public void setMonitor() {
        pc.setMonitor("С����ʾ��");
    }

    public void setMaster() {
        pc.setMaster("С������");
    }

    public PC getPC() {
        return pc;
    }
}
