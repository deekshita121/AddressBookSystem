import java.util.*;
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

       public String toString()
       {
               return "Name : " + firstName + " " + lastName + " Address : " + address + " City : " + city + " State : " + state + " ZIP : " + zip + " phoneNum : " + phoneNum + " Email ID : " + emailId;
       }

       public static void main(String[] args)
       {
               Scanner sc = new Scanner(System.in);
               System.out.println("First Name : ");
               String firstName = sc.nextLine();
               System.out.println("Last Name : ");
               String lastName = sc.nextLine();
               System.out.println("Address : ");
               String address = sc.nextLine();
               System.out.println("City : ");
               String city = sc.nextLine();
               System.out.println("State : ");
               String state = sc.nextLine();
               System.out.println("ZIP : ");
               int zip = sc.nextInt();
               System.out.println("Phone Number : ");
               String phoneNum = sc.nextLine();
               sc.nextLine();
               System.out.println("Email ID : ");
               String emailId = sc.nextLine();
               AddressBookMain ad = new AddressBookMain(firstName, lastName, address, city, state, zip, phoneNum, emailId);
               System.out.println(ad);
       }
}