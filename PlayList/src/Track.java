public class Track {

    private String title;
    private int duration;

    public Track() {
        title = "Title";
        duration = 0;
    }

    public Track(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    // Accessor methods
    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    // Mutator methods
    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Track{" +
                "title: '" + title + '\'' +
                ", duration: " + duration;
    }
}
