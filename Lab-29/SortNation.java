// File: SortNation.java
// Name: Haris Hanif
// DVC ID: 1392603
// IDE:  Eclipse Luna

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;


class Nation {
	 private String name;
	    private int gdp;
	    private int population;
	    private int ppp;
	    
	    public Nation(String name, int gdp, int population) {
	        this.name = name;
	        this.gdp = gdp;
	        this.population = population;
	        this.ppp = 1000*gdp/population;
	    }

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getGdp() {
			return gdp;
		}

		public void setGdp(int gdp) {
			this.gdp = gdp;
		}

		public int getPopulation() {
			return population;
		}

		public void setPopulation(int population) {
			this.population = population;
		}

		public int getPpp() {
			return ppp;
		}

		public void setPpp(int ppp) {
			this.ppp = ppp;
		}

		@Override
		public String toString() {
			return "Nation [name=" + name + ", gdp=" + gdp + ", population="
					+ population + ", ppp=" + ppp + "]";
		}

		//define comparators for sort()
		public static class CompName implements  Comparator<Nation>{
			@Override
			public int compare(Nation c1, Nation c2) {
				return (c1.name.compareToIgnoreCase(c2.name));
			}
		}
		public static class CompGdp implements  Comparator<Nation>{
			@Override
			public int compare(Nation c1, Nation c2) {
				return (c1.gdp > c2.gdp ? -1 : (c1.gdp == c2.gdp ? 0 : 1));
			}
		}
		public static class CompPopulation implements  Comparator<Nation>{
			@Override
			public int compare(Nation c1, Nation c2) {
				return (c1.population > c2.population ? -1 : (c1.population == c2.population ? 0 : 1));
			}
		}
		public static class CompPpp implements  Comparator<Nation>{
			@Override
			public int compare(Nation c1, Nation c2) {
				return (c1.ppp > c2.ppp ? -1 : (c1.ppp == c2.ppp ? 0 : 1));
			}
		}

		
}

public class SortNation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Nation> nation = new ArrayList<Nation>();
        nation.add(new Nation("Afghanistan", 21706, 26557));
        nation.add(new Nation("Greece",238023,10993));
        nation.add(new Nation("Bahamas", 9020, 368));
        nation.add(new Nation("France", 2238023, 36338));
        
        
    	Collections.sort(nation, new Nation.CompName());
    	System.out.println("------By Name------");
    	for(Nation c : nation) {
    		System.out.println(c.toString());
    	}
		
    	Collections.sort(nation, new Nation.CompGdp());
    	System.out.println("------By GDP------");
    	for(Nation c : nation) {
    		System.out.println(c.toString());
    	}
    	Collections.sort(nation, Collections.reverseOrder(new Nation.CompGdp()));
    	System.out.println("------By Reverse GDP------");
    	for(Nation c : nation) {
    		System.out.println(c.toString());
    	}
    	Collections.sort(nation, new Nation.CompPopulation());
    	System.out.println("------By Population------");
    	for(Nation c : nation) {
    		System.out.println(c.toString());
    	}
    	Collections.sort(nation, Collections.reverseOrder(new Nation.CompPopulation()));
    	System.out.println("------By Reverse Population------");
    	for(Nation c : nation) {
    		System.out.println(c.toString());
    	}
    	Collections.sort(nation, new Nation.CompPpp());
    	System.out.println("------By PPP------");
    	for(Nation c : nation) {
    		System.out.println(c.toString());
    	}
    	Collections.sort(nation, Collections.reverseOrder(new Nation.CompPpp()));
    	System.out.println("------By Reverse PPP------");
    	for(Nation c : nation) {
    		System.out.println(c.toString());
    	}

	}

}
