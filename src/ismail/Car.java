package ismail;

public class Car extends Vehicle{
	
	private String colour;
	private String model;
	
	
	public Car(int wheels,int speed,String colour, String model)
	{   super(wheels,speed);
		this.colour=colour;
		this.model=model;
		
		
	}
	

}
