import java.util.Scanner;
public class LeapYear {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        int year;
        System.out.print("Enter a year: ");
        year = sc.nextInt();

        if( year <= 0 ){
            System.out.println("Invalid year!");
        }
        else if( year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            System.out.println("This year is a leap year!");
        }
        else{
            System.out.println("This year is not a leap year!");
        }
        sc.close();
    }
}