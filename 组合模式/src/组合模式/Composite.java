package 组合模式;

import java.util.ArrayList;

public class Composite extends Component{
	//组件构件类
    private String name;

    private ArrayList<Component> ComponentList;

    public Composite(String name) {
        this.name = name;
        this.ComponentList = new ArrayList<Component>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display(int depth) {
        StringBuffer strBuf = new StringBuffer("");  
        for (int i = 0; i < depth; i++) {  
            strBuf.append("--");   
        }  

        System.out.println(new String(strBuf) + this.getName());  

        for (Component c : ComponentList) {  
            //递归显示
            c.display(depth + 2);  
        }  
    }

    public void add(Component component) {
        ComponentList.add(component);
    }

    public void remove(Component component) {
        ComponentList.remove(component);
    }
}

