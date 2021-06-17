package 享元模式;

public abstract class IgoChessman {
	//抽象享元类
	public abstract String getColor();  

    public void display() {  
        System.out.println("棋子颜色：" + this.getColor());    
    }  
}
