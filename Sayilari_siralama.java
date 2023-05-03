

import java.util.Scanner;

public class Sayilari_siralama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a,b,c,sonuc;

        System.out.print("Birinci Sayiyi Giriniz : ");
        a = input.nextInt();
        System.out.print("İkinci Sayiyi Giriniz : ");
        b = input.nextInt();
        System.out.print("Üçüncü Sayiyi Giriniz : ");
        c = input.nextInt();

        if ((a>b)&&(a>c)){
            if (b>c){
                System.out.println("Sıralama : "+ a +" > "+ b + " > " + c);
            }else {
                System.out.println("Sıralama : "+ a + " > " + " > " + c + " > " + b);
            }
        } else if ((b>c) &&(b>a)) {
            if (a>c){
                System.out.println("Sıralama : "+ b + " > " + a + " > " + c);
            }else{
                System.out.println("Sıralama : "+ b +" > " + c + " > " + a);
            }
        }else {
            if ((b>a)){
                System.out.println("Sıralama : "+ c + " > " + b + " > " + a);
            }else {
                System.out.println("Sıralama : "+ c + " > " + a + " > " + b);
            }
        }

    }
}