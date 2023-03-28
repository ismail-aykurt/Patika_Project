/*
Palindrom Sayı Nedir ?
Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.
Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....
 */
public class Palindrome_Project {
    static boolean isPalindrome(int number){
        int temp=number,sonbasamak=0,sonrakibsmk;
        while(temp!=0){
            sonrakibsmk=temp%10;
            sonbasamak=(sonbasamak*10)+sonrakibsmk;
            temp/=10;
        }
        if(number==sonbasamak){
            return true;
        }else{

            return false;

        }
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(252));
        System.out.println(isPalindrome(2545));

    }
}
