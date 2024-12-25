


public class Main {

    public static void main(String[] args) {



        ContactList contactList = new ContactList();

        contactList.addContact("Satyen Roy Chowdhury",
                1988328159,
                "satyen@gmail.com");

        contactList.viewContact();

        contactList.addContact("Amit Roy Chowdhury",
                1988328159,
                "amit@gmail.com");

        contactList.addContact("Sumit Chowdhury",
                1988328159,
                "sumit@gmail.com");

        contactList.viewContact();


        contactList.updateContact("Sumit Chowdhury",1521227549);


        contactList.viewContact();

    }

}