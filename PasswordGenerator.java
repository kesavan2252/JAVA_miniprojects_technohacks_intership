import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {

    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()-_=+<>?";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the desired password length: ");
        int length = scanner.nextInt();
        
        System.out.println("Select password complexity:");
        System.out.println("1. Only lowercase letters");
        System.out.println("2. Lowercase and uppercase letters");
        System.out.println("3. Letters and digits");
        System.out.println("4. Letters, digits, and special characters");
        System.out.print("Choose an option (1-4): ");
        int complexity = scanner.nextInt();

        String password = generatePassword(length, complexity);
        System.out.println("Generated Password: " + password);

        scanner.close();
    }

    public static String generatePassword(int length, int complexity) {
        String characterSet = "";
        
        switch (complexity) {
            case 1:
                characterSet = LOWERCASE;
                break;
            case 2:
                characterSet = LOWERCASE + UPPERCASE;
                break;
            case 3:
                characterSet = LOWERCASE + UPPERCASE + DIGITS;
                break;
            case 4:
                characterSet = LOWERCASE + UPPERCASE + DIGITS + SPECIAL_CHARACTERS;
                break;
            default:
                System.out.println("Invalid complexity option. Using default (letters, digits, and special characters).");
                characterSet = LOWERCASE + UPPERCASE + DIGITS + SPECIAL_CHARACTERS;
        }

        StringBuilder password = new StringBuilder(length);
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characterSet.length());
            password.append(characterSet.charAt(index));
        }

        return password.toString();
    }
}
