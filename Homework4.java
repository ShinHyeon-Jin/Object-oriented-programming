import java.util.Scanner;

public class Homework4 {
    static int gcd(int a, int b){
        if (a == b && a != 0) {return a;}
        else if ( b == 0 ) {return a;}
        else if (a > b) { return gcd(b, a%b);}
        else { return gcd(a, b%a);}
    }
    static int gcd_iterative(int a, int b){
        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,n;
        System.out.print("두 수를 입력하세요: ");
        m = sc.nextInt();
        n = sc.nextInt();
        System.out.printf("두 수의 최대공약수는 %d입니다.", gcd(m,n));
        System.out.printf("\n두 수의 최대공약수는 %d입니다.", gcd_iterative(m,n));
    }
}
