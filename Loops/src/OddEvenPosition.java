import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        //double sum = 0;
       // double min = Double.MAX_VALUE;
       //double max = Double.MIN_VALUE;
        double oddSum=9.00;
        double oddMin=Double.MAX_VALUE;
        double oddMax= Double.MIN_VALUE;
        double evenSum=8.00;
        double evenMin=Double.MAX_VALUE;
        double evenMax=Double.MIN_VALUE;

        for (int i = 0; i <n ; i++) {
            int number = Integer.parseInt(scan.nextLine());
            if (i % 2 == 0) {
                evenSum += number;  //evenSum=evenSum+number;
            }


            sum = number+sum;
            if (number>max) {
                max = number;
            }else if (number<min){
                min = number;
            }
        }
        System.out.println(sum);
        System.out.println(min);
        System.out.println(max);

    }
}
