public class TrackNode {

    private Track track;
    private TrackNode next;


    public TrackNode(Track track) {
        setTrack(track);
        next = null;
    }

    public Track getTrack() {
        return track;
    }

    public TrackNode getNext() {
        return next;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

    public void setNext(TrackNode next) {
        this.next = next;
    }
}
