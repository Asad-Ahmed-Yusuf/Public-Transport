package project;

	public class customer {

		private String  name;
		private String address;
		private String emailAddress;
		private int CreditCardNumber;
		private int passportnumber;
		private boolean reservation;
		private int seatNo; 
		
		
		
		public String getName(String newname) {
			
			return name;
		}
		
		public void  Setname (String nname) {
				
				name =nname;			}
		
		
		public String getAddress (String newaddress) {
			
			return address;
			
		}
		
		public void setAddress (String newaddresss) {
			
			address = newaddresss;
			
		}
		
		public String getEmail(String emaill) {
			
			return emailAddress;
		}
		
		public void setEmail(String newemail) {
			
			emailAddress = newemail;
		}
		
		public int getCreditCardNumber (int creditno) {
			
			return CreditCardNumber;
		}
		
		public void setCreditCardno(int creditno) {
			
			CreditCardNumber = creditno;
		}
		
		public int getPassportno(int passportno) {
			
			return passportnumber;
		}
		
		public void setPassportNo(int passportno ) {
			passportnumber=passportno ;
			
		}
		
		public boolean getReserationNo () {
			
			return  reservation;
		}
		
		public  boolean setReservation () {
			
			return reservation;
		}
		
		public int getSeatno (int seatnumber) {
			
			return seatNo;
		}
		
		public void setSeatno(int seatnumb) {
			
			seatNo= seatnumb;
		}
		
		
		public  void  selectseat(int seat) {
	          // get seatnumber from superclass
		}
		
		public boolean checkAvailability () {
			
			
			// get from superclass
		}
		
		public int getTicket (int ticket) {
			// get from superclass
			
		}
		
		
}


