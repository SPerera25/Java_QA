import java.util.Scanner;
public class CelsiustoFahrenheit {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        double celsius, fahrenheit;

        System.out.print("Enter the celsius: ");
        celsius = sc.nextDouble();

        fahrenheit = celsius * (9.0/5.0) + 32;

        System.out.println("The fahrenheit: " + fahrenheit);
        sc.close();
    }
}
