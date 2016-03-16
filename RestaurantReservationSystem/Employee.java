package RestaurantReservationSystem;

public class Employee {
	private String Id = null;
	private String name;
	private String ssn;
	
	public Employee(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	public String get_name() {
		return this.name;
	}
	
	public String get_ssn() {
		return this.ssn;
	}
	
	public String get_ID() {
		if (this.Id == null) {
			return null;
		} else {
			return this.Id;
		}
	}
	
	public void set_ID(String Id) {
		if (this.Id != null) {
			
		} else {
			this.Id = Id;
		}
	}
}
