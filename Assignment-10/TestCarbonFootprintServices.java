// File: TestCarbonFootprintServices.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public final class TestCarbonFootprintServices {

	public double toFloat(int digits, double number) {
		StringBuilder format = new StringBuilder();

		format.append("#.");
		for (int i = 1; i <= digits; i++) {
			format.append("#");
		}

		DecimalFormat df = new DecimalFormat(format.toString());
		return Double.valueOf(df.format(number)).doubleValue();
	}


	public String toCommaNumber(double number) {
		DecimalFormatSymbols dfs = new DecimalFormatSymbols();
		dfs.setGroupingSeparator(',');
		DecimalFormat df = new DecimalFormat();
		df.setDecimalFormatSymbols(dfs);
		return df.format(number);
	}
	

}
