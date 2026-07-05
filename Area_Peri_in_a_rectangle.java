import java.util.Scanner;
public class Area_Peri_in_a_rectangle {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        double height,width;

        System.out.print("Enter the height of the rectangle: ");
        height = sc.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        width = sc.nextDouble();

        double area = height*width;
        double peri = 2*(height+width);

        System.out.println("The area is "+ area);
        System.out.println("The perimeter is " + peri);
        
        sc.close();
    }
}
