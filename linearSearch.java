public class linearSearch {
    public static int Search(int arr[],int N,int X){
        for(int i=0; i<N; i++){
            if(arr[i]==X){
                return i;
            }
        }
        return -1;
    }
    public static void main(String []args){

        int[] array = {10,20,30,40,50};
        int X = 40;
        int result = Search(array, array.length, X);
        if(result==-1){
            System.out.println("Element is not found!");
        }
        else{
            System.out.println("Element is found at index " + result);
        }
   }
}
