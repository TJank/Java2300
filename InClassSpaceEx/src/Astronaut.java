public class Astronaut {

    private String name;
    private String country;
    private int age;

    public Astronaut(String name, String country, int age) {
        this.name = name;
        this.country = country;

        if(age<=0) {
            System.err.println("Age 0 or less detected.");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "{ name= '" + name + '\'' +
                ", country= '" + country + '\'' +
                ", age= " + age +
                " }";
    }
}
