import java.util.Scanner;

public class Numbers1toNwith3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        var n = Integer.parseInt(scan.nextLine());

        for (int i=1; i<=n;i+=3){
            System.out.println(i);
        }
/*for цикъл от 1 до n (включително) и задайте стъпка 3.
 Това означава, че при всяка итерация на цикъла, променливата i
 ще увеличава стойността си с 3, вместо с 1:*/
    }
}
