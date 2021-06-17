package ²ßÂÔÄ£Ê½;

public class OperationDivide implements Strategy {
    public int doOperation(int num1, int num2) {
        System.out.println("divide: " + num1 + "/" + num2);
        return num1 / num2;
    }
}