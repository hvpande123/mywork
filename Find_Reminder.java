import java.util.Scanner;

class FindRemiander {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int loop = scan.nextInt();
        
        int numerator;
        int denominator;
        while(loop-- >0) {
            numerator = scan.nextInt();
            denominator = scan.nextInt();
            System.out.println(numerator % denominator);
        }
    }
}
