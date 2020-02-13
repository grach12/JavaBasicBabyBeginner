import java.util.Scanner;

public class Gendar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        var age = Double.parseDouble(scan.nextLine());
        String gendar = scan.nextLine();

        if (gendar.equals("m")) {
            if (age >= 16) {
                System.out.println("Mr.");
        }
            else {
            System.out.println("Master");
        }
    }  else if (gendar.equals("f")) {
            if (age >= 16) {
                System.out.println("Ms.");
            } else {
                System.out.println("Miss");
            }

        }
    }
}


