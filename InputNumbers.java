import java.util.Scanner;
public class InputNumbers{
    public static void main (String []args){

        Scanner scanner = new Scanner(System.in);
        
        int num1,num2,quotient;
        double sum,diff,product,remainder;

        System.out.print("Enter an integer number: ");
        num1 = scanner.nextInt();
        System.out.print("Enter another integer: ");
        num2 = scanner.nextInt();

        sum = num1+num2;
        diff = num1 - num2;
        product = num1 * num2;
        quotient = num1/num2;
        remainder = num1 % num2;

        System.out.println("The sum of the entered numbers are "+ sum);
        System.out.println("The difference of the entered numbers are "+ diff);
        System.out.println("The product of the entered numbers are "+ product);
        System.out.println("The quotient of the entered numbers are "+ quotient);
        System.out.println("The remainder of the entered numbers are "+ remainder);
        

        scanner.close();
    }
}