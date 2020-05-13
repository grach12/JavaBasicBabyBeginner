import java.util.Scanner;

public class ExamRetention {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double students = Double.parseDouble(scan.nextLine());
        int seasons = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= seasons; i++) {
            double resubscribe = 0;
            double examOne = 0;
            double examTwo = 0;
            double moveOn = 0;
            examOne += Math.ceil(students * 0.9);
            examTwo += Math.ceil(examOne * 0.9);

            moveOn += Math.ceil(examTwo * 0.8);
            if (i % 3 == 0) {
                resubscribe += Math.ceil(moveOn * 0.15);
            } else {
                resubscribe += Math.ceil(moveOn * 0.05);
            }
            students = (moveOn + resubscribe);
//           System.out.println("ExamOne: " + examOne);
//           System.out.println("ExamTwo: " + examTwo);
//            System.out.println("moveOne: " + moveOn);
        }
        System.out.println("students: " + students);
    }
}
