package day13_string;

public class C2_UpperOrLower {

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a letter: ");
//        String letter = input.next();
        char letter = 'a';

        // lower case range --- > 97 - 122
        // upper case range --- > 65 - 90

        if (letter >= 97 && letter <= 122) {
            System.out.println("You entered letter: " + letter +
                    "\nYour converted letter: " + (char)(letter - 32));
        }

        else if (letter >= 65 && letter <= 90) {
            System.out.println("You entered letter: " + letter +
                    "\nYour converted letter: " + (char)(letter - 32));
        } else {
            System.out.println("It is not a lower case or upper case letter");
        }
    }
}
