import java.util.LinkedList;

public class LinkedStack {
    private LinkedList <Car> stack;

    public LinkedStack() {
        stack = new LinkedList<Car>();
    }

    public void push(Car car) {
        stack.push(car);
    }

    public void isValid(String s) {
        StringBuilder noPunctuationString = new StringBuilder(s.length());

        for (int i = 0;i < s.length();i++) {
             char currentChar = s.charAt(i);
             if (currentChar >= 'a' && currentChar <= 'z') {
                 noPunctuationString.append(currentChar);
             }
        }
        
        
    }
    
    public Car pop() {
        return stack.pop();
    }

    public Car peek() {
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void printStack() {
        for (int i = 0; i < stack.size();i++) {
            System.out.println(stack.get(i));
        }
    }

}