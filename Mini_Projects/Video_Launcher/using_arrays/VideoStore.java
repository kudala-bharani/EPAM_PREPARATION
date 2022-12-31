package Mini_Projects.Video_Launcher.using_arrays;

class VideoStore {
    private Video[] store;

    public VideoStore() {
        store = new Video[10];
    }

    public void addVideo(String name) {
        for (int i = 0; i < store.length; i++) {
            if (store[i] == null) {
                store[i] = new Video(name);
                break;
            }
        }
    }

    public void doCheckout(String name) {
        for (Video video : store) {
            if (video != null && video.getName().equals(name)) {
                video.doCheckout();
                break;
            }
        }
    }

    public void doReturn(String name) {
        for (Video video : store) {
            if (video != null && video.getName().equals(name)) {
                video.doReturn();
                break;
            }
        }
    }

    public void receiveRating(String name, int rating) {
        for (Video video : store) {
            if (video != null && video.getName().equals(name)) {
                video.receiveRating(rating);
                break;
            }
        }
    }

    public void listInventory() {
        System.out.println("------------------------------------------------");
        System.out.println("Video Name        | Checkout Status | Rating");
        for (Video video : store) {
            if (video != null) {
                String name = video.getName();
                String checkout = String.valueOf(video.getCheckout());
                String rating = String.valueOf(video.getRating());
                System.out.printf("%-17s | %-15s | %s\n", name, checkout, rating);
            }
        }
        System.out.println("------------------------------------------------");
    }

}
