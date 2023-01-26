public class Main {
    public static void main(String[] args) {
        Apartment apartment=new Apartment(new String[]{"Deku ","Uraraka","Midoria"},"Japan");
        apartment.pay();
        System.out.println(apartment);
        Hostel hostel=new Hostel(new String[]{"Sveta","Oleg","Ilya","Lena"},"Russia");
        hostel.pay();
        System.out.println(hostel);
        Hotel hotel=new Hotel(new String[]{"DjinWo","DjinA"},"Korea");
        hotel.pay();
        System.out.println(hotel);
    }
}