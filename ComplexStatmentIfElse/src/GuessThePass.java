import java.util.Scanner;

public class GuessThePass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        var pass = new String(scan.nextLine());

        if ("bub".equals(pass)) {
            System.out.println("Welkome");
        }
        else{
            System.out.println("wrong pass");
        }

    }
}
