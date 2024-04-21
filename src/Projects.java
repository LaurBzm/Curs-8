public class Projects {
    private double price;
    private String name;
    private String description;
    private double quantity;

    public Projects(double quantity, String name, String description, double price) {

        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    public double getQuantity() {
        return quantity;
    }
    public String getDescription(){
        return description;
    }
}