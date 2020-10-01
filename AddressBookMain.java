public class AddressBookMain
{
        private String firstName;
	private String lastName;
	private String address;
        private String city;
	private String state;
	private int zip;
	private String phoneNum;
	private String emailId;

        public AddressBookMain (String firstName, String lastName, String address, String city, String state, int zip, String phoneNum, String emailId)
        {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
                this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNum = phoneNum;
		this.emailId = emailId;
       }
       public void Display()
       {
                 System.out.println("First Name: " + firstName);
                 System.out.println("Last Name: " + lastName);
                 System.out.println("Address: " + address);
                 System.out.println("City: " + city);
                 System.out.println("State: " + state);
                 System.out.println("ZIP: " + zip);
                 System.out.println("Phone Number: " + phoneNum);
                 System.out.println("Email ID: " + emailId);
       }

       public static void main(String[] args)
       {
               AddressBookMain ad = new AddressBookMain( "Divya", "Reddy", "ECIL", "Hyderabad", "Telangana", 522003, "9187654321", "divya@gmail.com");
	       ad.Display();
       }

}
