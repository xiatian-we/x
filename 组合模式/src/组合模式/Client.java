package ���ģʽ;

public class Client {
	 public static void main(String[] args) {
	        Composite com1 = new Composite("��֦1");
	        Leaf leaf1 = new Leaf("��Ҷ1");
	        Composite com11 = new Composite("��֦1.1");
	        Leaf leaf11 = new Leaf("��Ҷ1.1");

	        com1.add(leaf1);
	        com1.add(com11);
	        com11.add(leaf11);

	        com1.display(0);
	    }

}
