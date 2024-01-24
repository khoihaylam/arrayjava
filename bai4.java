import java.util.Scanner;
public class bai4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Moi ban nhap n:");
        int n=scanner.nextInt();
        int [] numbers1=new int[n];
        for(int i=0;i<numbers1.length;i++){
            System.out.printf("numbers1[%d]=",i);
            numbers1[i]=scanner.nextInt();
        }
        int max;
        int min;
        max=numbers1[0];
        min=numbers1[0];

        for(int i=0;i<numbers1.length;i++){
            if(numbers1[i]>max){
                max=numbers1[i];
            }
            if(numbers1[i]<min){
                min=numbers1[i];
            }
        }
        System.out.println("Gia tri lon nhat trong mang:"+max);
        System.out.println("Gia tri nho nhat trong mang:"+min);

    }
}
