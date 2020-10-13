package guess;

import java.util.Random;
import java.util.Scanner;

public class Gamefor {
    public static void main(String[] args) {
        int secret = new Random().nextInt(10) + 1;
        System.out.println(secret);
        for(int i = 0;i <= 4;i++){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter a number("+i+"/4)");
            int number = scanner.nextInt();
            if(number < secret){
                System.out.println("higher");
            }else if(number > secret){
                System.out.println("low");
            }else{
                System.out.println("Great!, the number is " + number);
                break;
            }
        }
        System.out.println("結束");

    }

}
