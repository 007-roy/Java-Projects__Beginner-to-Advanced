import java.util.ArrayList;
import java.util.List;

public class Service {


    List<Item> list = new ArrayList<>();

    public void add_item(String name, int quantity, double price){

            Item item = new Item(name,quantity,price);

            list.add(item);

            System.out.print("\nItem "+ name  + " added to the cart.\n");

    }


    public void view_Cart(){

        double total = 0;
        System.out.print("\nShopping Cart : \n");
        System.out.print("-----------------------------------------------------------\n");

        for (Item item : list){

            System.out.print(item.toString() + "\n");

            total += item.getTotal();

        }

        System.out.print("-----------------------------------------------------------");

        System.out.print("\nCart Total : $" + total);

    }


    public void update_Item(String name,int quantity){


        for (Item item : list){


            if (name.equals(item.getName())){

                item.setQuantity(quantity);

                System.out.print("\nQuantity of " + item.getName() + " updated to " + quantity + ".\n");

            }

        }

    }

    public void remove_Item(String name){

        list.removeIf(item -> item.getName().equals(name));
        System.out.print("\nItem " + name + " removed from the cart.\n");

    }


    public void checkOut(){

        double total = 0;
        System.out.print("\nCheckout Summary:  \n");
        System.out.print("------------------------------------------------------------\n");

        for (Item item : list){
            System.out.print(item.toString() + "\n");
            total += item.getTotal();
        }
        System.out.print("------------------------------------------------------------\n");
        System.out.print("Grand Total: $" + total + " \n\n");
        System.out.print("Thank you for shopping with us!\n\n");

    }



}




