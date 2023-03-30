import java.util.Scanner;

public class Asal_Kontrol {
    static void asal(){
        Scanner input=new Scanner(System.in);
        int result=0;
        System.out.print("Kontrol etmek istediğiniz sayıyı giriniz:");
        int asalmi=input.nextInt();
        for(int i=2;i<asalmi;i++){
            if(asalmi%i==0){
                result++;
            }

        }
        if(result==0){
            System.out.println("asaldır.");
        }else{
            System.out.println("asal değil.");
        }

    }
    public static void main(String[] args) {
        asal();

    }
}
