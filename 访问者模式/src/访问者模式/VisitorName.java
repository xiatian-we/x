package ������ģʽ;

public class VisitorName implements IVisitor {

    public void visit(Student student) {
        System.out.println(student.getName());
    }

    public void visit(Teacher teacher) {
        System.out.println(teacher.getName());
    }
}

