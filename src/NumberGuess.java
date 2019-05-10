import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int a = 1 + (int) (Math.random() * 99);


        int m=0;
        boolean execute=false;


        while(execute==false){

            System.out.println("Guess the number :");
            int n=sc.nextInt();
            m++;

            if (n > a)
            {
                System.out.println("Number Guessed is more than original number");

            }
            else if (n < a)
            {
                System.out.println("Number Guessed is less than original number");

            }
            else
            {
                execute=true;
            }

        }

        System.out.println("Number guessed matches the original number");

    }
}
