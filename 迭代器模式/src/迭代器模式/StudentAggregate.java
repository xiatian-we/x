package ������ģʽ;

public interface StudentAggregate {
	void addStudent(Student student);

    void removeStudent(Student student);

    StudentIterator getStudentIterator();
}
