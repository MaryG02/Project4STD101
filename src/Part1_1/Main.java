package Part1_1;

public class Main {
    public static void main(String[] args) {
        int n =20;
        int sum = sum1toN(n);
        System.out.println("Sum of the first "+ n+" positive numbers is: "+sum);
    }
    public static int sum1toN(int n){
        if(n==1){
            return 1;
        }
        else{
            return n+sum1toN(n-1);
        }
    }
}
