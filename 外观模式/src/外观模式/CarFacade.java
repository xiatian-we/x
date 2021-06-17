package ���ģʽ;

public class CarFacade {
	private Engine engine=new Engine();
    private OilTrans oilTrans=new OilTrans();
    private Power power=new Power();
    private Radio radio=new Radio();
    private AirConditioner airConditioner=new AirConditioner();
    
    private boolean isStart=false;
    //ʹ��Կ�׷�������
    public void turnOn(){
        if(!isStart){
            power.start();
            oilTrans.start();
            engine.start();
            isStart=true;
        }
    }
    
    //�ر�����ϵͳ
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
