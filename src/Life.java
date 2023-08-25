import javax.swing.*; 
public class Life extends Insurance{

	Life(String typeX)
	{
		super(typeX); 
	}
	
	void setCost(double num)
	{
		cost = num; 
	}
	
	void display()
	{
		JOptionPane.showMessageDialog(null, " " + type + " insurance cost $" + cost + " per month");
	}
}
