package lifegame;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LifeGame lg=new LifeGame(50,50);
		lg.Init();
		while(true) {
			lg.GameCycle();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
