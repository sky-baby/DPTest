package test.command;

/**
 * 炒红烧肉的命令
 * 
 * @author sky-baby
 *
 */
public class CookPorkCommand implements ICommand {
	private Chef chef;

	public CookPorkCommand(Chef chef) {
		this.chef = chef;
	}

	@Override
	public void execute() {
		System.out.println("执行了炒红烧肉的命令：");
		chef.cookPork();

	}

	@Override
	public void undo() {
		System.out.println("撤回了炒红烧肉的命令：");
		System.out.println(chef.getName() + "停止炒红烧肉操作");

	}

}
