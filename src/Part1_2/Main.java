package Part1_2;

public class Main {
    public static void main(String[] args) {
        double x = 2.0;
        int n = 0;
        double res = power(x, n);
        System.out.println(x+" to the power of "+n+" equals to "+res);
    }
    public static double power(double x, int n){
        if (n==0){
            return 1.0;
        }
        else{
            return x*power(x, n-1);
        }
    }
}
