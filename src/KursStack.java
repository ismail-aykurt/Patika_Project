import java.util.Scanner;

import static javafx.beans.binding.Bindings.isEmpty;

public class KursStack {
    Scanner input=new Scanner(System.in);
    KursNode top;
    int kontenjan;
    int sayac;

    public KursStack(int kontenjan) {
        this.kontenjan = kontenjan;
        sayac=0;
        top=null;

    }
    String  tc;
    String ad;
    String soyad;
    String mezunBolum;

    void ekle(){            //Burda push() işlemi yapılıyor

        System.out.println("Kursa kayıt edilecek kişi bilgileri:");
        System.out.print("T.C. giriniz:");
        tc=input.nextLine();

        System.out.print("Adınızı giriniz:");
        ad=input.nextLine();

        System.out.print("Soyadınızı. giriniz:");
        soyad=input.nextLine();

        System.out.print("Mezun olduğunuz bölümü  giriniz:");
        mezunBolum=input.nextLine();

        KursNode eleman=new KursNode(tc,ad,soyad,mezunBolum);

        if(isFull()){
            System.out.println("Kurs kontenjanı doldu. Kayıt yapılamaz!!");
        }else{
            if(isEmpty()){
                top=eleman;
                System.out.println(top.tc + " nolu kişi kursa ilk kayıt yaptırdı.");
                System.out.println("-----------------------------------------------------");
            }else{
                eleman.next=top;
                top=eleman;
                System.out.println(top.tc + " nolu kişi kursa  kayıt yaptırdı.");
                System.out.println("-------------------------------------------------------");
            }
            sayac++;
        }

    }



    void sil(){                //sil fonksiyonu pop()
        if (isEmpty()){
            System.out.println("Kursta kayıtlı kimse yok!!");
        }else{
            System.out.println(top.tc + " numaralı kişi kurstan başarılı bir şekilde silindi..");
            top=top.next;
            sayac--;
        }

    }

    void kisiListesiYazdir(){
        if(isEmpty()){
            System.out.println("Kursta kayıtlı kişi mevcut değildir!!");
        }else{
            KursNode temp=top;
            System.out.println("Kursa kayıtlı kişi bilgileri:");
            while(temp!=null){
                System.out.println(temp.tc +"\t" + temp.ad + "\t" + temp.soyad + "\t" + temp.mezunBolum );
                temp=temp.next;

            }
            System.out.println("---------------------------------------------------");
        }
    }
    void kalanKontenjanSayisi(){
        System.out.println("Toplam kayıtlı kişi sayısı : " + sayac);
        System.out.println("Kalan kontenjan sayısı : " + (kontenjan-sayac));
        System.out.println("----------------------------------------------");
    }
    boolean isEmpty() {
        return sayac==0;
    }
    boolean isFull() {
        return sayac==kontenjan;
    }
}

