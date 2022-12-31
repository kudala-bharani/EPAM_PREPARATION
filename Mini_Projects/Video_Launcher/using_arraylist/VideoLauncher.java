package Mini_Projects.Video_Launcher.using_arraylist;

import java.util.*;

public class VideoLauncher {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		VideoStore vs = new VideoStore();
		int choice;
		do {
			System.out.println("MAIN MENU");
			System.out.println("=========");
			System.out.println("1.Add Videos: ");
			System.out.println("2.Check Out Video :");
			System.out.println("3.Return Video : ");
			System.out.println("4.Receive Rating : ");
			System.out.println("5.List Inventory : ");
			System.out.println("6.Exit : ");
			System.out.print("Enter your choice (1..6) : ");
			choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
				case 1:
					System.out.print("Enter the name of the video you want to add : ");
					String name = sc.nextLine();
					vs.addVideo(name);
					break;
				case 2:
					System.out.print("Enter the name of the video you want to check out : ");
					String name1 = sc.nextLine();
					vs.doCheckout(name1);
					break;
				case 3:
					System.out.print("Enter the name of the video you want to Return : ");
					String name2 = sc.nextLine();
					vs.doReturn(name2);
					break;
				case 4:
					System.out.print("Enter the name of the video you want to Rate : ");
					String name3 = sc.nextLine();
					System.out.print("Enter the rating for this video : ");
					int rating = sc.nextInt();
					vs.receiveRating(name3, rating);
					break;
				case 5:
					vs.listInventory();
					break;
				case 6:
					System.out.println("Exiting...!! Thanks for using the application.");
					sc.close();
					return;
				default:
					System.out.println("Invalid input");

			}
		} while (true);

	}

}