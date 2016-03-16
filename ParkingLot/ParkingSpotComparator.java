package ParkingLot;
import java.util.Comparator;

public class ParkingSpotComparator implements Comparator<ParkingSpot>{
	public int compare (ParkingSpot spot1, ParkingSpot spot2) {
		return (spot1.getNumber < spot2.getNumber) ? spot1.getNumber : spot2.getNumber;
	}
}
