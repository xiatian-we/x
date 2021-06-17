package 访问者模式;

import java.util.ArrayList;
import java.util.List;

public class Allperson {
	public static List<Person> getList(){
        List<Person> list = new ArrayList<Person>();
        Student s1 = new Student("路飞",20);
        Student s2 = new Student("索隆",19);
        Teacher t1 = new Teacher("红发",44);
        Teacher t2 = new Teacher("雷利",59);
        list.add(s1);
        list.add(s2);
        list.add(t1);
        list.add(t2);
        return list;
    }
}
