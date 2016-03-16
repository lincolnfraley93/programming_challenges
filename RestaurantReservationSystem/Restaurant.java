package RestaurantReservationSystem;
import java.util.Hashtable;;

public class Restaurant {
	private Hashtable employees;
	private ReservationSystem reservation_system;
	
	public Restaurant() {
		employees = new Hashtable();
		reservation_system = new ReservationSystem();
	}
	
	public void add_employee(Employee employee) {
		if (employee == null) {
			System.out.println("Employee does not exist.");
		} else if (employees.contains(employee.get_ID())) {
			System.out.println("Already contains employee.");
		} else {
			employee.set_ID(employee.get_ssn());
			employees.put(employee.get_ID(), employee.get_name());
		}
	}
	
	public void remove_employee(Employee employee) {
		if (employee == null) {
			System.out.println("Employee does not exist.");
		} else if (!employees.contains(employee.get_ID())) {
			System.out.println("This person not employed.");
		} else {
			employees.remove(employee.get_ID());
			employee.set_ID(null);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
