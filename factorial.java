import java.util.Scanner;
public class factorial {
    public static int fac(int n){
        if(n==0 || n==1) return 1;
        return n*fac(n-1);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Factorial: " + fac(num));
        sc.close();
    }
}