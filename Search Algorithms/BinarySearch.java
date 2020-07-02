public class BinarySearch {

    public int binarySearch(int[] intArray, int searchValue) {

        return recursiveBinarySearch(intArray, 0, intArray.length, searchValue);
    }

    public int recursiveBinarySearch(int[] intArray, int start, int end, int target) {

        if (start >= end) {
            return -1;
        }

        int midPoint = (start + end) / 2;

        if (intArray[midPoint] == target) {
            return midPoint;
        }

        else if (intArray[midPoint] < target) {
            return recursiveBinarySearch(intArray, midPoint + 1, end, target);
        }

        else {
            return recursiveBinarySearch(intArray, start, midPoint, target);
        }
    }
}