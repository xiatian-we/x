package ������ģʽ;

public class VisitorAge implements IVisitor {

    public void visit(Student student) {
        System.out.println(student.getAge());
    }

    public void visit(Teacher teacher) {
        System.out.println(teacher.getAge());
    }
}