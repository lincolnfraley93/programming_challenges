package CallCenter;

public class Call 
{
	//  Enumerated type for call statuses
	public enum Status 
	{
		SATISFIED,
		UNSATISFIED,
		UNSENT,
		PENDING,
		RECEIVED
	}
	Status status;
	
	//  Call center associated with call
	CallCenter center;
	
	//  Set status to UNSENT
	public Call()
	{
		status = Status.UNSENT;
	}
	
	//  Sends call to center and updates status of call
	void sendCall(CallCenter center)
	{
		this.center = center;
		
		//  Sends call if its status is UNSENT
		if (status == Status.UNSENT)
		{
			boolean result = center.call(this);
			if (result == true)
			{
				status = Status.RECEIVED;
			}
			else
			{
				status = status.PENDING;
			}
		}
	}
	
	
	
	
}
