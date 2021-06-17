package 访问者模式;

public class Student extends Person {
    private String name;
    private int age;
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}