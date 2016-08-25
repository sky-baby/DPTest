package test.bridge;

public class BridgeTest {

	public static void main(String[] args) {
		Phone phoneA = new PhoneA();
		Phone phoneB = new PhoneB();
		Phone phoneC = new PhoneC();
		
		phoneA.run("video");
		phoneA.run("video1");
		phoneA.addSoft("game", new GameSoft());
		phoneA.run("game");
		
		phoneB.addSoft("music", new MusicSoft());
		phoneB.run("music");
		phoneB.addSoft("game", new GameSoft());
		phoneB.run("game");
		
		phoneC.addSoft("music", new MusicSoft());
		phoneC.run("music");
		phoneC.addSoft("game", new GameSoft());
		phoneC.run("game");

	}

}
