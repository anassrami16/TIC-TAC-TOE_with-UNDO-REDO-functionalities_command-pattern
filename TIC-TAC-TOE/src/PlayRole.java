
public class PlayRole implements Command{

	private int i;
	private int j;
	private String symbole;
	
	
	public PlayRole(int i , int j , String symbole) {
		this.i = i;
		this.j = j;
		this.symbole = symbole;
	}
	
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		Game.getGame().updateMatrix(this.symbole, i, j);
		Game.getGame().setRole(!Game.getGame().getRole());
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		Game.getGame().updateMatrix("-", i, j);
		Game.getGame().setRole(!Game.getGame().getRole());
	}

}
