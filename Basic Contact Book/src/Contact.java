

public class Contact {

    private String name;

    private  int phone;

    private String email;


    public Contact() {
    }

    public Contact(String name, int phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + getName() + '\'' +
                ", phone = +880" + getPhone() +
                ", email='" + getEmail() + '\'' +
                '}';
    }


}


