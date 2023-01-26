import java.util.Arrays;

public class Hostel implements Pay {
    private String[]family;
    private String address;

    public Hostel(String[] family, String address) {
        this.family = family;
        this.address = address;
    }

    public Hostel() {
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

    @Override
    public String toString() {
        return "Hostel{" +
                "family=" + Arrays.toString(family) +
                ", address='" + address +" "+family.length +" столько людей в семье "+
                '}';
    }
}
