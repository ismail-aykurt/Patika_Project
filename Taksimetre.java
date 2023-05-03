import java.util.Scanner;
public class Taksimetre {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        double toplam=10, km;
        System.out.println("Kilometreyi giriniz:");
        km=input.nextDouble();
        toplam+=(km)*(2.20);
        if(toplam<20)
            System.out.println("Ücret 20 TL.)");
        else if (toplam>20)
            System.out.println("Ücret: "+ toplam);

    }
}