package ����ģʽ��ְ����ģʽ;

import java.util.ArrayList;
import java.util.List;
 
public abstract class Command {
    public abstract String execute(CommandVO vo);
 
    // ��������
    protected final List<? extends CommandName> buildChain(
            Class<? extends CommandName> abstractClass) {
        // ȡ�����������µ�����
        List<Class> classes = ClassUtils.getSonClass(abstractClass);
        // ��������ʵ���������������ϵ
        List<CommandName> commandNameList = new ArrayList<CommandName>();
        for (Class c : classes) {
            CommandName commandName = null;
            try {
                // ����ʵ��
                commandName = (CommandName) Class.forName(c.getName())
                        .newInstance();
            } catch (Exception e) {
                // �쳣����
            }
            // ��������
            if (commandNameList.size() > 0) {
                commandNameList.add(commandName);
            }
        }
        return commandNameList;
 
    }
}
