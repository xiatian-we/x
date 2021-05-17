package 命令模式与职责链模式;

public class LS_A extends AbstractLS {
    
    protected String getOperateParam() {
        return super.A_PARAM;
    }
 
   
    protected String echo(CommandVO vo) {
        return FileManager.ls_a(vo.formatDate());
    }
 
}
