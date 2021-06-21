package Day12_OopsProgram;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressMain {
	 public static void main(String[] args) {
	        System.out.println("Welcome to AddressBook");
	        ArrayList<Address>List=new ArrayList<>();
	        Scanner s= new Scanner(System.in);
	        while (true){
	            System.out.println("Enter 1 to Add Contacts");//Taking Input From User
	            System.out.println("Enter 2 to View Contacts");
	            System.out.println("Enter 3 to Edit Contacts");
	            System.out.println("Enter 4 to Delete Contacts");
	            System.out.println("Enter 5 to Exit");
	            int choice= s.nextInt();

	            switch (choice){
	                case 1:
	                    System.out.println("Enter First Name");
	                    String firstname=s.next();
	                    System.out.println("Enter Last Name");
	                    String lastname=s.next();
	                    System.out.println("Enter Address");
	                    String address=s.next();
	                    System.out.println("Enter City");
	                    String city=s.next();
	                    System.out.println("Enter State");
	                    String state=s.next();
	                    System.out.println("Enter Zip Code");
	                    int zip=s.nextInt();
	                    System.out.println("Enter Phone Number");
	                     long phonenumber=s.nextLong();
	                    System.out.println("Enter Email Address");
	                    String email=s.next();
	                    Address address1= new Address();
	                    address1.setFirstname(firstname);
	                    address1.setLastname(lastname);
	                    address1.setAddress(address);
	                    address1.setCity(city);
	                    address1.setState(state);
	                    address1.setZip(zip);
	                    address1.setPhonenumber(phonenumber);
	                    address1.setEmail(email);
	                    List.add(address1);
	                    break;

	                case 2:
	                    for(Address address2:List){
	                        System.out.println(address2.getFirstname()+" "+address2.getLastname()+" "+address2.getAddress()+" "+address2.getCity()+" "+address2.getState()+" "+address2.getZip()+" "+address2.getPhonenumber()+" "+address2.getEmail());
	                    }
	                    break;
	                case  3:
	                    System.out.println("Enter First Name");
	                    String FirstName= s.next();
	                    System.out.println("Enter Last Name");
	                    String LastName=s.next();
	                    for(int i=0; i < List.size();i++){
	                        if(List.get(i).getFirstname().equals(FirstName) && List.get(i).getLastname().equals(LastName)) {
	                            System.out.println("Enter Address");
	                            String newaddress = s.next();
	                            System.out.println("Enter City");
	                            String newcity = s.next();
	                            System.out.println("Enter State");
	                            String newstate = s.next();
	                            System.out.println("Enter Zip");
	                            int newzip = s.nextInt();
	                            System.out.println("Enter Phone Number");
	                            long newphonenumber = s.nextLong();
	                            System.out.println("Enter Email");
	                            String newemail = s.next();
	                            List.get(i).setAddress(newaddress);
	                            List.get(i).setCity(newcity);
	                            List.get(i).setState(newstate);
	                            List.get(i).setZip(newzip);
	                            List.get(i).setPhonenumber(newphonenumber);
	                            List.get(i).setEmail(newemail);
	                            break;
	                        }
	                        break;
	                      }
	                    break;
	                case 4:
	                    System.out.println("Enter First Name");
	                    String deletefirstname=s.next();
	                    System.out.println("Enter Last Name");
	                    String deletelastname=s.next();
	                    for(int i=0; i<List.size();i++){
	                        if(List.get(i).getFirstname().equals(deletefirstname) && List.get(i).getLastname().equals(deletelastname)){
	                            List.remove(i);
	                            break;
	                        }
	                    }
	                    }
	            if(choice == 5){
	                break;
	            }
	            }
	        }
	    }



