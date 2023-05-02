package Part2_2_2;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 10, 22, 33, 47};
        int search = 22;
        int recBinaryResult = recBinary(arr, search, 0, arr.length-1);
        System.out.println("Recursive binary search found a number at the index: " + recBinaryResult);
    }
    public static int recBinary(int[] arr, int search, int low, int high){
        int middle = (low+high)/2;
        if(low>high){
            return -1;
        }
        if (arr[middle]==search){
            return middle;
        }
        else if (arr[middle]>search){
            return  recBinary(arr, search, low, middle-1);
        }
        else{
            return recBinary(arr, search, middle+1, high);
        }
    }
}
