package com.bridgelabz;

public class AddressBookFunctions {

    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    String contactNumber;
    String emailId;
    String zip;
    void createContact(String firstName,String lastName,String address,String city,String state,String contactNumber,String emailId,String zip)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.contactNumber = contactNumber;
        this.emailId = emailId;
        this.zip = zip;
    }
    void show()
    {
        System.out.println("First name :" +firstName);
        System.out.println("Last name :" +lastName);
        System.out.println("address :" +address);
        System.out.println("City :" +city);
        System.out.println("State:" +state);
        System.out.println("Contact number :" +contactNumber);
        System.out.println("EmailId:" +emailId);
        System.out.println("Zip:" +zip);

    }
}
