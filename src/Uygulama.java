import java.util.Scanner;

public class Uygulama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int kisiSayisi , secim=-1;
        System.out.print("Kursa kayıt edilcek kişi sayısı giriniz:");
        kisiSayisi=input.nextInt();
        KursStack bilgisayarKursListesi=new KursStack(kisiSayisi);
        while(secim!=0){
            System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz:");
            System.out.println("1-Kursa yeni kayıt \n" +
                    "2-Kursta kayıtlı kişiler\n"+
                    "3-Kalan kontenjan sayısı\n"+
                    "4- Çıkış"
            );
            System.out.print("Seçim:");
            secim=input.nextInt();
            if(secim==1){
                bilgisayarKursListesi.ekle();

            }else if(secim==2){
                bilgisayarKursListesi.kisiListesiYazdir();
            }else if(secim==3){
                bilgisayarKursListesi.kalanKontenjanSayisi();
            }else if(secim==4){
                secim=0;

            }else{
                System.out.println("Hatalı bir tuşlama yapıldı lütfen 1 - 4 arası seçim yapınız!!");
            }
        }
        System.out.println("Başarılı bir şekilde çıkış yapıldı");

    }


}
