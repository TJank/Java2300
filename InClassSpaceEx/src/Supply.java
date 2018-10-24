public class Supply {

    private String item;
    private double weight;

    public Supply(String item, double weight) {
        this.item = item;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "{ " +
                "item = '" + item + '\'' +
                ", weight = " + weight +
                " }";
    }
}
