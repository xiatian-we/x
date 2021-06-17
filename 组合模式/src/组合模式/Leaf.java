package 组合模式;

public class Leaf extends Component{

    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display(int depth) {
        StringBuilder sb = new StringBuilder("");  
        for (int i = 0; i < depth; i++) {  
            sb.append("--");   
        }  
        System.out.println(new String(sb) + this.getName() ) ;   
    }

    public void add(Component component) {
        System.out.println("叶子节点不能添加构件...");
    }

    public void remove(Component component) {
        System.out.println("叶子节点不能删除构件...");
    }
}

