public class asalSayiBulma {

    public static void main(String[] args) {

        int k,p;

        for(k=2; k<=100;k++) {

            int counter=0;

            for(p=1;p<=k;p++) {

                if(k%p==0) {
                    counter++;
                }
            }
            if (counter<=2) {
                System.out.print(k+" ");
            }
        }
    }

}