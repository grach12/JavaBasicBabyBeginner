import java.util.Scanner;


public class Login {

        public static void main(String[] args) {

            Scanner scan =new Scanner(System.in);

            String userName = scan.nextLine();
            int userLenght = userName.length();
            String pass = "";
            for (int i =userLenght-1 ; i >=0 ; i--) {
                pass = pass+userName.charAt(i);
                //String.format("%s%s", pass, userName.charAt(i));
            }
            System.out.println(pass);

//
//            while (){
//
//            }

        }
    }
