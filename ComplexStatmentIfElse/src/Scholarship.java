import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        var income = Double.parseDouble(scan.nextLine());
        var score = Double.parseDouble(scan.nextLine());
        var minimumSalary = Double.parseDouble(scan.nextLine());

        var socialScolarship = 0.0;
        var scoreScholarship = 0.0;


        if ((income < minimumSalary)&&(score>4.50)) {
            socialScolarship = minimumSalary * 0.35;
            System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(socialScolarship));
        }
            else if (score > 5.5) {
            scoreScholarship = score * 25;
            System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(scoreScholarship));
        }
            else if (socialScolarship > scoreScholarship) {
            System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(socialScolarship));
            }

        else{
            System.out.println("You cannot get a scholarship!");
        }


    }
}
