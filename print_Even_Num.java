import java.util.Scanner;
public class print_Even_Num {
    public static void EvenNum(int s,int e){
        if(s<=e){
            for(int i=s;i<=e;i++){
                if(i%2==0){
                    System.out.print(i+" ");
                }
            }
        }
        else if(s>=e){
            for(int i=e;i<=s;i++){
                if(i%2==0){
                    System.out.print(i+" ");
                }
            }
        }
        else{
            System.out.println("Invalid range!");
        }

    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting of the range: ");
        int start = sc.nextInt();
        System.out.print("Enter the ending of the range: ");
        int end = sc.nextInt();
        System.out.println("The even numbers in the given range: ");
        EvenNum(start,end);
        sc.close();
    }
}
