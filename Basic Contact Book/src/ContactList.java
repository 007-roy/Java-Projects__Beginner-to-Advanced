import java.util.ArrayList;
import java.util.List;



public class ContactList extends Contact{


    private int index = 0;

    List<Contact> contacts = new ArrayList<>();




    public void addContact(String name, int phone, String email){


        contacts.add(index,new Contact(name,phone,email));

        System.out.println("Congratulations "+ name + ", Your Account Has Been Created!!!");

        index++;

    }





    public void viewContact(){

        for (Contact con: contacts){
            System.out.print(con.toString() + " \n");
        }

    }





    public void searchContact(String name){

        for (Contact object: contacts){

            if (object.getName().equals(name)){

                System.out.println("Phone Number : +880"+ object.getPhone() + "  Email Address : " + object.getEmail());

            }

        }

    }





    public void deleteContact(String name){

        for (Contact object: contacts){

            if (object.getName().equals(name)) {
                contacts.remove(object);
                System.out.println(object.getName() + "'s Contact is deleted from the list. " + contacts.size());
                break;
            }



        }

    }



    public void updateContact(String name,int phone, String email){

        for (Contact object: contacts){

            if (object.getName().equals(name)){

                object.setPhone(phone);
                object.setEmail(email);
                System.out.println(name + "'s Phone Number and Email Address has been Changed!!! ");

            }

        }

    }


    public void updateContact(String name,int phone){

        for (Contact object: contacts){

            if (object.getName().equals(name)){

                object.setPhone(phone);
                System.out.println(name + "'s Phone Number has been changed!!! ");

            }

        }

    }


    public void updateContact(String name,String email){

        for (Contact object: contacts){

            if (object.getName().equals(name)){

                object.setEmail(email);
                System.out.println(name + "'s Email Address has been changed!!! ");

            }

        }

    }



}



