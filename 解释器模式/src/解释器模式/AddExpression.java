package ������ģʽ;

import java.util.HashMap;

public class AddExpression extends SymbolExpression {
	 
		public AddExpression(AbstractExpression left, AbstractExpression right) {
			super(left, right);
		}
	 
		// �������������ʽ����Ľ��������
		public int interprete(HashMap<String, Integer> var) {
			return super.left.interprete(var) + super.right.interprete(var);
		}
	}