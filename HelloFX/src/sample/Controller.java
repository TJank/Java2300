package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML private TableView<EmployeeModel> employeeTable;
    @FXML private TableColumn<EmployeeModel, String> firstNameColumn;
    @FXML private TableColumn<EmployeeModel, String> lastNameColumn;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        firstNameColumn.setCellValueFactory(new PropertyValueFactory<EmployeeModel, String>("firstName"));
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<EmployeeModel, String>("lastName"));

        employeeTable.setItems(getData());
    }

    public ObservableList<EmployeeModel> getData() {
        ObservableList<EmployeeModel> employees = FXCollections.observableArrayList();

        employees.add(new EmployeeModel("Curious","George"));
        employees.add(new EmployeeModel("Kenji","Kawai"));
        employees.add(new EmployeeModel("Mia","Hamm"));
        employees.add(new EmployeeModel("Roberto","Baggio"));

        return employees;
    }




}
