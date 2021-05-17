package 命令模式与职责链模式;

public class LS_L extends AbstractLS {
   
    protected String getOperateParam() {
        return super.L_PARAM;
    }
 
    
    protected String echo(CommandVO vo) {
        return FileManager.ls_l(vo.formatDate());
    }
 
}
