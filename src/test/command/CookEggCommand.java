package test.command;

/**
 * 炒鸡蛋的命令
 * 
 * @author sky-baby
 *
 */
public class CookEggCommand implements ICommand {
	private Chef chef;

	public CookEggCommand(Chef chef) {
		this.chef = chef;
	}

	@Override
	public void execute() {
		System.out.println("执行了炒鸡蛋的命令：");
		chef.cookEgg();

	}

	@Override
	public void undo() {
		System.out.println("撤回了炒鸡蛋的命令：");
		System.out.println(chef.getName() + "停止炒鸡蛋操作");

	}

}
