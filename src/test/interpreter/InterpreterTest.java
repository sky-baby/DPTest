package test.interpreter;

public class InterpreterTest {

	public static void main(String[] args) {
		MyContext context = new MyContext();
		context.setText("8+9");
		Expression mathExpression = new MathExpression();
		mathExpression.interpreter(context);
		Expression strExpression = new StrExpression();
		strExpression.interpreter(context);

	}

}
