import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.print("몇 개의 수를 입력할 예정인가요? : ");
        i = sc.nextInt();
        int[] arr = new int[i];
        System.out.print("수를 입력하세요: ");
        for (int k=0; k<i; k++){
            arr[k] = Integer.parseInt(sc.next());
        }
        int max=arr[0];
        int min=arr[0];
        for (int k=0; k<i; k++){
            if(arr[k]>max){ max = arr[k]; }
            if(arr[k]<min){ min = arr[k]; }
        }
        System.out.println("최댓값 : " + max +"\n최솟값 : " + min);
    }
}
