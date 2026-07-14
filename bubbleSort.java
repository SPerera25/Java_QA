//descending order (largest to smallest)
import java.util.Scanner;
public class bubbleSort {
    public static void BubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        System.out.print("Enter 10 integers: ");
        for(int i=0;i<array.length;i++){
            array[i] = sc.nextInt();
        }
        BubbleSort(array);
        System.out.println("Sorted array: ");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+ " ");
        }
        sc.close();
    }
}
