package Day3;

public class Power {
    public static void main(String[] args) {
        System.out.println(myPow(2.0,5));
    }

    public static double myPow(double x, int n) {

        if(n==0)
            return 1;

        double xnm1 = myPow(x,n-1);
        double xn = x * xnm1;
        return xn;

    }
}
