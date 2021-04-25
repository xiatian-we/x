package 抽象工厂模式;

public class AFruitAndVegetables implements FruitAndVegetables{
	public Fruit CreateF() {
		return new Apple();
	}
	public Vegetables CreateV() {
		return new tomato();
	}
}
