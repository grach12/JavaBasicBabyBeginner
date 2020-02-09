import java.util.Scanner;

public class AreaOfAll {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String figure = new String(scan.nextLine());

        switch (figure){
            case "square":
                var squareMeters = Double.parseDouble(scan.nextLine());
                System.out.printf("%.3f",squareMeters*squareMeters);
                break;

            case "rectangle":
                var sideA = Double.parseDouble(scan.nextLine());
                var sideB = Double.parseDouble(scan.nextLine());
                System.out.printf("%.3f",sideA*sideB);
                break;

            case "circle":
                var r = Double.parseDouble(scan.nextLine());
                var area = Math.PI*(r*r);
                System.out.printf("%.3f",area);
                break;

            case "triangle":
                var L = Double.parseDouble(scan.nextLine());
                var H = Double.parseDouble(scan.nextLine());
                System.out.printf("%.3f", L/2*H);
                break;

        }

    }
}
