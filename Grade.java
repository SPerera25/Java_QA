import java.util.Scanner;
public class Grade {
    public static void main(String []args){
        Double marks;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        marks = scanner.nextDouble();
        if(marks>=90 && marks<=100){
            System.out.println("Your grade is A");
        }
        else if(marks>=80 && marks<90){
            System.out.println("Your grade is B");
        }
        else if(marks>=70){
            System.out.println("Your grade is C");
        }
        else if(marks>=60){
            System.out.println("Your grade is D");
        }
        else if(marks>=0){
            System.out.println("Your grade is F");
        }
        else{
            System.out.println("Invalid marks entered.");
        }
    }
}
