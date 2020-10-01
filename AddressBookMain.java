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

      private void deletePersonDetails(String firstN, String lastN)
      {
               int flag = 0;
               for(int i= 0; i < noOfPersons ; i++)
               {
                        if(detailsArray[i].firstName.equals(firstN) && detailsArray[i].lastName.equals(lastN))
                        {
                              flag = 1;
                              detailsArray[i]=null;
                              System.out.println("Details deleted");
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
/*                System.out.println("--OPTIONS--");
                System.out.println(" 1. Add ");
                System.out.println("2. Delete");
                System.out.println("Choose your option");
                int option = sc.nextInt();
                switch(option)
                {
                        case 1:
*/		        System.out.println("Enter the name of the contact you want to edit and details to be modified");
			System.out.println("First Name: ");
			String firstName = sc.nextLine();
                        sc.nextLine();
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
                        ad.editPersonDetails(firstName,lastName,address,city,state,zip,phoneNum,emailId);
 //                       break;
  //                      case 2:
                        System.out.println("Enter the name of the person whose details are to be deleted");
                        System.out.println("Enter the first name :");
                        String firstN = sc.nextLine();
                        sc.nextLine();
                        System.out.println("Enter the last name :");
                        String lastN = sc.nextLine();
                        ad.deletePersonDetails(firstN,lastN);
                        /*break;
                        default:
                        System.out.println("Wrong option");
                }*/

	}
}




