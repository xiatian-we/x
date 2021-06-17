package ������ģʽ;

public class Client {
	public static void main(String[] args) {
        StudentAggregate classOne = new StudentAggregateImpl();
        classOne.addStudent(new Student("����", 1));
        classOne.addStudent(new Student("����", 2));
        classOne.addStudent(new Student("����", 3));
        classOne.addStudent(new Student("����", 4));

        // ����������
        StudentIterator iterator = classOne.getStudentIterator();
        while (iterator.hashNext()){
            Student student = iterator.next();
            student.count();
        }
    }
}
