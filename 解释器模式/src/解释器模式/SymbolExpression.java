package ������ģʽ;

public abstract class SymbolExpression implements AbstractExpression {
	 
		protected AbstractExpression left;
		protected AbstractExpression right;
	 
		// ���ս�����ʽ�Ľ��Ͳ���ֻ�����Լ������������ʽ�Ľ��
		public SymbolExpression(AbstractExpression left, AbstractExpression right) {
			this.left = left;
			this.right = right;
		}
	 
	}