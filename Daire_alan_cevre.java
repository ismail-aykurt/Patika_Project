

import java.util.Scanner;

public class Daire_alan_cevre {
    public static void main(String[] args) {
/*Dairenin Alanını ve Çevresini Hesaplayan Program
Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

Alan Formülü : π * r * r;

Çevre Formülü : 2 * π * r;

Ödev
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

𝜋 sayısını = 3.14 alınız.

Formül : (𝜋 * (r*r) * 𝛼) / 360 */

        int r, a;
        double pi = 3.14;

        Scanner input = new Scanner(System.in);

        System.out.print("Üçgenin yarı çapını giriniz : ");
        r = input.nextInt();
        System.out.println("Üçgenin alanı = " + pi * r * r);
        System.out.println("Üçgenin çevresi = " + pi * r * 2);

    }
}