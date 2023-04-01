import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

public static void main(String args[]) throws FileNotFoundException {

    User newUser = new User();

    File user_stats = new File("user_stats.txt");
    Scanner scnr_stats = new Scanner(user_stats);

    newUser.setNumPoints(scnr_stats.nextInt());
    newUser.setEscrowPoints(scnr_stats.nextInt());
    newUser.setNumGacha(scnr_stats.nextInt());
    newUser.setRollTokensHeld(scnr_stats.nextInt());
    newUser.setUID(scnr_stats.nextInt());
    //scnr_stats.next();
    newUser.setUsername(scnr_stats.nextLine());

}

}