import java.util.Scanner;

public class ElementEqualSumALL {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scan.nextLine());
            sum += number;
            if (number > max) {
                max = number; //това ни е максималното число
            }
        }
        int sumWithoutMax = sum-max; //сумата без максималното число
       // System.out.println(sum);

        if (max==sumWithoutMax){
            System.out.printf("Yes%nSum = "+max);
        }
        else {
            int diff = Math.abs(max-sumWithoutMax);
            System.out.printf("No%nDiff = "+diff);
        }
    }
}
