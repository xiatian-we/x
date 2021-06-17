package ×éºÏÄ£Ê½;

public class Client {
	 public static void main(String[] args) {
	        Composite com1 = new Composite("Ê÷Ö¦1");
	        Leaf leaf1 = new Leaf("Ê÷Ò¶1");
	        Composite com11 = new Composite("Ê÷Ö¦1.1");
	        Leaf leaf11 = new Leaf("Ê÷Ò¶1.1");

	        com1.add(leaf1);
	        com1.add(com11);
	        com11.add(leaf11);

	        com1.display(0);
	    }

}
