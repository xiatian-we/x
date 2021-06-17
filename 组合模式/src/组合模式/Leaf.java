package ���ģʽ;

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
        System.out.println("Ҷ�ӽڵ㲻����ӹ���...");
    }

    public void remove(Component component) {
        System.out.println("Ҷ�ӽڵ㲻��ɾ������...");
    }
}

