import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
       
		ConcretePlayer player1 = new ConcretePlayer("anass","x" , true);
		ConcretePlayer player2 = new ConcretePlayer("ali", "o",false);
		ConcretePlayer currentPlayer;
		
		BufferedReader reader = new BufferedReader(
	            new InputStreamReader(System.in));
		
		
		while(true) {
			//print the game matrix
			Game.getGame().printMatrix();
			
			if(Game.getGame().getRole() == player1.getRole()) {
				System.out.println("it's "+ player1.getName()+" role !");
				currentPlayer = player1;
			}
			else {
				System.out.println("it's "+ player2.getName()+" role !");
				currentPlayer = player2;
			}
			
			System.out.println("(undo/redo/"+currentPlayer.getSymbole()+")");
			
			 
			
			try {
				String console = reader.readLine();
				
				if(currentPlayer.getSymbole().equals(console)) {
					System.out.println("please enter line");
					String line = reader.readLine();
					int i = Integer.parseInt(line);
					System.out.println("please enter column");
					String column = reader.readLine();
					int j = Integer.parseInt(column);
					
					currentPlayer.play(i, j);
					
					if(Game.getGame().checkWin(currentPlayer.getSymbole())) {
						System.out.println(currentPlayer.getName()+" won the game !");
						break;
					}
				}
				else if ("redo".equals(console)) {
					CommandManager.getCommandeManager().redo();
				}
				else if ("undo".equals(console)) {
					CommandManager.getCommandeManager().undo();
				}
				else {
					System.out.println("please enter a valid command !");
				}
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	}

}
