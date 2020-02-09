import java.util.Scanner;

public class AreaOfAll {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String figure = new String(scan.nextLine());

        switch (figure){
            case "square":
                var squareMeters = Double.parseDouble(scan.nextLine());
                System.out.println(squareMeters*squareMeters);
                break;

            case "rectangle":
                var sideA = Double.parseDouble(scan.nextLine());
                var sideB = Double.parseDouble(scan.nextLine());
                System.out.println(sideA*sideB);
                break;

        }

    }
}
