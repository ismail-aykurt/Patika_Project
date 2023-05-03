import java.util.Scanner;
public class Vucut_kitle_hesaplama {
    public static void main(String[] args) {
        double height, weight, bodyMassIndex;

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Boyunuzu(metre cinsinden) Girin: ");
        height = input.nextDouble();

        System.out.println("Lütfen Kilonuzu Girin: ");
        weight = input.nextDouble();

        bodyMassIndex = weight/(height*height);

        System.out.println("Vücut Kitle İndeksiniz: " + bodyMassIndex);


    }
}