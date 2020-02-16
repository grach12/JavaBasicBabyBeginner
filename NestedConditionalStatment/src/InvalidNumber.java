import java.util.Scanner;
public class InvalidNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        var number = Integer.parseInt(scan.nextLine());
        if ( !((number>=100)&&(number<=200) || (number==0))){
            System.out.println("invalid");
        }
    }
}
 /*

import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        var number = Integer.parseInt(scan.nextLine());
 if (number == 0) {
     System.exit(1); //After this command java stops immediately!
 }
else if ((number<100) || (number>200)) {

        }
        System.out.println("invalid");
    }
}

        }*/