package ���󹤳�ģʽ;

public class AFruitAndVegetables implements FruitAndVegetables{
	public Fruit CreateF() {
		return new Apple();
	}
	public Vegetables CreateV() {
		return new tomato();
	}
}
