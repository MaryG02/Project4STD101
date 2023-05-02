package Part2_2;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[1000000];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = i;
        }
        int binaryResult = binary(arr, 9);
        System.out.println("Binary Search Result: " + binaryResult);

    }
    public static int binary(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (arr[middle] == key) {
                return middle;
            } else if (arr[middle] < key) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return -1;
    }
}
