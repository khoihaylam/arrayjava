import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Moi ban nhap n:");
        int n=scanner.nextInt();
        int[] numbers=new int[n];
        double sum=0;
        double avg=0;
        for(int i=0;i<numbers.length;i++){
            System.out.printf("number[%d]=",i);
            numbers[i]=scanner.nextInt();
        }
        for(int i=0;i<numbers.length;i++){
            sum=sum+numbers[i];
            avg=sum/n;
        }
        System.out.println("trung bình cộng của các phần tử trong mảng:"+avg);
    }

}
