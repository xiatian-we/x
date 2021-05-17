package 命令模式与职责链模式;

import java.util.ArrayList;
import java.util.List;
 
public enum CommandEnum {
    ls("命令模式与职责链模式.LSCommand");
 
    private String value = "";
 
    // 定义构造函数，目的是Data（value）类型相匹配
 
    private CommandEnum(String value) {
        this.value = value;
    }
 
    public String getValue() {
        return value;
    }
 
    // 方式所有的enum对象
    public static List<String> getNames() {
        CommandEnum[] commandEnum = CommandEnum.values();
        List<String> names = new ArrayList<String>();
        for (CommandEnum commandEnum2 : commandEnum) {
            names.add(commandEnum2.name());
        }
        return names;
    }
}

