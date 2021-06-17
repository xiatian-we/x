package ²ßÂÔÄ£Ê½;

public class Client {
	public static void main(String[] args) {
        Context context1 = new Context(new OperationAdd());
        int result1 = context1.executeStrategy(9, 3);
        System.out.println("strategy result: "+result1+"\n");

        Context context2 = new Context(new OperationMultiply());
        int result2 = context2.executeStrategy(9, 3);
        System.out.println("strategy result: "+result2+"\n");

        Context context3 = new Context(new OperationSubtract());
        int result3 = context3.executeStrategy(9, 3);
        System.out.println("strategy result: "+result3+"\n");
    }
}
