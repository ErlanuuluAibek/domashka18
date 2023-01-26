import java.util.Arrays;

public class Apartment implements Pay {
    private String[] family;
    private String address;

    public Apartment(String[] family, String address) {
        this.family = family;
        this.address = address;
    }

    @Override
    public void pay() {
        System.out.println("Платят за коммуналку");
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "family=" + Arrays.toString(family) +
                ", address='" + address +" "+ family.length + "  столько людей в семье " +
                '}';
    }

    public String[] getFamily() {
        return family;
    }

    public void setFamily(String[] family) {
        this.family = family;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
