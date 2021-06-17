package 访问者模式;

public class Teacher extends Person {
    private String name;
    private int age;
    public Teacher(String name,int age){
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}