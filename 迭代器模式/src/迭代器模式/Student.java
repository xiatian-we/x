package ������ģʽ;

public class Student {
	private String name;
    private Integer number;

    public Student(String name, Integer number) {
        this.name = name;
        this.number = number;
    }

    public void count() {
        System.out.println(String.format("���� %d �� %s", this.number, this.name));
    }
}
