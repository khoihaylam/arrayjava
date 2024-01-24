import java.util.Scanner;
public class bai9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("MoI BAN NHAP N:");
        int n=scanner.nextInt();
        int [] number=new int[n];
        for(int i=0;i<number.length;i++){
            System.out.printf("number[%d]=",i);
            number[i]=scanner.nextInt();
        }
        System.out.println("Moi ban nhap vi tri phan tu muon xoa:");
        int x=scanner.nextInt();
        for(int i=x;i<n-1;i++){
            number[i]=number[i+1];
        }
        n--;
        for(int i=0;i<n;i++){
            System.out.printf("%d\t",number[i]);
        }


    }
}
