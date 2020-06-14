public class App {
    public static void main(String[] args) {
        Car carA = new Car("Mustang", 500.00);
        Car carB = new Car ("Sedan", 250.00);
        Car carC = new Car ("Chevrolet", 420.50);
        Car carD = new Car ("BMW", 220.00);

        CarLinkedList carList = new CarLinkedList();

        carList.addToFront(carA);
        carList.addToFront(carB);
        carList.addToFront(carC);
        carList.addToFront(carD);

        carList.printList();
        boolean isFound = carList.findElementByModel("SUV");
        System.out.println();
        System.out.println(isFound);

        String updateMessage = carList.deleteItemFromList("Hyundai");
        if (updateMessage.equals("List Updated")) {
            carList.printList();
        }
        else {
            System.out.println("Car not found in the list");
        }
    }
}
