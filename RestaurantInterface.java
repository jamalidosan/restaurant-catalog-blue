import java.util.List;

// --== CS400 File Header Information ==--
// Author: Jaan Ots
// Notes: Interface for the Movie object for Porject two

public interface RestaurantInterface extends Comparable<RestaurantInterface> {
	
	public String getRestaurantName();
	public Integer getNumSales();
	public String getCity();
	public String getState();
	public Integer numMealsServed();
	
	// from super interface Comparable
	public int compareTo(RestaurantInterface otherRestaurant);


}
