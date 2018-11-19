import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;

public class TipCalc_Controller {

    @FXML private TextField billAmt;
    @FXML private TextField tipPerc;
    @FXML private Button multiply;
    @FXML private Label tipAmt;

    @FXML private void calculate(ActionEvent event) {
        try {
            double bill = Double.parseDouble(billAmt.getText());
            double percent = Double.parseDouble(tipPerc.getText());

            if(event.getSource() == multiply) {
                tipAmt.setText(TipCalc_Model.getTip(bill, percent));
            }
        }
        catch (NumberFormatException nfe) {
            billAmt.setText("");
            tipPerc.setText("");
            tipAmt.setText("Enter valid numbers");

        }
    }

}
