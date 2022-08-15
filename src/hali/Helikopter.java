package hali;

public class Helikopter {

	int kuyrukNumarasi;
	private Pervane pervane;
	private Motor motor;
	private Depo depo;
	
	
	
	
	
	public Helikopter(int kuyrukNumarasi, Pervane pervane, Motor motor, Depo depo) {
	
		this.kuyrukNumarasi = kuyrukNumarasi;
		this.pervane = pervane;
		this.motor = motor;
		this.depo = depo;
	}

	public Helikopter(int kuyrukNumarasi2, Motor engineMachine, Pervane roboSky, Depo hanGar) {
		// TODO Auto-generated constructor stub
	}

	public int getKuyrukNumarasi() {
		return kuyrukNumarasi;
	}
	
	public void setKuyrukNumarasi(int kuyrukNumarasi) {
		this.kuyrukNumarasi = kuyrukNumarasi;
	}
	
	public Pervane getPervane() {
		return pervane;
	}
	
	public void setPervane(Pervane pervane) {
		this.pervane = pervane;
	}
	
	public Motor getMotor() {
		return motor;
	}
	
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
	public Depo getDepo() {
		return depo;
	}
	
	public void setDepo(Depo depo) {
		this.depo = depo;
	}

	
}
