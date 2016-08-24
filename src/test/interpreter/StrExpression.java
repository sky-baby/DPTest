package test.interpreter;

public class StrExpression extends Expression {

	@Override
	public void interpreter(MyContext context) {
		String str = context.getText();
		String[] s1;
		String result = null;
		if (str.contains("+")) {
			s1 = str.split("[+]");
			result = s1[0] + s1[1];
		}
		print(str, result);
	}

	private void print(String input, String output) {
		System.out.println("我是字符串解释器：我对" + input + "的解释为：" + output);
	}

}
