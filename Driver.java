/*
	This class holds the main method that will instantiate
	a Vehicle(interface), as a new HondaAccord object, and
	call its functions.
*/

public class Driver{
	public static void main(String[] args){
	
		Vehicle myVehicle = new HondaAccord();
		myVehicle.accelerate();
		myVehicle.stop();
		myVehicle.steer();
	}
}