
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class User {

    public int points_held;
    public int points_in_escrow;
    public int gacha_num_held;
    public int gacha_roll_tokens_held;
    public int UID;
    
    public User(int ph,int pie, int gnh, int grth, int id) {
        this.points_held=ph;
        this.points_in_escrow=pie;
        this.gacha_num_held=gnh;
        this.gacha_roll_tokens_held=grth;
        this.UID=id;
    }
     public void main(String args[]) throws FileNotFoundException {
        
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

        String line = "";
        int count = 0;
        while (scnr_friend.hasNextLine()) {
            line = scnr_friend.nextLine();
            friendlist[count] = line;
            count++;
        }      

        }
        
    }





