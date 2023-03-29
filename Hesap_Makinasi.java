import java.util.Scanner;

public class Hesap_Makinasi {

    static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }
    static void mod(){
        Scanner scan=new Scanner(System.in);
        int number,modu,result;
        System.out.print("Modunu alacak sayıyı giriniz:");
        number=scan.nextInt();
        System.out.print("hangi moddan almak istersiniz:");
        modu=scan.nextInt();
        result=number%modu;
        System.out.println("Mod ddeğeri="+result);


    }
    static void dikdortgen(){
        Scanner scan=new Scanner(System.in);
        int kisaKenar,uzun_Kenar,cevre,alan;
        System.out.print("Uzun kenarı giriniz:");
        uzun_Kenar= scan.nextInt();
        System.out.print("Kısa kenarı giriniz:");
        kisaKenar= scan.nextInt();
        cevre=(2*uzun_Kenar)+(kisaKenar*2);
        alan=kisaKenar*uzun_Kenar;
        System.out.println("Dikdörtgenin çevresi="+cevre+"\nDikdörtgen alanı="+alan);


    }
    static void hipotenus(){

        Scanner scan=new Scanner(System.in);
        System.out.print("1.kenarı giriniz:");
        int kenar1= scan.nextInt();
        System.out.print("2. kenarı giriniz:");
        int kenar2= scan.nextInt();
        double hipo=Math.sqrt((kenar1*kenar1) + (kenar2*kenar2));
        System.out.println("Üçgenin hipotenüs değeri="+hipo);


    }
    static void daire(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz(r):");
        int r=scan.nextInt();
        double pi=3.14;
        double alan=pi*(r*r);
        double cevre=2 * pi * r;
        System.out.println("Dairenin alanı="+alan+"\nDairenin çevresi="+cevre);
    }
    static void asistan(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Merhaba sevgili kullanici sizlere nasıl yardımcı olabilirim:");
        System.out.println("1-Uygulama nedir\n2-Uygulama nasıl kullanılır\n3-Uygulama nasıl sonlandırılır");
        System.out.print("İşlemi seçiniz:");
        int deger= scan.nextInt();
        if(deger==1){
            String nedir="Merhabalar kullanacağınız uygulama bir hesap makinasıdır.\n" +
                    "Hesap makinası ilk zamanlar dört işlem yapabilen\n" +
                    "daha sonraları geliştirilerek her türlü sayısal işlemi yapar duruma getirilen elektronik ve mekanik bir araçtır";
            System.out.println(nedir);
        }else if(deger==2){
            String kullanim="Merhabalar sizler için önceden tanımladığımız işlemleri ekranda\n" +
                    "yapmak istediğiniz işlemi seçip ardından istenen\n" +
                    "değerleri girmeniz,değerleri girdikten sonra sonucunuz ekranda yazacaktır";
            System.out.println(kullanim);
        }else if(deger==3){
            String son="Merhabalar uygulamayı kullandıktan sonra çıkış işlemini gerçekleştirmek\n " +
                    "isterseniz klavyeden 0 değerini girmeniz\n" +
                    "yeterli olacaktır efendim.";
        }else{
            System.out.println("Hatalı tuşlama...");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "9-Hipotenüs hesaplama\n"
                + "10-Daire Alan & Çevre Hesaplama\n"
                + "11-Asistan\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    dikdortgen();
                    break;
                case 9:
                    hipotenus();
                    break;
                case 10:
                    daire();
                    break;
                case 11:
                    asistan();
                    break;
                case 0:
                    System.out.println("Program sonlanmıştır....");
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);


    }
}
