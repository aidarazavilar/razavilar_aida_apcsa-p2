
public class Practice {
	
	private int[] array;
	
	public Practice()
	{
	 array = new int[5];
	}
	public Practice(String setX)
	{
		setArray(setX);
	}
	
	public void setArray (String setX)
	{
	    String[] whatever = setX.split(",");
	    array = new int[whatever.length];
	    for (int x=0; x<whatever.length; x++)
	    {
	    	array[x]= Integer.parseInt(whatever[x]);
	    }
		
	}
	
	
	Practice blah = new Practice();
	Scanner keyboard = new Scanner();
	String setX = keyboard.nextLine();
	blah.setArray(setX);
	blah.toString();
	




}

{5,6,7,8}
