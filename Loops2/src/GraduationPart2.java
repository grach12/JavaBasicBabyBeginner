import java.util.Scanner;

public class GraduationPart2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();

        int gradeCount = 0;
        double avgGrade = 0;
        int badGradeCnt = 0; //нов брояч за лоши оценки

        while (gradeCount < 12) {
            double grade = Double.parseDouble(scan.nextLine());
            if (grade >= 4) {
                avgGrade = avgGrade + grade;
                gradeCount++;
                badGradeCnt=0; //нулиране на брояча
            }else { // добавен е els ако го скъсат
                badGradeCnt++;
                if(badGradeCnt>1){
                    break;
                }
            }
        }
        if (gradeCount==12) {
            avgGrade = avgGrade / gradeCount;
            System.out.printf("%s graduated. Average grade: %.2f", name, avgGrade);
        }else{
            System.out.printf("%s has been excluded at %d grade" , name, ++gradeCount);
        }

    }
}
