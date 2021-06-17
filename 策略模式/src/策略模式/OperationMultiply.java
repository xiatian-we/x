package ²ßÂÔÄ£Ê½;

public class OperationMultiply implements Strategy {
    public int doOperation(int num1, int num2) {
        System.out.println("multiply: " + num1 + "*" + num2);
        return num1 * num2;
    }
}
