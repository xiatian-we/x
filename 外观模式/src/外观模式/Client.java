package 外观模式;

public class Client {
	public static void main(String[] args){
        CarFacade car=new CarFacade();
        car.turnOn();
        car.turnOnRadio();
        car.turnOffRadio();
        car.turnOnAirConditioner();
        car.turnOffAirConditioner();
        car.turnOff();
    }
}
