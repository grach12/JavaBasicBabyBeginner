import java.util.Scanner;

public class ZOO {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int dogs = Integer.parseInt(scan.nextLine());
        int allAnimals = Integer.parseInt(scan.nextLine());

        var dogFood = dogs*2.50;
        var all = allAnimals*4;
        var price = dogFood+all;

        System.out.printf("%.2f lv.", price ); // .2f форматиране до 2-рия знак

    }
}
