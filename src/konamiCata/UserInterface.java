package konamiCata;

import  java.util.*;

public class UserInterface {

    private Scanner scanner;

    public UserInterface() {
        this.scanner = new Scanner(System.in);
    }

    public String redKey() {
        System.out.println("Insert the magic Sequence:");
        return scanner.nextLine().toUpperCase(); // Convert input to uppercase for case-insensitive comparison
    }

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void closeScanner() {
        scanner.close();
    }}
