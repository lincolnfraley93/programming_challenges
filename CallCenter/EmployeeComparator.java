package CallCenter;
import java.util.Comparator;

/**
 * Used to sort priority queues in the CallCenter class by 
 * implementing a comparator to sort based on employee priority
 * 
 * @author Lincoln Fraley
 * January 12, 2016
 */

public class EmployeeComparator implements Comparator<Employee>
{
	@Override
	public int compare(Employee e1, Employee e2)
	{
		if (e1.PRIORITY < e2.PRIORITY)
		{
			return 1;
		}
		
		if (e1.PRIORITY == e2.PRIORITY)
		{
			return 0;
		}
		else
		{
			return -1;
		}
	}
}
