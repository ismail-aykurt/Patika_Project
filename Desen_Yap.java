import java.util.Scanner;

public class Desen_Yap {
    static void desen(){
        Scanner input=new Scanner(System.in);
        int result ,sayi;


        System.out.print("Sayı giriniz:");
        sayi=input.nextInt();
        int number=sayi;
        if(number%5!=0){
            System.out.print(sayi+",");
            while(number>=0){
                int sonuc=number-5;
                System.out.print(sonuc+",");
                number-=5;
                if(sonuc<0){
                    int tersi=sonuc;
                    for(int k=tersi;k<=sayi;k+=5){
                        System.out.print(k+",");
                    }
                }
            }

        }else{
            for(int i=sayi;i>=0;i-=5){
                System.out.print(i+",");
                if(i==0){
                    for(int k=0;k<=sayi;k+=5){
                        System.out.print(k+",");
                    }
                }
            }

        }


    }
    public static void main(String[] args) {
        desen();

    }
}
