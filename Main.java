import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

public static void main(String args[]) throws FileNotFoundException {

    User newUser = new User();

    File user_stats = new File("user_stats.txt");
    File user_friends = new File("user_friends.txt");

    Scanner scnr_stats = new Scanner(user_stats);
    Scanner scnr_friends = new Scanner(user_friends);

    newUser.setNumPoints(scnr_stats.nextInt());
    newUser.setEscrowPoints(scnr_stats.nextInt());
    newUser.setNumGacha(scnr_stats.nextInt());
    newUser.setRollTokensHeld(scnr_stats.nextInt());
    newUser.setUID(scnr_stats.nextInt());
    scnr_stats.nextLine();
    newUser.setUsername(scnr_stats.nextLine());

    String[] friends_list = new String[50];
    int count = 0;
    while (scnr_friends.hasNextLine()) {
        friends_list[count] = scnr_friends.nextLine();
        count ++;
    }
    newUser.setFriendsList(friends_list);

    System.out.println("User ID: " + newUser.getUID());
    System.out.println("Username: " + newUser.getUsername());
    System.out.println("Number of points: " + newUser.getNumPoints());
    System.out.println("Number of points in escrow: " + newUser.getEscrowPoints());
    System.out.println("Number of gacha held: " + newUser.getNumGacha());
    System.out.println("Number of gacha tokens held: " + newUser.getRollTokensHeld());
    System.out.println("List of friends: " + newUser.getFriendsList());

}

}