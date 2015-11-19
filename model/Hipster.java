package hipster.model;

/**
 * @author dbar0540
 * @version 0.x Nv 14, 2015
 * 
 */




public class Hipster

{
	private String name;
	private String [] hipsterPhrases;
	
	public Hipster()
	{
		this.name = "";
		this.hipsterPhrases = new String[4];
		setupArray();
		
	}
	
	private void setupArray()
	{
		hipsterPhrases [0] = "that is so mainstream";
		hipsterPhrases [1] = " ok cool ";
		hipsterPhrases [2] = " awesome ";
		hipsterPhrases [3] = " you are diffrent";
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String[] getHipsterPhrases()
	{
		return hipsterPhrases;
	}

	public void setHipsterPhrases(String[] hipsterPhrases)
	{
		this.hipsterPhrases = hipsterPhrases;
	}
}
