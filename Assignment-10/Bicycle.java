// File: Bicycle.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna
public class Bicycle implements CarbonFootprint {

	private static double FOOTPRINT_PER_MILE_AVERAGE = 50;

	private static double GRAM_TO_METRIC_TON_MULTIPLIER = .000001;

	public enum PowerSource {
		AVERAGE_PERSON {
			public String toString() {
				return "Average Person";
			}
		}
	}

	private String id;
	private double miles;
	private Bicycle.PowerSource powerSource;


	public Bicycle(String id, double miles, Bicycle.PowerSource powerSource) {
		setId(id);
		setMiles(miles);
		setPowerSource(powerSource);
	}


	@Override
	public double getCarbonFootprint() {
		double footprint = 0;

		// Convert final footprint to metric tons.
		return footprint * GRAM_TO_METRIC_TON_MULTIPLIER;
	}


	public String getId() {
		return id;
	}

	public double getMiles() {
		return miles;
	}


	public Bicycle.PowerSource getPowerSource() {
		return powerSource;
	}

	public void setId(String id) {
		this.id = id;
	}


	public void setMiles(double miles) {
		this.miles = miles;
	}


	public void setPowerSource(Bicycle.PowerSource powerSource) {
		this.powerSource = powerSource;
	}


	public String toString() {
		CarbonFootprintServices service = new CarbonFootprintServices();
		StringBuilder string = new StringBuilder();
		string.append(getId());
		string.append("\nMiles Traveled: " + service.toCommaNumber(getMiles()));
		//string.append("\nPowered by: " + getPowerSource().toString());
		return string.toString();
	}
}
