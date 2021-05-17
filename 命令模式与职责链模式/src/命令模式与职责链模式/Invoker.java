package ����ģʽ��ְ����ģʽ;

public class Invoker {
    // ִ������
    public String exec(String _commandStr) {
        // ����ֵ
        String result = "";
        // ���Ƚ�������
        CommandVO vo = new CommandVO(_commandStr);
        // ��������Ƿ�֧�ָ�����
        if (CommandEnum.getNames().contains(vo.getCommandName())) {
            // �����������
            String className = CommandEnum.valueOf(vo.getCommandName())
                    .getValue();
            Command command;
            try {
                command = (Command) Class.forName(className).newInstance();
                result = command.execute(vo);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            result = "�޷�ִ��������������ʽ!";
        }
        return result;
    }
}
