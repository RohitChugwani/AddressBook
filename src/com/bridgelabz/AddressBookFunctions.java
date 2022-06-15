package com.bridgelabz;

import java.util.Scanner;

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
    void createContact()
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter first name");
        firstName = scn.next();
        System.out.println("enter last name");
        lastName = scn.next();
        System.out.println("enter Address");
        address = scn.next();
        System.out.println("enter City");
        city = scn.next();
        System.out.println("enter State");
        state = scn.next();
        System.out.println("enter mobile number ");
        contactNumber = scn.next();
        System.out.println("enter email id");
        emailId = scn.next();
        System.out.println("enter zip code");
        zip = scn.next();

    }
}
