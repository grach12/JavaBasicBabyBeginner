import java.util.Scanner;

public class BonusPoints {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        var bonus = 0.0;

        if (number <= 100) {
            bonus = 5;
        }
        else if (number<1000) {
        bonus=number*0.2;
        }
        else {
            bonus = number*0.1;
        }


        if (number % 2 == 0) {
            bonus = (bonus) + 1;

        }

        else if (number % 10 == 5){ //За да проверите дали едно число завършва на 5 трябва да разделите числото на 10 и ако получите остатък при делението 5, то значи числото завършва на 5
            bonus = (bonus + 2);
        }

        System.out.println(bonus);
        System.out.println(number+bonus);
    }
}
