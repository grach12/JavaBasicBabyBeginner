import java.util.Scanner;

public class ExamSubmissions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double students = Double.parseDouble(scan.nextLine());
        double exercise = Double.parseDouble(scan.nextLine());


        var round = Math.ceil(exercise*2.8);

        var res = students*round;

        var third = students*Math.floor(exercise/3);

        var fin= third+res;

        var bite = Math.ceil(fin/10);

       // System.out.println(third);
        System.out.printf("%.0f KB needed%n",(bite*5));
        System.out.printf("%.0f submissions",fin);
    }
}
