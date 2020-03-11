import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int width = Integer.parseInt(scan.nextLine());
        int lenght = Integer.parseInt(scan.nextLine());

        int pieceCake = width*lenght;
        String input = scan.nextLine(); // същото ли е като "";

        while (!input.equals("STOP")){  //същото ли е като input=="Stop" и какво става ако има други символи
            int piecesTaken = Integer.parseInt(input);
            pieceCake-=piecesTaken;

            if (pieceCake<0){
                break;
            }
            input = scan.nextLine();
        }

if (pieceCake>=0){
    System.out.printf("%d pieces are left.", pieceCake);
}
else{
    System.out.printf("No more cake left! You need %d pieces more.", Math.abs(pieceCake));
}

    }
}
