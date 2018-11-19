import java.text.NumberFormat;

public class TipCalc_Model {

    public static String getTip(double bill, double percent) {
        double tip = bill * percent / 100;
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        return nf.format(tip);
    }


}
