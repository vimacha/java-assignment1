import java.util.ArrayList;
import java.util.Scanner;

public class IntegerValues
{

    public static void main(String[] args)
    {
        ArrayList<Double> numbers = new ArrayList<Double>();

        Scanner in = new Scanner(System.in);
        System.out.println("Use Space between numbers and Enter to find the sum");
        System.out.println("Please enter a list of numbers: ");
        try {

            String[] arg = in.nextLine().split("\\s");

            for (int i = 0; i < arg.length; i++)
                numbers.add(Double.parseDouble(arg[i]));


            if (numbers.size() == 0) {
                System.out.println("No Value given");

            } else {
                double total = 0;
                for (double element : numbers) {
                    total = total + element;

                }

                System.out.println("Total: " + total);

            }
        }

        catch (Exception e) {

            System.out.println("Error!!!! Enter only numeric values");
        }
    }
}
