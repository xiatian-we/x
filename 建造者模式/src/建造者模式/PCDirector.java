package 建造者模式;

public class PCDirector {
	 public void makePC(PCBuilder builder){
	        builder.setMonitor();
	        builder.setMaster();
	    }
}
