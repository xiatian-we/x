package ���ģʽ;

public abstract class Component {
    public abstract void display(int depth);
    //��ӹ���      
    public void add(Component component){};
    //ɾ������
    public void remove(Component component){};
}