public class House {
    private final String hall;
    private final String kitchen;
    private final String bedRoom;
    private final String balcony;

    public House(String hall, String kitchen) {
        this(hall, kitchen, "default-bedroom");
    }

    public House(String hall, String kitchen, String bedRoom) {
        this(hall, kitchen, bedRoom, "default-balcony");
    }

    public House(String hall, String kitchen, String bedRoom, String balcony) {
        this.hall = hall;
        this.kitchen = kitchen;
        this.bedRoom = bedRoom;
        this.balcony = balcony;
    }

    public void display() {
        System.out.println("Hall: " + hall + ", Kitchen: " + kitchen +
                ", Bedroom: " + bedRoom + ", Balcony: " + balcony);
    }

    public static void main(String[] args) {
        House h1 = new House("Living Room", "Modern Kitchen");
        h1.display();
    }
}