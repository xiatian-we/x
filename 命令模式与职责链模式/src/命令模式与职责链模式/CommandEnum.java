package ����ģʽ��ְ����ģʽ;

import java.util.ArrayList;
import java.util.List;
 
public enum CommandEnum {
    ls("����ģʽ��ְ����ģʽ.LSCommand");
 
    private String value = "";
 
    // ���幹�캯����Ŀ����Data��value��������ƥ��
 
    private CommandEnum(String value) {
        this.value = value;
    }
 
    public String getValue() {
        return value;
    }
 
    // ��ʽ���е�enum����
    public static List<String> getNames() {
        CommandEnum[] commandEnum = CommandEnum.values();
        List<String> names = new ArrayList<String>();
        for (CommandEnum commandEnum2 : commandEnum) {
            names.add(commandEnum2.name());
        }
        return names;
    }
}

