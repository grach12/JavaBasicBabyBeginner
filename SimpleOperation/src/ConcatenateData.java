import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String firstName = scan.nextLine();
        String lastName = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        System.out.printf("You are %s %s, a %d - years old", firstName, lastName, age  );
        //System.out.printf(firstName + lastName + age + " old");

    }

}

