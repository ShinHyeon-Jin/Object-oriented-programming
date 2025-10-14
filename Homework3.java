import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.print("몇 개의 정수를 입력하시나요? : ");
        i = sc.nextInt();
        int[] arr = new int[i];
        for (int k=0; k<i; k++){
            int num;
            System.out.print("정수 입력 : ");
            arr[k] = sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        for (int k=0; k<i; k++){
            if(arr[k]>max){ max = arr[k]; }
            if(arr[k]<min){ min = arr[k]; }
        }
        System.out.println("최댓값 : " + max +", 최솟값 : " + min);
    }
}
