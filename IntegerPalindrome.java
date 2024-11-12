import java.util.Scanner;
public class IntegerPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int reverse=0,remainder;
        while(a!=0){
            remainder=a%10;
            reverse=reverse*10 + remainder;
           // a=a/10;
        }
        int a==reverse;
        System.out.println("The Palindrome number is"+a);
    }

}