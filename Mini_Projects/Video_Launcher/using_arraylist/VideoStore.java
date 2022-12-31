package Mini_Projects.Video_Launcher.using_arraylist;

import java.util.ArrayList;

public class VideoStore {
	ArrayList<Video> store = new ArrayList<Video>();

	public void addVideo(String name) {
		store.add(new Video(name));
		System.out.println("Video \"" + name + "\" added successfully.");
	}

	public void doCheckout(String name) {
		for (Video e : store) {
			if (name.equals(e.getName()) == true) {
				e.checkout = true;
				System.out.println("Video \"" + name + "\" checked out successfully.");
				break;
			}
		}
	}

	public void doReturn(String name) {
		for (Video e : store) {
			if (name.equals(e.getName()) == true) {
				e.checkout = false;
				System.out.println("Video \"" + name + "\" returned successfully.");
				break;
			}
		}
	}

	public void receiveRating(String name, int rating) {
		for (Video e : store) {
			if (name.equals(e.getName()) == true) {
				e.rating = rating;
				System.out.println(
						"Rating \"" + rating + "\" has been mapped to the Video \"" + name + "\" successfully.");
				break;
			}
		}
	}

	public void listInventory() {
		System.out.println("------------------------------------------------");
		System.out.println("VideoName \t | Checkout \t | Rating");
		for (Video video : store) {
			System.out.println(video.getName() + "\t\t | " + video.getCheckout() + "\t | " + video.getRating());
		}
		System.out.println("------------------------------------------------");
	}

}
