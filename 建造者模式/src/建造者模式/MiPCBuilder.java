package 建造者模式;

public class MiPCBuilder extends PCBuilder {
    private PC pc;

    public MiPCBuilder(String keyboard, String mouse) {
        pc = new PC(keyboard, mouse);
    }

    public void setMonitor() {
        pc.setMonitor("小米显示器");
    }

    public void setMaster() {
        pc.setMaster("小米主机");
    }

    public PC getPC() {
        return pc;
    }
}
