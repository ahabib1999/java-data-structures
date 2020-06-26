public class Main {
    
    public static void main(String[] args) {
        Car carA = new Car("Mustang", 500.00);
        Car carB = new Car ("Sedan", 250.00);
        Car carC = new Car ("Chevrolet", 420.50);
        Car carD = new Car ("BMW", 220.00);
        Car carE = new Car ("Hyundai", 350.00);
        
        LinkedStack carStack = new LinkedStack();

        /* carStack.push(carA);
        carStack.push(carB);
        carStack.push(carC);
        carStack.push(carD);

        carStack.printStack();

        System.out.println("Popped Car: " + carStack.pop());

        System.out.println("Updated Head: " + carStack.peek()); */
    }
}