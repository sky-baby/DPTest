package test.bridge;

public class VideoSoft implements ISoft {

	@Override
	public void run() {
		System.out.println("VideoSoft 播放 Video.");

	}

	@Override
	public double getRam() {
		System.out.println(this.getClass().getSimpleName()+" need ram :15.4");
		return 15.4;
	}
	

}
