public class Event {

    private int id;
    private String name;
    private String type;
    private String location;
    private String date;
    private double price;

    // constructor
    public Event(int id, String name, String type,
                String location, String date, double price) {

        this.id = id;
        this.name = name;
        this.type = type;
        this.location = location;
        this.date = date;
        this.price = price;
    }

    // getter
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getLocation() {
        return location;
    }

    public String getDate() {
        return date;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // display
    public void showEvent() {

        System.out.println("ID       : " + id);
        System.out.println("Name     : " + name);
        System.out.println("Type     : " + type);
        System.out.println("Location : " + location);
        System.out.println("Date     : " + date);
        System.out.println("Price    : " + price);
    }
}