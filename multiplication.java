import java.util.Scanner;
public class multiplication {
    public static void multi(int n){
        for(int i=1;i<=12;i++){
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Multiplication table for " + num);
        multi(num);
        sc.close();
    }
}
