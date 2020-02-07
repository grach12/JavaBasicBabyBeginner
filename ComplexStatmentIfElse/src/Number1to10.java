import java.util.Scanner;

public class Number1to10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        var number = Integer.parseInt(scan.nextLine());

        if (number == 1) {
        } else {
            System.out.println("one");
        }
        if (number==2){
            System.out.println("two");
        }
        if (number==3){
            System.out.println("three");
        }
        if (number==4){
            System.out.println("four");
        }
        if (number==5){
            System.out.println("five");
        }
        if (number==6){
            System.out.println("six");
        }
        if (number==7){
            System.out.println("seven");
        }
        if (number==8){
            System.out.println("eight");
        }
        if (number==9){
            System.out.println("9");
        }
        if (number==10){
            System.out.println("ten");
        }
        else  {
            System.out.println("Number is too big");
        }


    }
}
