import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
int max = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            int number = scan.nextInt();
if (number>max){
    max=number;
}
        }
        System.out.println(max);

    }
}
