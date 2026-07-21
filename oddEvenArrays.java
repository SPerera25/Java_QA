public class oddEvenArrays {
    public static void array(int[] arr){
        
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[]args){

        int[] arr = {1,2,3,4,5,6};
        int[] odd = new int[3];
        int[] even = new int[3];

        int evenIndex = 0;
        int oddIndex = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                even[evenIndex] = arr[i];
                evenIndex++;
            }
            else{
                odd[oddIndex] = arr[i];
                oddIndex++;
            }
        }

        System.out.print("Even numbers: ");
        array(even);
        System.out.print("\nOdd numbers: ");
        array(odd);
    }
}
