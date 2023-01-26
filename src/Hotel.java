import java.util.Arrays;

public class Hotel implements Pay{
    private String[]family;
    private String address;

    public Hotel(String[] family, String address) {
        this.family = family;
        this.address = address;
    }

    public Hotel() {
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "family=" + Arrays.toString(family) +
                ", address='" + address +" "+ family.length +" столько людей в семье "+
                '}';
    }

    @Override
    public void pay() {
        System.out.println("платят за аренду");
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
