import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int freeWidth = Integer.parseInt(scan.nextLine());
        int freeLength = Integer.parseInt(scan.nextLine());
        int freeHeight = Integer.parseInt(scan.nextLine());

        int volume = freeLength*freeHeight*freeWidth;

        String input = scan.nextLine();

        while (!input.equals("Done")){
            int boxes = Integer.parseInt(input);
            volume=volume-boxes;
            if(volume<0){
                break;
            }
            input=scan.nextLine();
        }
if (volume<0){
    int spaceNeed = Math.abs(volume);
    System.out.printf("No more free space! You need %d Cubic meters more.", spaceNeed);
} else{
    System.out.printf("%d Cubic meters left.", volume);
}
    }
}
