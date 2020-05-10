import java.util.Scanner;

public class ExamResults {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String input = scan.nextLine();
        boolean banned = false;
        while (!"Midnight".equals(input)) {
            double grade = 0;
            double eachPoints = 0.0;

            for (int i = 1; i <=6; i++) {
                double points = Double.parseDouble(scan.nextLine());

                if (points < 0)  //"{име на студент} was cheating!"
                {
                     banned=true; break;     }

                    eachPoints += points;
                    //System.out.println(grade*0.06);
            }

            grade = Math.floor(eachPoints / 6);

            if (grade*0.06>=5){
                System.out.println("===================");
                System.out.println("|   CERTIFICATE   |");
                System.out.printf("|    %.2f/6.00    |%n",grade*0.06);
                System.out.println("===================");
                System.out.printf("Issued to %s",input);
            }

            else if ((grade*0.06>=3)&&(!banned)){
                System.out.printf("%s - %.2f%n",input, grade*0.06);
            }else if ((grade>0&&grade*0.06<3)&&(!banned)){
                System.out.printf("%s - 2.00%n",input);
            }
            else {
                System.out.printf("%s was cheating!%n", input);
            }
            input = scan.nextLine();
        }

    }
}
