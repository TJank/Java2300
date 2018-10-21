

public class Passenger {
    private String name;
    private String classStatus;

    public Passenger(String name, String classStatus) {
        this.name = name;
        this.classStatus = classStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassStatus() {
        return classStatus;
    }

    public void setClassStatus(String classStatus) {
        this.classStatus = classStatus;
    }

    @Override
    public String toString() {
        return "name=' " + name + '\'' + "\t" +
                "classStatus= " + classStatus;
    }
}
