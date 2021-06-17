package ������ģʽ;

import java.util.ArrayList;
import java.util.List;

public class StudentAggregateImpl implements StudentAggregate {
    private List<Student> list;  // ѧ���б�

    public StudentAggregateImpl() {
        this.list = new ArrayList<Student>();
    }

    @Override
    public void addStudent(Student student) {
        this.list.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        this.list.remove(student);
    }

    @Override
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(list);
    }
}
