import java.util.Scanner;
public class largestNum {
    public static int largest(int[] arr){
        int largest = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        for (int i=0; i<array.length;i++){
            System.out.print("Enter an element to index "+i+" : ");
            array[i] = sc.nextInt();
        }
        System.out.println("The largest value is " + largest(array));
        sc.close();
    }
}
