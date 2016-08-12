package test.facade;

public class Facade {
	private DoctorA doctorA;
	private DoctorB doctorB;
	private Nurse nurse;

	public Facade() {
		doctorA = new DoctorA();
		doctorB = new DoctorB();
		nurse = new Nurse();
	}

	public void surgical() {
		doctorA.surgical();
	}

	public void dentistry() {
		doctorB.dentistry();
	}

	public void rounds() {
		nurse.rounds();
	}
	public void surgery(){
		doctorA.main4Surgery();
		doctorB.secondary4Surgery();
	}

}
