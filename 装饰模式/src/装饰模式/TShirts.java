package 装饰模式;

public class TShirts extends Finery {
	public void show() {
		System.out.print("T恤    ");// 在实际开发中，此应该为对人数据进行处理的过程。
		super.show();// 父类处理的过程
	}
}
 
 //具体服饰类[ConcreteDecorator]之‘垮裤’
class BigTrouser extends Finery{
	@Override
	public void show() {
		System.out.print("垮裤    ");
		super.show();
	}
}
 //具体服饰类[ConcreteDecorator]之‘破球鞋’
class Sneakers extends Finery{
	public void show() {
		System.out.print("破球鞋    ");
		super.show();
	}
}
  // 具体服饰类[ConcreteDecorator]之‘西装’
class Suit extends Finery{
	public void show() {
		System.out.print("西装    ");
		super.show();
	}
}
 //具体服饰类[ConcreteDecorator]之‘领带’
class Tie extends Finery{
	public void show() {
		System.out.print("领带    ");
		super.show();
	}
}
 // 具体服饰类[ConcreteDecorator]之‘皮鞋’
class LeatherShoes extends Finery{
	public void show() {
		System.out.print("皮鞋    ");
		super.show();
	}
}
