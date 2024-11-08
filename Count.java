public class Count {
    public static void main(String[] args) {
        int num=1234;
        int digitcount=0;
        while(num>0){
            num/=10;
            digitcount++;
        }
        System.out.println(digitcount);
    }

}
