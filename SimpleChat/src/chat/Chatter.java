package chat;


public class Chatter
{
	private String name = null;
	private long loginTime = -1;
	private long enteredInRoomAt = -1;
	
	public Chatter(String name, long loginTime)
	{
		this.name = name;		
		this.loginTime = loginTime;
	}	
	

	public String getName()
	{
		return name;
	}


	/**
	* returns time of user login in milliseconds got using Date.getTime()
	*/
	public long getLoginTime()
	{
		return loginTime;
	}
	
	/**
	* sets time in milliseconds when a user has entered into a particular room.
	* It is used to display only messages sent after a person has entered into a room.
	* @param long milliseconds got using Date.getTime()
	*/

	public void setEnteredInRoomAt( long enteredAt)
	{
		this.enteredInRoomAt = enteredAt;
	}
	/**
	* returns time in milliseconds when a user has entered into a particular room.
	* It is used to display only messages sent after a person has entered into a room.
	* @return long milliseconds got using Date.getTime()
	*/
	public long getEnteredInRoomAt()
	{
		return enteredInRoomAt;
	}

}