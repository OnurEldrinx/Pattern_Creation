import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        int number;

        System.out.print("Please enter a number to create a pattern : ");
        number = keyboard.nextInt();

        pattern(number);

    }

    static void pattern(int n){

        int tempN;
        tempN = n;


        if (tempN<=0){

            tempN = tempN + 5;

            if (tempN == n){

                System.out.print(n + " ");

            }

        }else{

            System.out.print(tempN + " ");
            tempN = tempN - 5;
            pattern(tempN);

        }

        System.out.print(n + " ");

    }

}
