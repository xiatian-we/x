package 原型模式;

public class Apple extends Shape {

    public Apple(){
        type = "Apple";
    }

    public void buy() {
        System.out.println("buy() method: Apple");
    }
}