public class CarNode {
    
    private Car car;
    private CarNode next;

    public CarNode(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public CarNode getNext() {
        return next;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setNext(CarNode next) {
        this.next = next;
    }

    public String toString() {
        return car.toString();
    }
}