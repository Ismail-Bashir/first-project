package ismail;

public class House {
	
	private String address;
	private Door door;
	private Furniture furniture;
	
	
	
	public House(String address,Door door,Furniture furniture) {
		
		this.address=address;
		this.door=door;
		this.furniture=furniture;
	}
	
public double getDoorArea() {
		
		return this.door.DoorArea();
		
	}
	
	

}
