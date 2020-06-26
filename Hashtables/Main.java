public class Main {
    public static void main(String[] args) {
        Car carA = new Car("Mustang", 500.00, "Blue");
        Car carB = new Car ("Sedan", 250.00, "Red");
        Car carC = new Car ("Chevrolet", 420.50, "Yellow");
        Car carD = new Car ("BMW", 220.00, "Black");
        Car carE = new Car ("Hyundai", 350.00, "Green");

        SimpleHashtable hashtable1 = new SimpleHashtable();

        hashtable1.pushCar("Blue", carA);
        hashtable1.pushCar("Red", carB);
        hashtable1.pushCar("Yellow", carC);
        hashtable1.pushCar("Black", carD);
        hashtable1.pushCar("Green", carE);

        hashtable1.printHashtable();
    }
}