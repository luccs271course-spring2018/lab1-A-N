/**
 * Created by afischer5 on 9/1/2017.
 */

import java.util.Scanner;

public class main {
    public static void main (String[] args){

        int input;
        Scanner keyboard = new Scanner(System.in);

        input=keyboard.nextInt();

        fizzBuzz(input);

        keyboard.close();
    }
    public static void fizzBuzz(int input){

        for(int i=0; i<input; i++){
            if(i%3 == 0 ) System.out.print("Fizz ");
            if(i%5 == 0 )  System.out.print("Buzz");
            if(i%3 != 0 && i%5 != 0) System.out.print(i);

            System.out.println();
        }

    }
}

