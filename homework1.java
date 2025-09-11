import java.util.Scanner;

class Homework1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("정수를 입력하세요: ");
        int n0 = sc.nextInt();
        sum += n0;
        System.out.printf("현재까지 입력된 정수의 합은 %d입니다.\n", sum);

        System.out.println("정수를 입력하세요: ");
        int n1 = sc.nextInt();
        sum += n1;
        System.out.printf("현재까지 입력된 정수의 합은 %d입니다.\n", sum);

        System.out.println("정수를 입력하세요: ");
        int n2 = sc.nextInt();
        sum += n2;
        System.out.printf("현재까지 입력된 정수의 합은 %d입니다.\n", sum);

        System.out.println("정수를 입력하세요: ");
        int n3 = sc.nextInt();
        sum += n3;
        System.out.printf("현재까지 입력된 정수의 합은 %d입니다.\n", sum);

        System.out.println("정수를 입력하세요: ");
        int n4 = sc.nextInt();
        sum += n4;
        System.out.printf("현재까지 입력된 정수의 합은 %d입니다.\n", sum);
    }
}
