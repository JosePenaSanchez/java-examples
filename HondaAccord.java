/*
	Honda Accord implements the Vehicle interface.
	Here we write the implementations of interface methods.
*/

public class HondaAccord implements Vehicle{
	@Override
	public void accelerate(){
		System.out.println("HondaAccord is accelerating");
	}
	
	@Override
	public void stop(){
		System.out.println("HondaAccord is stoping");
	}
	
	@Override
	public void steer(){
		System.out.println("Honda Accord is steering");
	}
}