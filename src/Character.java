import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Character {
    public static void main(String args[]) throws IOException {
        char m;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any character:");
        m = (char) bf.read();

        if(m >= 'a' && m <= 'z') {
            System.out.println("Lower Case"); }

        else if(m >= 'A' && m <= 'Z') {
            System.out.println("Upper case");

        } else if (m >= '0' && m<='9') {
            System.out.println("Digit");
        } else {
            System.out.println("Special Character");
        }
    }
}
