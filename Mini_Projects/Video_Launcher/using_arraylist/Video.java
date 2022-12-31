package Mini_Projects.Video_Launcher.using_arraylist;

public class Video {
	public String videoName;
	public boolean checkout;
	public int rating;

	Video(String name) {
		videoName = name;
	}

	public String getName() {
		return videoName;
	}

	public void doCheckout() {
		checkout = true;
	}

	public void doReturn() {
		checkout = false;
	}

	public void receiveRating(int rating) {
		this.rating = rating;
	}

	public int getRating() {
		return rating;
	}

	public boolean getCheckout() {
		return checkout;
	}

}
