import java.util.Scanner;
public class bai7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("MOI BAN NHAP n:");
        int n=scanner.nextInt();
        int [] number=new int[n];
        for(int i=0;i<number.length;i++){
            System.out.printf("number[%d]=",i);
            number[i]=scanner.nextInt();
        }
        System.out.println("MOI ban nhap vi tri muon chen");
        int x=scanner.nextInt();
        System.out.println("MOI ban nhap phan tu muon chen");
        int m=scanner.nextInt();
        for(int i=n-1;i>=x;i--){
            number[i]=number[i-1];
        }
        n++;
        number[x]=m;
        for(int i=0;i<n-1;i++){
            System.out.printf("%d\t",number[i]);
        }


    }
}

