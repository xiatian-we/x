package ������ģʽ;

public class PC {
	private String keyboard;//����
    private String mouse;//���
    private String monitor;//��ʾ��
    private String master;//����

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
