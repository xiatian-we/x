package �۲���ģʽ;

public class Teacher extends Subject {
	private String teacherAction;
	public String punish() {
		String s=new String();
		for (Observer part:gObservers) {
			s=s+part.getName() +"";
		}
		s=s+"�ѹ۲���ģʽ�Ľṹͼ��д10�顣";
		return s;
	}
	public void setState(String action) {
		this.teacherAction=action+this.punish();
	}
	public String getState() {
		return this.teacherAction;
	}
}
