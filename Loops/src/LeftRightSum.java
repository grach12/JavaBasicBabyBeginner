import java.util.Scanner;

public class LeftRightSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < n; i++) {
            int currenNumber = Integer.parseInt(scan.nextLine());
            leftSum = leftSum + currenNumber;
        }
        for (int i = 0; i < n; i++) {
            int currenNumber = Integer.parseInt(scan.nextLine());
            rightSum = rightSum + currenNumber;
        }
if (leftSum==rightSum){
    System.out.println("Yes, sum = "+leftSum);
}
else{
    int difference = Math.abs(leftSum- rightSum);
    System.out.println("No, diff = "+difference);
}
    }
}