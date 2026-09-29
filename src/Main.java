import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        ArrayList<String> usernames = new ArrayList<>();
        ArrayList<String> passwords = new ArrayList<>();


        usernames.add("Anwar");
        usernames.add("Najib");
        usernames.add("kevin");
        usernames.add("Lucas");

        passwords.add("Pass1");
        passwords.add("Pass2");
        passwords.add("KomISkole");
        passwords.add("KomISkole");

        loginattempt(scanner, usernames, passwords);
    }
public static void loginattempt(Scanner scanner,
                                ArrayList<String> usernames,
                                ArrayList<String> passwords) {
    System.out.println("Skriv dit brugernavn: ");
    String username = scanner.nextLine();

    int userIndex = validateUser(username, usernames);

    if (userIndex == -1) {
        System.out.println("Bruger ikke fundet");
        return;
    }
    int attemptsLeft = 3;

    while (attemptsLeft > 0) {
        System.out.println("Skriv Kodeord");
        String password = scanner.nextLine();
        if (validatePassword(userIndex, password, passwords)) {
            System.out.println("Velkommen " + username + "!");
            return;
        }

        attemptsLeft--;

        if (attemptsLeft > 0) {
            System.out.println("Forkert adgangskode.");
            System.out.println("Du har " + attemptsLeft + " forsøg tilbage");
        }

    }
    System.out.println("Kontoen er låst.");
}
public static int validateUser(String username,
                               ArrayList<String> usernames) {
    for (int i = 0; i < usernames.size(); i++) {
        if (usernames.get(i).equalsIgnoreCase(username)) {
            return i;
        }
    }
    return -1;
}
public static boolean validatePassword(int userIndex,
                                       String password,
                                       ArrayList<String> passwords) {
        return passwords.get(userIndex).equals(password);
}
}









