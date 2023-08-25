public abstract class Insurance {

	protected String type; 
	protected double cost; 
	Insurance(String Ih)
	{
		type = Ih; 
	}
	String getType()
	{
		return type;
	}
	double getCost()
	{
		return cost; 
	}
	
	abstract void setCost(double ct); 
	abstract void display();
}
