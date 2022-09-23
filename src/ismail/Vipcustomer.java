package ismail;

public class Vipcustomer {
	
	public String name;
	private double creditlimit;
	private String emailAddress;
	

	public Vipcustomer() {
		
		this("ismail",111.0,"ismail@gmail.com");
	}
    public Vipcustomer(String name,double creditLimit) {
    	
    	this(name,creditLimit,"defoultemail");
    }
    
public Vipcustomer(String name,double creditlimit,String emailAddress) {
    	
    	setName(name);//this.name=name;
    	setCreditlimit(creditlimit);//this.creditlimit=creditlimit;
    	setEmailAdress(emailAddress);//this.emailAddress=emailAddress;
    	
    	
    }

public void setName(String name) {
	this.name=name;
}
public void setCreditlimit(double creditlimit) {
	this.creditlimit=creditlimit;
}
 public void setEmailAdress(String emailadress) {
	 this.emailAddress=emailadress;
 }
 

  
}
