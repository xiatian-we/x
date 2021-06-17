package 解释器模式;
import java.util.HashMap;
public interface AbstractExpression {
	// 每个表达式都必须有一个解释操作
		public int interprete(HashMap<String, Integer> var);
}
