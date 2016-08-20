package test.command;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class CommandControl {

	private Map<CommandOrder, ICommand> commands;
	private Stack<ICommand> didCommands;

	public CommandControl() {
		commands = new HashMap<>();
		didCommands = new Stack<>();
	}

	public void addCommand(CommandOrder name, ICommand command) {
		if (commands == null) {
			commands = new HashMap<>();
		}
		commands.put(name, command);
	}

	public void exec(CommandOrder name) {
		if (commands == null || commands.size() == 0) {
			System.out.println("CommandControl中还没有任何命令！！！");
			return;
		} else if (!commands.containsKey(name)) {
			System.out.println("CommandControl中还没有添加" + name + "命令！！！");
			return;
		}
		ICommand didCommand = commands.get(name);
		didCommand.execute();
		didCommands.push(didCommand);
	}

	public void undo() {
		if (didCommands == null || didCommands.isEmpty()) {
			System.out.println("没有可以撤销的命令了！！");
		} else {
			didCommands.pop().undo();
		}
	}

}
