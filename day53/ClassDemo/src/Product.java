public class Product {

    private String name;
    private double cost;
    private int quantity;

    public Product(String name, double cost, int quantity) {
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
    }

    public void totalCost() {
        double total = this.cost * this.quantity;
        System.out.println("Total Cost: " + total);
    }

    public void printProduct() {
        System.out.println(this.name + "  costs " + this.cost + " and there are " + this.quantity + " of them");
    }

}
