package 解释器模式;

import java.util.HashMap;

public class AddExpression extends SymbolExpression {
	 
		public AddExpression(AbstractExpression left, AbstractExpression right) {
			super(left, right);
		}
	 
		// 把左右两个表达式运算的结果加起来
		public int interprete(HashMap<String, Integer> var) {
			return super.left.interprete(var) + super.right.interprete(var);
		}
	}