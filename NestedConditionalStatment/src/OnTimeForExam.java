import java.util.Scanner;

public class OnTimeForExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        var squareMeters = Double.parseDouble(scan.nextLine());

        var hoursExam = Integer.parseInt(scan.nextLine())*60;
        var minutesExam = Integer.parseInt(scan.nextLine());
        var hoursIn = Integer.parseInt(scan.nextLine())*60;
        var minutesIn = Integer.parseInt(scan.nextLine());

        var timeOfExam = hoursExam+minutesExam;
        var arrivalTime = hoursIn+minutesIn;
        //до тук всичко е в минути, надявам се :)




    }
}
