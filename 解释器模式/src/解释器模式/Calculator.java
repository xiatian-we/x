package ������ģʽ;

import java.util.HashMap;
import java.util.Stack;

public class Calculator {
	private AbstractExpression expression;
	public Calculator(String expStr) {
		// ����һ����ջ������������Ⱥ�˳��
		Stack<AbstractExpression> stack = new Stack<AbstractExpression>();
		// ���ʽ���Ϊ�ַ�����
		char[] charArray = expStr.toCharArray();
		// ����
		AbstractExpression left = null;
		AbstractExpression right = null;
		for (int i = 0; i < charArray.length; i++) {
			switch (charArray[i]) {
			case '+': // �ӷ�
				left = stack.pop();
				right = new VarExpression(String.valueOf(charArray[++i]));
				stack.push(new AddExpression(left, right));
				break;
 
			case '-': // ����
				left = stack.pop();
				right = new VarExpression(String.valueOf(charArray[++i]));
				stack.push(new SubExpression(left, right));
				break;
			default: // ��ʽ�еı���
				stack.push(new VarExpression(String.valueOf(charArray[i])));
			}
		}
		// ���������׳���
		this.expression = stack.pop();
	}
 
	// ������
	public int calculate(HashMap<String, Integer> var) {
		return this.expression.interprete(var);
	}
}
