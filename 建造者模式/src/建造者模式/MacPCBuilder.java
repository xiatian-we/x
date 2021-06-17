package 建造者模式;

public class MacPCBuilder extends PCBuilder {
    private PC pc;

    public MacPCBuilder(String keyboard, String mouse) {
        pc = new PC(keyboard, mouse);
    }

    public void setMonitor() {
        pc.setMonitor("苹果显示器");
    }

    public void setMaster() {
        pc.setMaster("苹果主机");
    }

    public PC getPC() {
        return pc;
    }
}