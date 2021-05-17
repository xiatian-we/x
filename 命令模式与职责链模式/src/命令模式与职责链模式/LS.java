package 命令模式与职责链模式;

public class LS extends AbstractLS {
	 
   
    protected String getOperateParam() {
        return super.DEFAULT_PARAM;
    }
 

    protected String echo(CommandVO vo) {
        return FileManager.ls(vo.formatDate());
    }
 
}

