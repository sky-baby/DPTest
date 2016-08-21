package test.template;

public class TemplateTest {

	public static void main(String[] args) {
		Cook potatoFloss = new CookPotatoFloss();
		potatoFloss.Process();
		Cook tomatoEgg = new CookTomatoEgg();
		tomatoEgg.Process();

	}

}
