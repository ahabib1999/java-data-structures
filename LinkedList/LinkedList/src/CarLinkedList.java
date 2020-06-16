public class CarLinkedList {
    
    private CarNode head;

    public void addToFront(Car car) {
        CarNode node = new CarNode(car);
        node.setNext(head);
        head = node; 
    }

    public void addItemToList(int index, Car car) {
        int count = 0;
        CarNode current = head;
        CarNode previous = null;
        CarNode newNode = new CarNode(car);

        while (current != null) {
            if (count == index) {
                newNode.setNext(current);
                previous.setNext(newNode);
            }
            previous = current;
            current = current.getNext();
            count++;
        }
    }

    public void reverseList() {

        CarNode current = head;
        CarNode previous = null;
        CarNode next = null;

        while (current != null) {
            next = current.getNext();
            current.setNext(previous);
            previous = current;
            current = next;
        }
        head = previous;
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