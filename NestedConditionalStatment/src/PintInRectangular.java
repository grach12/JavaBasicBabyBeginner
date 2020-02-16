import java.util.Scanner;

public class PintInRectangular {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        var x1 = Double.parseDouble(scan.nextLine());
        var y1 = Double.parseDouble(scan.nextLine());
        var x2 = Double.parseDouble(scan.nextLine());
        var y2 = Double.parseDouble(scan.nextLine());
        var x = Double.parseDouble(scan.nextLine());
        var y = Double.parseDouble(scan.nextLine());

        if ((x1<x2)&&(y1<y2)) {
boolean firstConditin = (x==x1||x==x2)&&(y>=y1&&y<=y2);
boolean secondCondition = (y==y1||y==y2)&&(x>=x1&&x<=x2);

if (firstConditin||secondCondition){
    System.out.println("Border");
}
else {
    System.out.println("Inside / Outside");
}
        }
    }
}
