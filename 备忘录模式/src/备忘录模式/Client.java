package ����¼ģʽ;

public class Client {
public static void main(String[] args) {
		
		MementoManager manager = new MementoManager();
		
		GameRole role = new GameRole();
		
		role.initState();
		System.out.println("��ʼ��Ϸǰ");
		role.showState();
		
		manager.setMemento(role.createMemento());//ս��ǰ����״̬
		
		role.fight();
		System.out.println("ս��������");
		role.showState();
		
		role.restoreMemento(manager.getMemento());//ս�������ָ�״̬
		System.out.println("�ָ�ս��ǰ״̬");
		role.showState();
}
}
