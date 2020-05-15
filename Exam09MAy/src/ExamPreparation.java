import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int students = Integer.parseInt(scan.nextLine());

        int sumTask = 0;
        //  int sumEnergy = 0;

        int question = 0;

        int task =   Integer.parseInt(scan.nextLine());
        int energy = Integer.parseInt(scan.nextLine());
int sumQuestion = 0;
boolean trainer = false;

        while (students >= 10) {

            sumTask += task;
            energy += task*2;
            students -= 5;

            question = students * 2;
            energy -= 3*question;
           // question++;
            sumQuestion+=question;
            if (energy <= 0) {
                trainer = true;
                break;
            }


           int newStudents = students /10;
            students = students + newStudents;



        }


        if (trainer == false) {
            System.out.println("The students are too few!");
            System.out.printf("Problems solved: %d", sumTask);
        } else {
            System.out.println("The trainer is too tired!");
            System.out.printf("Questions answered: %d", sumQuestion);
        }


    }
}