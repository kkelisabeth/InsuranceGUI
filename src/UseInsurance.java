import javax.swing.*; 
public class UseInsurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int insurance; 
		String input = JOptionPane.showInputDialog(null, "Enter 1 for Life Insurance or 2 for Health Insurance"); 
		insurance = Integer.parseInt(input);
		
		if(insurance == 1)
			insuranceLife(); 
		else 
			insuranceHealth();
	} 
	
	public static void insuranceLife()
	{
		Life life = new Life("Life Insurance"); 
		life.setCost(500.00);
		life.display(); 
	}
	
	public static void insuranceHealth()
	{
		Health health = new Health("Health Insurance"); 
		health.setCost(100.00);
		health.display(); 
	}

}
