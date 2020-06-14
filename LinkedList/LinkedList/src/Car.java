public class Car {
    private String model;
    private double milesDriven;

    public Car(String model, double milesDriven) {
        this.model = model;
        this.milesDriven = milesDriven;
    }

    public String getModel() {
        // Returns model of the car
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMilesDriven() {
        return milesDriven;
    }

    public void setMilesDriven(double milesDriven) {
        this.milesDriven = milesDriven;
    }

    @Override
    public String toString() {
        return "(Model: " + this.model + " Miles Driven: " + this.milesDriven + ")";
    }
}