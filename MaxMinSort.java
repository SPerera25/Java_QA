public class MaxMinSort {
    public static void main(String []args){
        int[] array = {1,4,7,2,5,8,3,6,9};
        for(int i=0; i<array.length-1; i++){
            for(int j=0; j<array.length-1-i; j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted array: ");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
        int left = 0;
        int right = array.length-1;
        int index = 0;

        int[] result = new int[array.length];

        while(left<=right){

            //Maximum value
            result[index] = array[right];
            right--;
            index++;

            //Minimum value
            if(left<=right){
                result[index] = array[left];
                left++;
                index++;
            }
        }

        System.out.println("\nMaxMin array:");
        for(int i=0; i<array.length; i++){
            System.out.print(result[i]+" ");
        }
    }
}
