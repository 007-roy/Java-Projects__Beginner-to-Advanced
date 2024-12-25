

public class Item {


    private String name;

    private int quantity;

    private double price;

    private double total;



    public Item() {
    }

    public Item(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotal() {
        return price*quantity;
    }



    @Override
    public String toString() {
        return "Item :  " + name + " Quantity :  " + quantity + " Total : $" + getTotal();
    }




}

