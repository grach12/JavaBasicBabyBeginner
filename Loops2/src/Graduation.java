import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();

        int gradeCount = 0;
        double avgGrade = 0;

        while (gradeCount< 12){
            double grade = Double.parseDouble(scan.nextLine());
            if (grade>=4){
                avgGrade= avgGrade+grade;
                gradeCount++; // броча се променя само пи оценки над или=4
            }
        }
        avgGrade=avgGrade/gradeCount;
        System.out.printf("%s graduated. Average grade: %.2f", name, avgGrade);

    }
}
