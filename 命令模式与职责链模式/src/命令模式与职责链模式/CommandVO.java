package ����ģʽ��ְ����ģʽ;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
 
public class CommandVO {
    // ���������������ķָ�����һ���ǿո�
    public final static String DIVIDE_FLAG = " ";
    // �������ǰ�ķ��ţ�Unixһ����-
    public final static String PREFIX = "-";
    // ������
    private String commandName = "";
    // �����б�
    private ArrayList<String> paramList = new ArrayList<String>();
    // �������б�
    private ArrayList<String> dataList = new ArrayList<String>();
 
    // ͨ�����캯�������ݽ���
    public CommandVO(String commandStr) {
        // �����ж�
        if (commandStr != null && commandStr.length() != 0) {
            // ���ݷָ����Ų�ֳ�ִ�з���
            String[] complexStr = commandStr.split(CommandVO.DIVIDE_FLAG);
            // ��һ��������ִ�з���
            this.commandName = complexStr[0];
            // �Ѳ����ŵ�List
            for (int i = 1; i < complexStr.length; i++) {
                String str = complexStr[i];
                // ����ǰ׺���ţ���Ϊ�ǲ���
                if (str.indexOf(CommandVO.PREFIX) == 0) {
                    this.paramList
                            .add(str.replace(CommandVO.PREFIX, "").trim());
                } else {
                    // �������б�
                    this.dataList.add(str.trim());
                }
            }
        } else {
            // ���ݵ��������
            System.out.println("�������ʧ�ܣ����봫��һ���������ִ�У�");
        }
    }
 
    // �õ�������
    public String getCommandName() {
        return this.commandName;
    }
 
    public List<String> getParam() {
        // Ϊ�˷��㴦��ղ���
        if (this.paramList.size() == 0) {
            this.paramList.add("");
        }
        return new ArrayList(new HashSet(this.paramList));
    }
 
    // ��ò�����
    public ArrayList<String> getaData() {
        return this.dataList;
    }
 

    public String formatDate() {
        return this.getaData().toString();
    }
 
}
