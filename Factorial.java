import java.util.Scanner;
public class Factorial {
    static int fact(int n){
        if(n==1){
            return 1;
        }
        else{
            return (n*fact(n-1));
        }
    }

    public static void main(String[] args) {


        System.out.println("The factorial is"+fact(4));
    }
}
