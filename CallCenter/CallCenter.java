package CallCenter;
/**
 * Question 7.2, Cracking the Coding Interview
 * Design a call center with three levels of employees: respondent,
 * manager, and director. Incoming calls are sent to the first free
 * respondent, otherwise the first free manager, and finally the 
 * director. 
 * @author Lincoln Fraley
 *
 */
import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Iterator;

public class CallCenter 
{
	//  Priority queue for available and busy queue
	PriorityQueue<Employee> available;
	PriorityQueue<Employee> busy;
	
	//  Comparator used to sort queues based on employee's priority
	Comparator<Employee> comparator = new EmployeeComparator();
	
	int initialSize;
	
	public CallCenter(int employees, int managers, int directors)
	{
		initialSize = employees + managers + directors;
		
		//  Initialize both queues
		available = new PriorityQueue<Employee>(initialSize, comparator);
		busy = new PriorityQueue<Employee>(comparator);
	}
	
	boolean call(Call call)
	{
		
	}
	
	boolean receiveCall()
	{
		Employee e;
		
		if (!available.isEmpty())
		{
			return dispatchCall();
		}
		else
		{
			if (!busy.isEmpty())
			{
				Iterator<Employee> iterator = busy.iterator();
				while(iterator.hasNext())
				{
					e = iterator.next();
					e.finishedCall();
				}
			}
			return false;
			
		}
	}
	
	boolean dispatchCall()
	{
		
	}
}













