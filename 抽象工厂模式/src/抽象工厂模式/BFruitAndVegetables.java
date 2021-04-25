package 抽象工厂模式;

public class BFruitAndVegetables implements FruitAndVegetables{
	public Fruit CreateF() {
		return new Banana();
	}
	public Vegetables CreateV() {
		return new cabbage();
	}
}
