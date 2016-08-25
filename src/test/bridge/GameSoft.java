package test.bridge;

public class GameSoft implements ISoft {

	@Override
	public void run() {
		System.out.println("GameSoft 运行 Game.");

	}

	@Override
	public double getRam() {
		System.out.println(this.getClass().getSimpleName() + " need ram :25.4");
		return 25.4;
	}
}
