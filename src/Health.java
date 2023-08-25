import javax.swing.*;

public class Health extends Insurance{

	Health(String typeX)
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
