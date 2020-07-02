public class Main {

    public static void main(String[] args) {

        int[] intArray = { -15, -22, 5, 20, 55 };

        BinarySearch searchAlgoritmObj1 = new BinarySearch();

        System.out.println(searchAlgoritmObj1.binarySearch(intArray, 5));
        System.out.println(searchAlgoritmObj1.binarySearch(intArray, 55));
    }
}