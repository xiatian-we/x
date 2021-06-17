package 组合模式;

public abstract class Component {
    public abstract void display(int depth);
    //添加构件      
    public void add(Component component){};
    //删除构件
    public void remove(Component component){};
}