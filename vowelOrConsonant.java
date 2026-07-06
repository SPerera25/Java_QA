import java.util.Scanner;
public class vowelOrConsonant {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        char letter;

        System.out.print("Enter a letter: ");
        letter = sc.next().charAt(0);

        if (!Character.isLetter(letter)) {
            System.out.println("Invalid input! Please enter a letter.");
        }
        else if(letter=='A' || letter=='E' || letter=='I' || letter=='O' || letter=='U'
            || letter=='a' || letter=='e' || letter=='i' || letter=='o' || letter=='u'){
                System.out.println("Entered letter is a vowel!");
        }
        else{
            System.out.println("The entered letter is a consonant!");
        }
        
        sc.close();
    }
}
