public class avgArrayElements {
    public static void main(String[]args){
        int sum=0;
        double avg;
        int[] arr = {10,20,30,40,50};
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        avg = sum/arr.length;
        System.out.println("The average of the array is "+ avg);
    }
}
