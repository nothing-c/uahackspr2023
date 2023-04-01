import java.util.ArrayList;
import java.util.Scanner;
public class Server
{
	public ArrayList<Integer> totalUsers = new ArrayList<Integer>();
	public ArrayList<Integer> onlineUsers = new ArrayList<Integer>();
	public ArrayList<Integer> locations = new ArrayList<Integer>();
	public int UID;

	//Method for Creating and checking username
	public static void createUser(ArrayList<Integer> totalUsers){
		System.out.println("Enter Username: ");
		Scanner scnr = new Scanner(System.in);
		//int UID = scnr.nextInt();

		while (totalUsers.lastIndexOf(UID) != -1)
		{
				System.out.println("Username already exists please try again.");
				UID = scnr.nextInt();
		}
		totalUsers.add(UID);

	}
	/*
	public static void main(String[] args) 
    {
		//Creating totalUsers
		
		System.out.println(totalUsers);

		//Creating onlineUsers
		
		System.out.println(onlineUsers);

		//Creating Locations
		System.out.println(locations);

		//UID TESTING
		totalUsers.add(7);
		totalUsers.add(8);
		System.out.println(totalUsers);

		createUser(totalUsers);

		System.out.println(totalUsers);
	}*/
}
