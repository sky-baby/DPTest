package test.interpreter;

public class MathExpression extends Expression {

	@Override
	public void interpreter(MyContext context) {
		String str = context.getText();
		String[] s1;
		String result = null;
		if (str.contains("+")) {
			s1 = str.split("[+]");
			result = (Double.parseDouble(s1[0]) + Double.parseDouble(s1[1])) + "";
		}
		print(str, result);
	}

	private void print(String input, String output) {
		System.out.println("我是数学解释器：我对" + input + "的解释为：" + output);
	}

}
