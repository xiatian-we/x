package 抽象工厂模式;


public class Client {
	public static void main(String args[]) {
		FruitAndVegetables fav = new AFruitAndVegetables();
		
		Fruit fruit = fav.CreateF();
		Vegetables vegetables = fav.CreateV();
		
		fruit.eat();
		vegetables.wash();
		
	}
}
