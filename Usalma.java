import java.util.Scanner;

public class Usalma {
    static void power(){
        Scanner input=new Scanner(System.in);
        int us,taban,result=1;
        System.out.print("Taban değerini giriniz:");
        taban=input.nextInt();
        System.out.print("Üs değerini giriniz:");
        us=input.nextInt();
        for(int i=1;i<=us;i++){
            result*=taban;
        }
        System.out.println(taban + "^" + us + "="+ result);

    }
    public static void main(String[] args) {
        power();

    }
}
