package ����ģʽ��ְ����ģʽ;

public abstract class CommandName {
    private CommandName nextOperator;
 
    public final String handleMessage(CommandVO vo) {
        // ������
        String result = "";
        // �ж��Ƿ����Լ�����Ĳ���
        if (vo.getParam().size() == 0
                || vo.getParam().contains(this.getOperateParam())) {
            result = this.echo(vo);
        } else {
            if (this.nextOperator != null) {
                result = this.nextOperator.handleMessage(vo);
            } else {
                result = "�����޷�ִ��";
            }
        }
        return result;
    }
 
    // ����ʣ�������˭������
    public void setNext(CommandName _operator) {
        this.nextOperator = _operator;
    }
 
    // ÿ�������߶�Ҫ����һ����׺����
    protected abstract String getOperateParam();
 
    // ÿ�������߶�Ҫʵ�ֱ��봦������
    protected abstract String echo(CommandVO vo);
 
}
