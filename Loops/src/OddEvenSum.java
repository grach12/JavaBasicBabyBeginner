import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scan.nextLine());
            if (i % 2 == 0) {
                evenSum += number;  //evenSum=evenSum+number;
            } else {
                oddSum += number;           //oddSum= oddSum+number;
                }
        }
        if (oddSum == evenSum)
        {
            System.out.printf("Yes, sum = %d ", oddSum);
        }
        else
        {
            System.out.printf("No, diff = %d ", Math.abs(oddSum - evenSum));
        }
    }
}
