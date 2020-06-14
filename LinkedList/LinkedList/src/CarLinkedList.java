public class CarLinkedList {
    
    private CarNode head;

    public void addToFront(Car car) {
        CarNode node = new CarNode(car);
        node.setNext(head);
        head = node; 
    }

    public void printList() {
        CarNode current = head;

        while (current != null) {
            System.out.print(current);
            System.out.print(" --> ");
            current = current.getNext();
        }
        System.out.print("null");
    }

    public boolean findElementByModel(String model) {
        CarNode current = head;

        while (current != null) {
            if (current.getCar().getModel() == model) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    // 
    public String deleteItemFromList(String model) {
        CarNode current = head;
        CarNode previous = null;

        while (current != null) {

            String currentCarModel = current.getCar().getModel();

            if (currentCarModel.equals(model)) {
                if (current == head) {
                    head = head.getNext();
                }
                previous.setNext(current.getNext());
                return "List Updated";
            }

            previous = current;
            current = current.getNext();
        }
        return "Car not found";
    }
}