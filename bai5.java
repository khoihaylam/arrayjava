import java.util.Scanner;
public class bai5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Moi ban nhap so dong:");
        int row=input.nextInt();
        System.out.println("Moi ban nhap so cot:");
        int col=input.nextInt();
        double [][] numbers=new double[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.printf("numbers[%d][%d]=",i,j);
                numbers[i][j]=input.nextDouble();
            }
        }
        double sum=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
               if(numbers[i][j]%2==0){
                   sum=sum+numbers[i][j];
                   System.out.printf(" %.1f\t ",numbers[i][j]);
               }
            }
        }
        System.out.println();
        System.out.println("Tong cac phan tu chan:"+sum);

    }
}
