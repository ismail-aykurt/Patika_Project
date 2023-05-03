import java.util.Scanner;
/*Koşullar :

Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
Ödev
Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.*/

public class Hava_sicakligina_gore_etkinlik {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.println("Hava sicakligini giriniz : ");

        heat = input.nextInt();
        if (heat >= 25){
            System.out.println("Yüzmeye gidebilirsin");
        }else if(heat >= 10){
            System.out.println("Piknige gidebilirsin");
        }else if(heat>=5){
            System.out.println("Sinemaya gidebilirsin");
        }else if(heat>=0){
            System.out.println("Kayak Yapabilirsin");
        }
    }
}