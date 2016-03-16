package CallCenter;

import java.util.Random;

public abstract class Employee 
{
	//  Priorities are 0, 1, and 2, for respondent, manager, and
	//  director, respectively
	public int PRIORITY;
	
	//  1 indicates an "available" status; 0 indicates a "busy" 
	//  status
	private byte status;
	
	//  Initialize to "available"
	public Employee()
	{
		status = 1;
	}
	
	//  Returns true if the employee was able to take the call, and
	//  then updates its status; otherwise, returns false
	boolean receivedCall()
	{
		if (this.status == 1)
		{
			this.status = 0;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//  Checks if employee is still busy or now available; if 
	//  employee is busy, calls update() method
	void finishedCall()
	{
		if (this.status == 1)
		{
			return;
		}
		else
		{
			this.update();
		}
	}
	
	//  Changes a "busy" employee's status based on random number
	//  generator; returns true if the employee's status is changed
	//  to available
	void update()
	{
		Random rand = null;
		int randomNum = rand.nextInt((10) + 1);
		
		if (randomNum > 5)
		{
			this.status = 1;
		}
		
	}
	
}
