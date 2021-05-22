package 观察者模式;

public class Teacher extends Subject {
	private String teacherAction;
	public String punish() {
		String s=new String();
		for (Observer part:gObservers) {
			s=s+part.getName() +"";
		}
		s=s+"把观察者模式的结构图抄写10遍。";
		return s;
	}
	public void setState(String action) {
		this.teacherAction=action+this.punish();
	}
	public String getState() {
		return this.teacherAction;
	}
}
