
public class Game {

	/**
	 * Singleton pattern
	 */
	public static Game game;
	
	/**
	 * 
	 * @return game object
	 */
	public static Game getGame() {
		
		if(game == null) {
			game = new Game();
		}
		
		return game;
	}
	
	//Tick tack toe matrix
	private String[][] matrix = {{"-","-","-"}
								,{"-","-","-"},
								{"-","-","-"}};
	//current player role
	private boolean role = false;
	
	public void updateMatrix(String s,int i,int j) {
		matrix[i][j] = s;
	}
	
	/**
	 * check if the with the symbol has won the game
	 * 
	 * @param symbole
	 * @return boolean
	 */
	public boolean checkWin(String symbole) {
		if((matrix[0][0].equals(symbole) && matrix[0][1].equals(symbole) && matrix[0][2].equals(symbole))
			|| (matrix[0][0].equals(symbole) && matrix[1][1].equals(symbole) && matrix[2][2].equals(symbole))
			|| (matrix[0][1].equals(symbole) && matrix[0][2].equals(symbole) && matrix[0][3].equals(symbole))
			|| (matrix[1][0].equals(symbole) && matrix[1][1].equals(symbole) && matrix[1][2].equals(symbole))
			|| (matrix[2][0].equals(symbole) && matrix[2][1].equals(symbole) && matrix[2][2].equals(symbole))
			|| (matrix[0][1].equals(symbole) && matrix[1][1].equals(symbole) && matrix[2][1].equals(symbole))
			|| (matrix[0][2].equals(symbole) && matrix[1][2].equals(symbole) && matrix[2][2].equals(symbole))
			|| (matrix[0][2].equals(symbole) && matrix[1][1].equals(symbole) && matrix[2][0].equals(symbole))) {
			
			return true;
		}
		return false;
	}
	
	//role getter
	public boolean getRole() {
		return this.role;
	}
	public void setRole(boolean role) {
		this.role = role;
	}
	
	public void printMatrix() {
		for (int i =0 ; i < 3 ; i++) {
			System.out.print("||");
			for (int j =0 ; j < 3 ; j++) {
				System.out.print(this.matrix[i][j] + " || ");
			}
			System.out.print("\n");
		}
	}
	
	public boolean isEmpty(int i,int j) {
		return matrix[i][j] == "-";
	}
	
}
