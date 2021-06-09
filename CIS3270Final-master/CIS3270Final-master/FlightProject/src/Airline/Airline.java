package Airline;
import java.util.ArrayList; 
import java.util.Random; 


public class Airline {
	String description; 
	String address;

	Airline(){
		
	}
	
	public Airline(String newDesc, String newAdd){
		description = newDesc; 
		address = newAdd; 
		
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String newDesc) {
		this.description = newDesc; 
	}
	
	public String getAddress() {
		return address; 
	}
	
	public void setAddress(String newAdd) {
		this.address = newAdd;
	}
	
	
	public String setCustomerSeat() {
		
		ArrayList<	String> seats = new ArrayList<>();
		
		Random rnd = new Random();
		char c = (char) ('a' + rnd.nextInt(3));
		int seatNum = (1 + rnd.nextInt(50)); 
		String seat = Character.toString(c) + seatNum ; 
		
		for(int i = 0; i < seats.size(); i++) {
			if (seats.get(i) == seat) {
				return seat + "taken";
			}
		}
		
		return seat; 
		
	}
	
	public void giveTicket(String ticket) {
		
		
	}
	
	
	public void showAvailableSeats(int availSeats) {
		
		
		
	}
	
	public void computeEarnings(long profit) {

		
	}
	
	
	public void makeListofReservedCustomer(String reserved) {
		
		
		
	}
	
	
}
