import java.util.Scanner;

public class SumOf2dArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of rows and columns of matrix 1");
        int r1= in.nextInt();
        int c1= in.nextInt();
        int[][] a = new int[r1][c1];
        System.out.println("Enter matrix elements ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = in.nextInt();
            }
        }

        System.out.println("Enter number of rows and columns of matrix 2");
        int r2= in.nextInt();
        int c2= in.nextInt();
        int[][] b = new int[r2][c2];
        System.out.println("Enter matrix elements ");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = in.nextInt();
            }
        }

        sum(a,r1,c1,b,r2,c2);
    }

    static void sum(int[][] a, int r1, int c1, int[][] b, int r2, int c2 ){
        if(r1 != r2 || c1 !=c2){
            System.out.println("Wrong Input");
            return;
        }

        int[][] sum = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        printMatrix(sum);
    }
    static void printMatrix(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
