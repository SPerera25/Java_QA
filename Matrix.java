import java.util.Scanner;
public class Matrix {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];
        int[][] finalMatrix = new int[3][3];

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print("Enter value for matrix1 at position [" + i + "][" + j + "]: ");
                matrix1[i][j] = scanner.nextInt();
            }
        }
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print("Enter value for matrix2 at position [" + i + "][" + j + "]: ");
                matrix2[i][j] = scanner.nextInt();
            }
        }
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                finalMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Matrix 1: ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matrix 2: ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){  
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Final Matrix: ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(finalMatrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
