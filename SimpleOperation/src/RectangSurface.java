import java.util.Scanner;

public class RectangSurface {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        var x1 = Double.parseDouble(scan.nextLine());
        var y1 = Double.parseDouble(scan.nextLine());
        var x2 = Double.parseDouble(scan.nextLine());
        var y2 = Double.parseDouble(scan.nextLine());

        double lenght = Math.abs(x1-x2);
        double width = Math.abs (y1-y2);

        double area = lenght*width;
        double perimtr = 2*(lenght+width);

        System.out.printf("%.2f%n",area);
        System.out.printf("%.2f", perimtr);



    }

}
