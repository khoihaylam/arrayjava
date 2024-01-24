import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] numbers=new int[5];
        for(int i=0;i<numbers.length;i++){
            System.out.printf("numbers[%d]=",i);
            numbers[i]=scanner.nextInt();
        }
        for(int i=0;i<numbers.length;i++){
            System.out.printf("%d\t",numbers[i]);
        }

    }
}
