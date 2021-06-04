import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String thePassword = "abc$123";
        System.out.println("What is the password?");
        Scanner scanner = new Scanner(System.in);
        String userPass = scanner.nextLine();
        if (userPass.equals(thePassword)) {
            System.out.println("Welcome!");
        } else {
            System.out.println("I don't know you.");
        }
    }
}