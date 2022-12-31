package Mini_Projects.Video_Launcher.using_hashmap;

import java.util.*;

class VideoStore {
    private Map<String, Video> store;

    public VideoStore() {
        store = new HashMap<>();
    }

    public void addVideo(String name) {
        store.put(name, new Video(name));
    }

    public void doCheckout(String name) {
        Video video = store.get(name);
        if (video != null) {
            video.doCheckout();
        }
    }

    public void doReturn(String name) {
        Video video = store.get(name);
        if (video != null) {
            video.doReturn();
        }
    }

    public void receiveRating(String name, int rating) {
        Video video = store.get(name);
        if (video != null) {
            video.receiveRating(rating);
        }
    }

    public void listInventory() {
        String separator = String.join("", Collections.nCopies(50, "-"));
        System.out.println(separator);
        String header = String.format("%-20s | %-15s | %s", "Video Name", "Checkout Status", "Rating");
        System.out.println(header);

        StringBuilder sb = new StringBuilder();
        for (Video video : store.values()) {
            sb.append(String.format("%-20s | %-15s | %s\n", video.getName(), video.getCheckout(), video.getRating()));
        }
        System.out.print(sb);
        System.out.println(separator);
    }

}