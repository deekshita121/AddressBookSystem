public class PersonDetails
{
        public String firstName;
	public String lastName;
	public String address;
        public String city;
	public String state;
	public int zip;
	public String phoneNum;
	public String emailId;

        public void setPersonDetails(String firstName, String lastName, String address, String city, String state, int zip, String phoneNum, String emailId)
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
                return "Name : " + firstName + " " + lastName + "Address : " + address + " City : " + city + " State : " + state + " ZIP : " + zip + " PhoneNum : " + phoneNum + "Email ID : " + emailId;
       }
}
