package ²ßÂÔÄ£Ê½;

public class OperationSubtract implements Strategy {
    public int doOperation(int num1, int num2) {
        System.out.println("substract: " + num1 + "-" + num2);
        return num1 - num2;
    }
}