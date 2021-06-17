package 建造者模式;

public class PC {
	private String keyboard;//键盘
    private String mouse;//鼠标
    private String monitor;//显示器
    private String master;//主机

    public PC(String keyboard, String mouse) {
        this.keyboard = mouse;
        this.mouse = mouse;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public void setMaster(String master) {
        this.master = master;
    }

    @Override
    public String toString() {
        return "PC{" +
                "keyboard='" + keyboard + '\'' +
                ", mouse='" + mouse + '\'' +
                ", monitor='" + monitor + '\'' +
                ", master='" + master + '\'' +
                '}';
    }
}
