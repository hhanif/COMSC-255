// File: CarbonFootprintTest.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;

public class CarbonFootprintTest {


	public static void main(String[] args) {
		TestCarbonFootprintServices service = new TestCarbonFootprintServices();
		ArrayList<CarbonFootprint> footprintItems = new ArrayList<CarbonFootprint>();
		double totalFootprint = 0;


		
		// Create list of different objects that implement the
		// CarbonFootprint interface.
		try {
			footprintItems.add(new Building("Building:", 2, 100, 100, 100, 100,
					100, 100, 0));
			footprintItems.add(new Car("Car:", 10000, 25));
			footprintItems.add(new Bicycle("Bicycle", 1000,
					Bicycle.PowerSource.AVERAGE_PERSON));

			// Loop through all items and print out the information.
			for (CarbonFootprint item : footprintItems) {
				double footprint = item.getCarbonFootprint();
				totalFootprint += footprint;
				System.out.println("\nItem: " + item.toString());

				System.out.println("\tCarbon footprint: "
						+ service.toCommaNumber(service.toFloat(2, footprint))
						+ " Metric Tons of CO2");
			}

			System.out.println("\nTotal carbon footprint for this session: "
					+ service.toFloat(2, totalFootprint)
					+ " Metric Tons of CO2");
		} catch (Exception exception) {
			System.out.println("Error computing the carbon footprint.");
		}
	}
}
