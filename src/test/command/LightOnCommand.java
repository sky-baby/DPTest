package test.command;
/**
 * 开灯的命令
 * @author sky-baby
 *
 */
public class LightOnCommand implements ICommand {
	private Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		System.out.println("执行了开灯的命令：");
		light.on();

	}

	@Override
	public void undo() {
		System.out.println("撤回了开灯的命令：");
		light.off();

	}

}
