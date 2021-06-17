package µü´úÆ÷Ä£Ê½;

public interface StudentAggregate {
	void addStudent(Student student);

    void removeStudent(Student student);

    StudentIterator getStudentIterator();
}
