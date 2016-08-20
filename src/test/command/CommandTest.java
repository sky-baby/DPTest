package test.command;

public class CommandTest {

	public static void main(String[] args) {
		CommandControl commandControl = new CommandControl();
		Light redLight = new Light("red");
		Chef liChef = new Chef("李师傅");
		LightOnCommand lightOnCommand = new LightOnCommand(redLight);
		LightOffCommand lightOffCommand = new LightOffCommand(redLight);
		CookEggCommand cookEggCommand = new CookEggCommand(liChef);
		CookPorkCommand cookPorkCommand = new CookPorkCommand(liChef);
		commandControl.exec(CommandOrder.COOK_EGG);
		commandControl.undo();
		commandControl.addCommand(CommandOrder.COOK_EGG, cookEggCommand);
		commandControl.exec(CommandOrder.COOK_EGG);
		commandControl.undo();
		commandControl.undo();
		commandControl.addCommand(CommandOrder.COOK_PORK, cookPorkCommand);
		commandControl.addCommand(CommandOrder.ON_LIGHT, lightOnCommand);
		commandControl.addCommand(CommandOrder.OFF_LIGHT, lightOffCommand);
		commandControl.exec(CommandOrder.COOK_EGG);
		commandControl.exec(CommandOrder.ON_LIGHT);
		commandControl.exec(CommandOrder.OFF_LIGHT);
		commandControl.undo();
		commandControl.undo();
		commandControl.exec(CommandOrder.COOK_PORK);
		

	}

}
