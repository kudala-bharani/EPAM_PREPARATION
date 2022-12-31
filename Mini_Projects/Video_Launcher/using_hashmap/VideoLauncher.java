package Mini_Projects.Video_Launcher.using_hashmap;

import java.util.Scanner;

public class VideoLauncher {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VideoStore store = new VideoStore();

        while (true) {
            System.out.println("MAIN MENU");
            System.out.println("1. Add Videos:");
            System.out.println("2. Check Out Video :");
            System.out.println("3. Return Video :");
            System.out.println("4. Receive Rating :");
            System.out.println("5. List Inventory :");
            System.out.println("6. Exit :");
            System.out.print("Enter your choice (1..6): ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the video you want to add: ");
                    String name = sc.nextLine();
                    store.addVideo(name);
                    System.out.println("Video \"" + name + "\" added successfully.");
                    break;
                case 2:
                    System.out.print("Enter the name of the video you want to check out: ");
                    name = sc.nextLine();
                    store.doCheckout(name);
                    System.out.println("Video \"" + name + "\" checked out successfully.");
                    break;
                case 3:
                    System.out.print("Enter the name of the video you want to return: ");
                    name = sc.nextLine();
                    store.doReturn(name);
                    System.out.println("Video \"" + name + "\" returned successfully.");
                    break;
                case 4:
                    System.out.print("Enter the name of the video you want to rate: ");
                    name = sc.nextLine();
                    System.out.print("Enter the rating for this video: ");
                    int rating = sc.nextInt();
                    store.receiveRating(name, rating);
                    System.out.println("Rating \"" + rating + "\" has been mapped to the Video \"" + name + "\".");
                    break;
                case 5:
                    store.listInventory();
                    break;
                case 6:
                    System.out.println("Exiting... Thanks for using the application.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }
}
