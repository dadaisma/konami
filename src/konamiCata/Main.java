package konamiCata;

import java.util.Scanner;

public class Main {

    private static final String[] CODE = {
            "UPUPDOWNDOWNLEFTRIGHTBAENTER"
    };

    private static int startIndex = 0;

    public static void main(String[] args) {
        UserInterface userInterface = new UserInterface();
        Scanner scanner = new Scanner(System.in); // Create scanner outside the loop

        while (true) {
            String key = userInterface.redKey();
            if (key.equals(CODE[startIndex])) {
                startIndex++;

                if (startIndex == CODE.length) {
                    userInterface.printMessage("Konami Code Correct");
                    startIndex = 0;
                    break;
                } else {
                    userInterface.printMessage("Correct! Keep going...");
                    break;
                }
            } else {
                userInterface.printMessage("Incorrect. Try again!");
                startIndex = 0;

            }
        }

        scanner.close(); // Close scanner at the end
    }
}
