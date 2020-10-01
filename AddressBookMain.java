import java.util.*;
public class AddressBookMain
{

      private int noOfPersons = 0;
      private PersonDetails[] detailsArray;
      private AddressBookMain()
      {
              detailsArray = new PersonDetails[5];
      }
      private void addPersonDetails(String firstName, String lastName, String address, String city, String state, int zip, String phoneNum, String emailId)
      {
              detailsArray[noOfPersons] = new PersonDetails();
              detailsArray[noOfPersons].setPersonDetails(firstName, lastName, address, city, state, zip, phoneNum, emailId);
              noOfPersons++;
      }

      private void editPersonDetails(String firstName, String lastName, String address, String city, String state, int zip, String phoneNum, String emailId)
      {
                int flag = 0;
                for(int i = 0; i < noOfPersons; i++)
                {
			if(detailsArray[i].firstName.equals(firstName) && detailsArray[i].lastName.equals(lastName))
                        {
                                flag=1;
				detailsArray[i].setPersonDetails(firstName, lastName, address, city, state, zip, phoneNum, emailId);
				System.out.println("Details Updated");
				System.out.println(detailsArray[i]);
				break;
			}
		}
                if(flag==0)
                {
                       System.out.println("No such name in records");
                }
      }

      public static void main(String[] args)
      {
		Scanner sc = new Scanner(System.in);
		AddressBookMain ad = new AddressBookMain();
		System.out.println("No. of person's details to enter : ");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < n; i++)
                {
                        System.out.println("Enter person "+ i +" details");
			System.out.println("First Name: ");
			String firstName = sc.nextLine();
			System.out.println("Last Name: ");
			String lastName = sc.nextLine();
			System.out.println("Address: ");
			String address = sc.nextLine();
                        System.out.println("City: ");
                        String city = sc.nextLine();
			System.out.println("State: ");
			String state = sc.nextLine();
			System.out.println("ZIP: " );
			int zip = sc.nextInt();
			System.out.println("Phone Num: ");
			String phoneNum = sc.nextLine();
			sc.nextLine();
			System.out.println("Email ID: ");
			String emailId = sc.nextLine();
			ad.addPersonDetails(firstName, lastName, address, city, state, zip, phoneNum, emailId);
		}
		System.out.println("Enter the name of the contact you want to edit and details to be modified");
			System.out.println("First Name: ");
			String firstName = sc.nextLine();
			System.out.println("Last Name: ");
			String lastName = sc.nextLine();
			System.out.println("Address: ");
			String address = sc.nextLine();
                        System.out.println("City: ");
                        String city = sc.nextLine();
			System.out.println("State: ");
			String state = sc.nextLine();
			System.out.println("ZIP: " );
			int zip = sc.nextInt();
			System.out.println("Phone Num: ");
			String phoneNum = sc.nextLine();
			sc.nextLine();
			System.out.println("Email ID: ");
			String emailId = sc.nextLine();
			ad.editPersonDetails(firstName, lastName, address, city, state, zip, phoneNum, emailId);
	}
}




