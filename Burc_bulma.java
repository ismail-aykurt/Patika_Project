import java.util.Scanner;
public class Burc_bulma {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        int ay,gun;

        System.out.print("KAÇINCI AYDA DOĞDUNUZ:");
        ay=input.nextInt();
        System.out.print("HANGİ GÜN DOĞDUNUZ:");
        gun=input.nextInt();



        if(ay==1){
            if(1<=gun && gun<=21 ){
                System.out.print(gun+ " OCAK " + " OĞLAK BURCU ");
            }
            else if (21<gun) {
                System.out.print(gun+ " OCAK " + " KOVA BURCU ");
            }
        }
        if(ay==2){
            if(1<=gun && gun<=19 ){
                System.out.print(gun+ " ŞUBAT " + " KOVA BURCU ");
            }
            else if (19<gun) {
                System.out.print(gun+ " ŞUBAT " + " BALIK BURCU ");
            }
        }
        if(ay==3){
            if(1<=gun && gun<=20 ){
                System.out.print(gun+ " MART " + " BALIK BURCU ");
            }
            else if (20<gun) {
                System.out.print(gun+ " MART " + " KOÇ BURCU ");
            }
        }
        if(ay==4){
            if(1<=gun && gun<=20 ){
                System.out.print(gun+ " NİSAN " + " KOÇ BURCU ");
            }
            else if (20<gun) {
                System.out.print(gun+ " NİSAN " + " BOĞA BURCU ");
            }
        }
        if(ay==5){
            if(1<=gun && gun<=21 ){
                System.out.print(gun+ " MAYIS " + " BOĞA BURCU ");
            }
            else if (21<gun) {
                System.out.print(gun+ " MAYIS " + " İKİZLER BURCU ");
            }
        }

        if(ay==6){
            if(1<=gun && gun<=22 ){
                System.out.print(gun+ " HAZİRAN " + " İKİZLER BURCU ");
            }
            else if (22<gun) {
                System.out.print(gun+ " HAZİRAN " + " YENGEÇ BURCU ");
            }
        }

        if(ay==7){
            if(1<=gun && gun<=22 ){
                System.out.print(gun+ " TEMMUZ " + " YENGEÇ BURCU ");
            }
            else if (22<gun) {
                System.out.print(gun+ " TEMMUZ " + " ASLAN BURCU ");
            }
        }
        if(ay==8){
            if(1<=gun && gun<=22 ){
                System.out.print(gun+ " AĞUSTOS " + " ASLAN BURCU ");
            }
            else if (22<gun) {
                System.out.print(gun+ " AĞUSTOS " + " BAŞAK BURCU ");
            }
        }
        if(ay==9){
            if(1<=gun && gun<=22 ){
                System.out.print(gun+ " EYLÜL " + " BAŞAK BURCU ");
            }
            else if (22<gun) {
                System.out.print(gun+ " EYLÜL " + " TERAZİ BURCU ");
            }
        }
        if(ay==10){
            if(1<=gun && gun<=22 ){
                System.out.print(gun+ " EKİM " + " TERAZİ BURCU ");
            }
            else if (22<gun) {
                System.out.print(gun+ " EKİM " + " AKREP BURCU ");
            }
        }
        if(ay==11){
            if(1<=gun && gun<=21 ){
                System.out.print(gun+ " KASIM " + " AKREP BURCU ");
            }
            else if (21<gun) {
                System.out.print(gun+ " KASIM " + " YAY BURCU ");
            }
        }
        if(ay==12){
            if(1<=gun && gun<=21 ){
                System.out.print(gun+ " ARALIK " + " YAY BURCU ");
            }
            else if (21<gun) {
                System.out.print(gun+ " ARALIK " + " OĞLAK BURCU ");
            }
        }

    }
}