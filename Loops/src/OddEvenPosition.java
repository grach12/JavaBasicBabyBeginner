import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        //double sum = 0;
       // double min = Double.MAX_VALUE;
       //double max = Double.MIN_VALUE;
        double oddSum=0;
        double oddMin=Double.MAX_VALUE;
        double oddMax= Double.MIN_VALUE;
        double evenSum=0;
        double evenMin=Double.MAX_VALUE;
        double evenMax=Double.MIN_VALUE;

        for (int i = 0; i <n ; i++) {
            double number = Double.parseDouble(scan.nextLine());
            if (i % 2 == 0) {
                oddSum = number+oddSum;  //evenSum=evenSum+number;

            if (number>oddMax) {
                oddMax = number;
            }else if (number<oddMin){
                oddMin = number;
            }
        }
            else {
                evenSum=number+evenSum;
                if(number>evenMin){
                    evenMax=number;
                }else if (number<evenMin){
                    evenMin=number;
                }
            }
        }
        System.out.println(oddSum);
        System.out.println(oddMin);
        System.out.println(oddMax);
        System.out.println(evenSum);
        System.out.println(evenMin);
        System.out.println(evenMax);

    }
}
