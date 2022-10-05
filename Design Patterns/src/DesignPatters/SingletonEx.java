package DesignPatters;

class GameMatch {
	private static GameMatch haloGameMatch;
	private GameMatch(){ }
	public static GameMatch getInstance(){
		if (haloGameMatch == null){
			haloGameMatch = new GameMatch();
		}
		return haloGameMatch;
	}
	public void playingGame(){
		System.out.println("has joined this Halo game session" + "(" + this + ")");
	}
}

class Gamer {
	public String gamer;
	public Gamer(String gamer){
		this.gamer = gamer;
	}
	public void displayGamer(){
		System.out.print(gamer + "(" + this + ")");
	}
}

public class SingletonEx {
	public static void main(String[] args) {
		GameMatch haloGameMatch = null;
		for (int i =0; i<6;i++){
			haloGameMatch = GameMatch.getInstance();
			Gamer gamer = new Gamer("Gamer" + (i+1));
			gamer.displayGamer();
			haloGameMatch.playingGame();
		}
	}
}


