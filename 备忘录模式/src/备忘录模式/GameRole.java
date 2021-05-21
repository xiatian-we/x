package ±¸ÍüÂ¼Ä£Ê½;

public class GameRole {
	private int vit;
	private int atk;
	private int def;
	
	
	
	
	public RoleMemento createMemento() {
		
		return new RoleMemento(vit, atk, def);
		
	}
	
	
	public void restoreMemento(RoleMemento memento) {
		this.vit = memento.getVit();
		this.def = memento.getDef();
		this.atk = memento.getAtk();
	}
	
	
	public void initState() {
		this.vit = 100;
		this.atk = 0;
		this.def = 100;
	}
	
	public void fight() {
		this.vit = 0;
		this.atk = 100;
		this.def = 0;
	}
	
	public void showState() {
		System.out.println("Vitality:"+this.vit);
		System.out.println("Attack:"+this.atk);
		System.out.println("Defence:"+this.def);
	}
}
