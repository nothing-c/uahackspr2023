
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class User {

    public static void main(String args[]) throws FileNotFoundException {
        
        int points_held;
        int points_in_escrow;
        int gacha_num_held;
        int gacha_roll_tokens_held;
        int UID;

        String[] friendlist = new String[50];

        // Reading file
        File user_stats = new File("user_stats.txt");
        File user_friends = new File("user_friends.txt");

        // Scanner reads file
        Scanner scnr_stats = new Scanner(user_stats);
        Scanner scnr_friend = new Scanner(user_friends);

        // Reading each line
        
        points_held = scnr_stats.nextInt();
        points_in_escrow = scnr_stats.nextInt();
        gacha_num_held = scnr_stats.nextInt();
        gacha_roll_tokens_held = scnr_stats.nextInt();
        UID = scnr_stats.nextInt();

        //System.out.println(points_held);
        //System.out.println(points_in_escrow);
        //System.out.println(gacha_num_held);
        //System.out.println(gacha_roll_tokens_held);
        //System.out.println(UID);

        String line = "";
        int count = 0;
        while (scnr_friend.hasNextLine()) {
            line = scnr_friend.nextLine();
            friendlist[count] = line;
            count++;
        }      

        //for (int i = 0; i < friendlist.length; i++) {
          //  System.out.println(friendlist[i]);
        }
    }





