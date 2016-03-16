package CallCenter;

import java.util.Random;

public class Respondent extends Employee
{
	final private int PRIORITY = 0;
	private byte status;
	
	public Respondent()
	{
		status = 1;
	}
	
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
	
	boolean finishedCall()
	{
		if (this.status == 1)
		{
			return true;
		}
		else
		{
			return update();
		}
	}
	
	boolean update()
	{
		Random rand = null;
		int randomNum = rand.nextInt((10) + 1);
		
		if (randomNum > 5)
		{
			this.status = 1;
			return true;
		}
		else
		{
			return false;
		}
	}
}
