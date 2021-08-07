import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào kích thước mảng : ");
        int size = scanner.nextInt();
        int[][] array = createArray(size);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Nhập gia trị tại " + i + " " + j + " : ");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Mảng : ");
        for (int i = 0; i < size; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println("Tổng đường chéo chính = " + sumMainDiagonal(array));
    }

    public static int[][] createArray(int size) {
        int[][] array = new int[size][size];
        return array;
    }

    public static int sumMainDiagonal(int[][] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j){
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }
}
