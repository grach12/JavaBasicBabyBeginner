import java.util.Scanner;

public class NewHome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String flowers = scan.nextLine();
        var flowerCounts = Integer.parseInt(scan.nextLine());
        var budget = Double.parseDouble(scan.nextLine());
var discount = 0.00;
var price = 0.00;

        double rose = 5.00;
        double dali = 3.80;
        double tulip = 2.80;
        double Narcissus = 3.00;
        double gladiola = 2.50;
        
switch (flowers){
    case "Roses": if (flowerCounts>80){
        discount= (rose*0.10);
        price=(rose-discount)*flowerCounts;
        // System.out.println((rose-discount)*flowerCounts);
    }
    else {
        price=(rose*flowerCounts);
        //System.out.println(rose*flowerCounts);
    }
break;
    case "Dahlias": if (flowerCounts>90){
        discount=dali*0.15;
        price=(dali-discount)*flowerCounts;
    }
    else {
        price=(dali*flowerCounts);
    }
break;
    case "Tulips": if (flowerCounts>80){
        discount=tulip*0.15;
        price=(tulip-discount)*flowerCounts;
    }
    else {
        price=(tulip*flowerCounts);
    }
        break;
    case "Narcissus": if (flowerCounts<120){
        discount=Narcissus*0.15;
        price=(Narcissus+discount)*flowerCounts;
    }
    else {
        price=(Narcissus*flowerCounts);
    }
        break;

    case "Gladiolus": if (flowerCounts<80){
        discount=gladiola*0.20;
        price=(gladiola+discount)*flowerCounts;
    }
    else {
        price=(gladiola*flowerCounts);
    }
        break;
}

if (budget>=price){
    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCounts, flowers, (budget-price));
}
else {
    System.out.printf("Not enough money, you need %.2f leva more.", (price-budget));
}

    }
}
