public class Car {
    private String model;
    private double milesDriven;
    private String color;

    public Car(String model, double milesDriven, String color) {
        this.model = model;
        this.milesDriven = milesDriven;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
        return "(Model: " + this.model + " Miles Driven: " + this.milesDriven + " Car Color: " + this.color + ")";
    }
}
