import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int floor = Integer.parseInt(scan.nextLine());
        int rooms = Integer.parseInt(scan.nextLine());

        for (int i = floor; i >= 1; i--)
        {
            for (int j = 0; j < rooms; j++)
            {
                if (floor==i) //последен етаж ГОЛЕМИ апартаменти
                {
                    System.out.printf("L%d%d ", i, j);
                }
                else if (i % 2 == 0) //четен етаж само офиси
                {
                    System.out.printf("O%d%d ", i, j);
                }
                else //апартаменти
                {
                    System.out.printf("A%d%d %n", i, j);
                }
            }

        }
    }
}
