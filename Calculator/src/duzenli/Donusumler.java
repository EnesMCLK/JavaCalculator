package duzenli;

public class Donusumler {
	
	double don;
	
	public double dgr(String dgr){
		
		if (dgr.equalsIgnoreCase("Derece")||dgr.equalsIgnoreCase("D")||dgr.equalsIgnoreCase("Degress")) {
			System.out.println("Your process will be calculated in degrees.");
			System.out.println("-------------------------------------------");
			don = 360;
		}
		
		else if (dgr.equalsIgnoreCase("Grad")||dgr.equalsIgnoreCase("G")||dgr.equalsIgnoreCase("Gradian")) {
			System.out.println("Your process will be calculated in gradian.");
			System.out.println("-------------------------------------------");
			don = 400;
		}
		
		else if (dgr.equalsIgnoreCase("Radyan")||dgr.equalsIgnoreCase("R")||dgr.equalsIgnoreCase("Radian")) {
			System.out.println("Your process will be calculated in radians.");
			System.out.println("-------------------------------------------");
			don = 1;
		}
		
		return don;
	}

}
