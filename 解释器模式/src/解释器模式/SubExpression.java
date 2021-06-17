package 解释器模式;

import java.util.HashMap;

public class SubExpression extends SymbolExpression {
	 
		public SubExpression(AbstractExpression left, AbstractExpression right) {
			super(left, right);
		}
	 
		// 左右两个表达式相减
		public int interprete(HashMap<String, Integer> var) {
			return super.left.interprete(var) - super.right.interprete(var);
		}
	}
