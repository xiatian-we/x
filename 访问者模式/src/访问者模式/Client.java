package ������ģʽ;

import java.util.List;

public class Client {
	public static void main(String[] args){
        List<Person> list = Allperson.getList();
        System.out.println("�õ�����:");
        for(Person e: list){
            e.accept(new VisitorName());
        }
        System.out.println("�õ�����:");
        for(Person e: list){
            e.accept(new VisitorAge());
        }
    }
}
