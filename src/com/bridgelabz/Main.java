package com.bridgelabz;

public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to address book");
        AddressBookFunctions mohit = new AddressBookFunctions();
        mohit.createContact("mohit","raj","Samadhiya colony","gwalior","MP","123","mohit@gmail.com","474001");
        mohit.show();
    }
}
