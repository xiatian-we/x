package 访问者模式;

import java.util.List;

public class Client {
	public static void main(String[] args){
        List<Person> list = Allperson.getList();
        System.out.println("得到名字:");
        for(Person e: list){
            e.accept(new VisitorName());
        }
        System.out.println("得到年龄:");
        for(Person e: list){
            e.accept(new VisitorAge());
        }
    }
}
