package 备忘录模式;

public class Client {
public static void main(String[] args) {
		
		MementoManager manager = new MementoManager();
		
		GameRole role = new GameRole();
		
		role.initState();
		System.out.println("开始游戏前");
		role.showState();
		
		manager.setMemento(role.createMemento());//战斗前保存状态
		
		role.fight();
		System.out.println("战斗结束后");
		role.showState();
		
		role.restoreMemento(manager.getMemento());//战斗结束恢复状态
		System.out.println("恢复战斗前状态");
		role.showState();
}
}
