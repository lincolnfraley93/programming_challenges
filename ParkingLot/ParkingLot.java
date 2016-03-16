/*
 * Design and implementation of parking lot
 */
package ParkingLot;
import java.util.PriorityQueue;
import java.util.LinkedList;

public class ParkingLot {
	private PriorityQueue parking_lot;
	private LinkedList parked_cars;
	private ParkingHandler parking_handler;
	private int num_of_parking_spots = 50;
	
	public ParkingLot() {
		parking_handler = new ParkingHandler();
		parked_cars = new LinkedList();
		parking_lot = new PriorityQueue();
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
