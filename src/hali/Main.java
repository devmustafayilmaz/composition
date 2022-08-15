package hali;

public class Main {

	public static void main(String[] args) {
		Motor myMotor = new Motor(120,200);
		Pervane myPervane = new Pervane(10,30 );
		Depo myDepo = new Depo(25);
		Helikopter skorsky = new Helikopter(125, myPervane, myMotor, myDepo);
		skorsky.getMotor().motoruCalistir();
		skorsky.getMotor().motoruKapat();
		
		
	}

}
