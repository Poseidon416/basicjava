
public class Application {

	public static void main(String[] args) {
		Player p1 = new Player();
		p1.play();
		int score = p1.getScore();
		System.out.println("The score was: " + score);
		p1.play();
		p1.getScore(10);

	}

}
