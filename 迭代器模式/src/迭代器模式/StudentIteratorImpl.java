package µü´úÆ÷Ä£Ê½;

import java.util.List;

public class StudentIteratorImpl implements StudentIterator{
    private List<Student> list;
    private int position = 0;
    private Student currentStudent;

    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

    public boolean hashNext() {
        return position < list.size();
    }
  
    public Student next() {
        currentStudent = list.get(position);
        position ++;
        return currentStudent;
    }
}