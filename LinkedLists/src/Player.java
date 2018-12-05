public class Player {

    private int id;
    private String name;
    private String game;

    public Player(int id, String name, String game) {
        setId(id);
        setName(name);
        setGame(game);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    // toString
    @Override
    public String toString() {
        return ("id: " + id + "\tname: " + name + "\tgame: " + game);
    }


}
