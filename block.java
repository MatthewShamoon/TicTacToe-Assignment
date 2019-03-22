//Matthew Shamoon

public class block implements global
{
	int state;
	
	
	public block()
	{
		state = 0;
	}
	
	public block(int state)
	{
		this();
		setState(state);
	}
	
	/**
	 * checks if state is valid
	 * @param state
	 * @return
	 */
	public boolean isValidState (int state)
	{

		if(state == 0 || state == 1 || state ==2)
		{
			return true; 
		}
		else
			return false;
	}
	
	/**
	 * sets state
	 * @param state
	 */
	public void setState(int state)
	{
		if(isValidState(state))
		{
		this.state = state;
		}
	}
	
	/**
	 * gets state
	 * @return
	 */
	public int getState()
	{
		return this.state;
	}
	
	/**
	 * overrided toString
	 */
	public String toString()
	{
		if(state == 1)
		{
			return "x";
		}
		else if (state == 2)
		{
			return "o";
		}
		
		else
		{
			return " ";
		}
	}
	
}
