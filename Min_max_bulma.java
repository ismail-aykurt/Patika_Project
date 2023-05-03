
import java.util.Scanner;
public class Min_max_bulma {
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int n;
        int sayi;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        System.out.print("Kaç sayı giriceksiniz?: ");
        n=x.nextInt();
        for(int i=1;i<=n;i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            sayi = x.nextInt();
            if(sayi>max) max=sayi;
            else if(sayi<min) min=sayi;
        }
        System.out.println("en büyük değer: "+max);
        System.out.println("en küçük değer: "+min);
    }
}