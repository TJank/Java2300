public class PlayerNode {

    private Player player;
    private PlayerNode next;

    // Overloaded constructor

    public PlayerNode(Player player) {
        setPlayer(player);
        next = null;
    }

    // Accessor
    public Player getPlayer() {
        return player;
    }

    public PlayerNode getNext() {
        return next;
    }

    // Mutator
    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setNext(PlayerNode next) {
        this.next = next;
    }
}
