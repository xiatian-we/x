package 命令模式与职责链模式;

public class LSCommand extends Command {
    public String execute(CommandVO vo) {
        String result = "";
        if (vo.getCommandName().equalsIgnoreCase("ls")
                && vo.getParam().size() == 1 && vo.getaData().size() == 0) {
            if (vo.getParam().contains("") || vo.getParam().contains("A")) {
                AbstractLS al = new LS();
                result = al.echo(vo);
            } else if (vo.getParam().contains("a")
                    || vo.getParam().contains("A")) {
                AbstractLS al = new LS_A();
                result = al.echo(vo);
            } else if (vo.getParam().contains("l")
                    || vo.getParam().contains("L")) {
                AbstractLS al = new LS_L();
                result = al.echo(vo);
            }
        } else {
            result = "../../file/all../";
        }
        return result;
    }
}

