public class iteratingArray {
    public static void main(String[]args){

        int[] original = {10,20,30,40,50};
        int[] copy = new int[original.length];

        for (int i=0; i < original.length; i++){
            copy[i] = original[i];
        }

        System.out.println("The original array: ");
        for (int i=0; i < original.length; i++){
            System.out.print(original[i]+" ");
        }
        System.out.println("\nThe copied array: ");
        for (int i=0; i < original.length; i++){
            System.out.print(copy[i]+" ");
        }
    }
}
