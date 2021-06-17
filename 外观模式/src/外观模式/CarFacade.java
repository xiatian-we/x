package 外观模式;

public class CarFacade {
	private Engine engine=new Engine();
    private OilTrans oilTrans=new OilTrans();
    private Power power=new Power();
    private Radio radio=new Radio();
    private AirConditioner airConditioner=new AirConditioner();
    
    private boolean isStart=false;
    //使用钥匙发动汽车
    public void turnOn(){
        if(!isStart){
            power.start();
            oilTrans.start();
            engine.start();
            isStart=true;
        }
    }
    
    //关闭汽车系统
    public void turnOff(){
        if(isStart){
            engine.stop();
            oilTrans.stop();
            power.stop();
            isStart=false;
        }
    }
    
    public void turnOnRadio(){
        if(isStart){
            radio.turnOn();
        }
    }
    
    public void turnOffRadio(){
        if(isStart){
            radio.turnOff();
        }
    }
    
    public void turnOnAirConditioner(){
        if(isStart){
            airConditioner.turnOn();
        }
    }
    
    public void turnOffAirConditioner(){
        if(isStart){
            airConditioner.turnOff();
        }
    }
    
}
