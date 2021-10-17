import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CommandManager {
	
	/**
	 * commandeManager singleton Pattern
	 */
	public static CommandManager commandManager;
	
	/**
	 * @return the CommandeManager
	 */
	public static CommandManager getCommandeManager() {
		if(commandManager == null) {
			commandManager = new CommandManager();
		}
		return commandManager;
	}
	
	
	private Stack<Command> history = new Stack<Command>();
	private Stack<Command> redo = new Stack<Command>();
	
	
	public void clearRedo() {
		redo.clear();
	}
	public void redo() {
		if(!redo.empty()) {
			Command command = this.redo.pop();
			command.execute();
			history.push(command);
		}
		
	}
	public void undo() {
		if(!history.empty()) {
			Command command = this.history.pop();
			command.undo();
			redo.push(command);
		}
		
		
	}
	
	
	public void execute(Command command) {
		this.history.push(command);
		this.redo.clear();
		command.execute();
	}


}

