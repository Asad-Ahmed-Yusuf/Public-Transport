package Airline;

public class Ticket {
	long price; 
	int seatNo;
	
	Ticket(){
		
	}
	
	Ticket(long newPrice,int newSeatNo){
		this.price = newPrice;
		this.seatNo = newSeatNo; 
	}
	
	public long getPrice() {
		return price;
	}
	
	public void setPrice(long newPrice) {
		this.price = newPrice ;
	}
	
	public int getSeatNo() {
		return seatNo; 
	}
	
	public void setSeatNo(int newSeatNo) {
		this.seatNo = newSeatNo; 
	}
	
}
