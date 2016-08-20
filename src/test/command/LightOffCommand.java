package test.command;
/**
 * 关灯的命令
 * @author sky-baby
 *
 */
public class LightOffCommand implements ICommand {
	private Light light;

	public LightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		System.out.println("执行了关灯的命令：");
		light.on();

	}

	@Override
	public void undo() {
		System.out.println("撤回了关灯的命令：");
		light.on();

	}

}
