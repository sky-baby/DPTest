package test.bridge;

public class MusicSoft implements ISoft {

	@Override
	public void run() {
		System.out.println("MusicSoft 播放 Music.");

	}
	@Override
	public double getRam() {
		System.out.println(this.getClass().getSimpleName()+" need ram :9.4");
		return 9.4;
	}
}
