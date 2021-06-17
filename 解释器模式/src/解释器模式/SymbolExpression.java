package 解释器模式;

public abstract class SymbolExpression implements AbstractExpression {
	 
		protected AbstractExpression left;
		protected AbstractExpression right;
	 
		// 非终结符表达式的解释操作只关心自己左右两个表达式的结果
		public SymbolExpression(AbstractExpression left, AbstractExpression right) {
			this.left = left;
			this.right = right;
		}
	 
	}