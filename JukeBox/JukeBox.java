/**
 * Question 7.3, Cracking the Coding Interview
 * Design a musical jukebox.
 * 
 * Lincoln Fraley
 * January 13, 2016
 */
package JukeBox;

public class JukeBox 
{
	//  Enumerated type to represent if jukebox is playing or not
	public enum State 
	{
		PLAYING,
		PAUSED,
		NOT_PLAYING
	}
	State state;
	
	boolean hasRecord;
	Record 	record;
	int 	volume;
	
	public JukeBox()
	{
		state 		= State.NOT_PLAYING;
		hasRecord 	= false;
	}
	
	void addRecord(Record record)
	{
		this.record = record;
		hasRecord	= true;
	}
	
	//  Returns the current record if the jukebox has one, returns
	//  null otherwise
	Record removeRecord()
	{
		if (hasRecord)
		{
			//  Update state and hasRecord, return the record
			state 		= State.NOT_PLAYING;
			hasRecord 	= false;
			Record r 	= this.record;
			this.record = null;
			return r;
		}
		else
		{
			return null;
		}
	}
	
	void playRecord()
	{
		if (hasRecord && state != State.PLAYING)
		{
			state = State.PLAYING;
		}
	}
	
	void pauseRecord()
	{
		if (hasRecord && state == State.PLAYING)
		{
			state = State.PAUSED;
		}
	}
	
	//  Set record volume to between 1 and 10; if argument less than
	//  1, set to 1, if over 10, set to 10
	void adjustVolume(int n)
	{
		if (n < 1)
		{
			volume = 1;
		}
		if (n > 10)
		{
			volume = 10;
		}
		else
		{
			volume = n;
		}
	}
	
	Record currentRecord()
	{
		if (hasRecord)
		{
			return record;
		}
		else
		{
			return null;
		}
	}
}









