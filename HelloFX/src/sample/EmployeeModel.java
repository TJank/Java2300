package sample;
import javafx.beans.property.SimpleStringProperty;

public class EmployeeModel {

    private SimpleStringProperty firstName;
    private SimpleStringProperty lastName;

    public  EmployeeModel(String firstName, String lastName) {
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
    }

    public String getFirstName() {
        return firstName.get();
    }

    public String getLastName() {
        return lastName.get();
    }

}
