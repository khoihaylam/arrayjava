import java.util.Scanner;
public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap so dong:");
        int row = scanner.nextInt();
        System.out.println("Moi ban nhap so cot:");
        int col = scanner.nextInt();
        int[][] numbers = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.printf("numbers[%d][%d]=",i,j);
                numbers[i][j]=scanner.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.printf("%d\t",numbers[i][j]);
            }
            System.out.printf("\n");
        }
    }
}
