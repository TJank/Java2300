public class MusicPlayer {

    public static void main(String[] args) {

        Track one = new Track("Show Must Go On", 200);
        Track two = new Track("Bohemian Rhapsody", 330);
        Track three = new Track("We Will Rock You", 350);

        TrackList songList = new TrackList();

        songList.enqueue(one);
        songList.enqueue(two);
        songList.enqueue(three);


        while(!songList.isEmpty()) {
            Track song = songList.dequeue();
            System.out.println("Currently playing " + song);
        }
    }
}
