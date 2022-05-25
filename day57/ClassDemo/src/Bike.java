public class Bike implements Vehicle{

    private String make;
    private String model;
    private String year;

    public Bike(String make, String model, String year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    @Override
    public void changeGear(int a) {

    }

    @Override
    public void speedUp(int a) {

    }

    @Override
    public void applyBrakes(int a) {

    }
}
