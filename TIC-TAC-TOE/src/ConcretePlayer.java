
public class ConcretePlayer implements Player{

	private String name;
	private String symbole;
	private boolean role;
	
	
	public ConcretePlayer( String name , String symbole , boolean role) {
		this.name = name;
		this.symbole = symbole;
		this.role = role;
	}
	@Override
	public void play(int i , int j) {
		// TODO Auto-generated method stub
		Command command = new PlayRole(i,j,this.symbole);
		CommandManager.getCommandeManager().execute(command);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isRole() {
		return role;
	}

	public void setRole(boolean role) {
		this.role = role;
	}

	public boolean getRole() {
		return this.role;
	}
	public void setSymbole(String symbole) {
		this.symbole = symbole;
	}
	public String getSymbole() {
		return this.symbole;
	}
	
	
	
	

}
