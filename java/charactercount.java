import java.util.*;

public class charactercount {

    public static int countOccurrences(String str, char ch) {
        int count = 0;

        str = str.toLowerCase();
        ch = Character.toLowerCase(ch);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        System.out.print("Enter a character to search for: ");
        char searchChar = sc.next().charAt(0);

        int count = countOccurrences(inputString, searchChar);

        System.out.println("The character '" + searchChar + "' appears " + count + " time(s) in the string.");
        sc.close();
    }
}