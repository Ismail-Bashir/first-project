package ismail;

public class Door {

	private double width;
	private double length;
	
	public Door(double width,double length){
		
		
		this.width=width;
		this.length=length;
	}
	
	
	public double DoorArea() {
		
		return getWidth()*getLength();
		
		}
	private double getWidth() {
		
		return this.width;
	}
	private double getLength() {
		return this.length;
		
		
		
	}
}
