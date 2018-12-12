public class TrackList {

    private TrackNode head;
    private TrackNode tail;
    private int numberOfTrackNodes;

    public TrackList() {
        head = null;
        tail = null;
        numberOfTrackNodes = 0;
    }

    public boolean isEmpty() {
        return (numberOfTrackNodes == 0);
    }

    public void enqueue(Track t) {
        TrackNode tn = new TrackNode(t);
        if(isEmpty()) {
            tail = tn;
            head = tn;
        }
        else {
            tail.setNext(tn);
            tail = tn;
        }
        numberOfTrackNodes++;
    }

    public Track dequeue() throws DataStructureException {
        if(isEmpty()) {
            throw new DataStructureException("No tracks in playlist.");
        }
        else {
            Track currently_playing = head.getTrack();
            head = head.getNext();
            if(--numberOfTrackNodes == 0) {
                tail = null;
            }
            return currently_playing;
        }
    }

    @Override
    public String toString() {
        String listString = "";
        TrackNode current = head;
        while (current != null) {
            listString += current.getTrack().toString() + "\n";
            current = current.getNext();
        }
        return listString;
    }
}
