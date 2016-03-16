package ParkingLot;

public class ParkingHandler {
	private ParkingLot parking_lot;
	
	public ParkingHandler() {
		parking_lot = new ParkingLot();
	}
	
	public static ParkingHandler parking_request() {
		if (parking_handler == null) {
			parking_handler = new ParkingHandler();
		}
		return parking_handler;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
