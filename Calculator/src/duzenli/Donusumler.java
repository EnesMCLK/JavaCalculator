package duzenli;

public class Donusumler {
	
	double don;
	
	public double dgr(String dgr){
		
		if (dgr.equalsIgnoreCase("Derece")||dgr.equalsIgnoreCase("D")) {
			System.out.println("Ýþleminiz Derece cinsinden hesaplanýcaktýr.");
			System.out.println("-------------------------------------------");
			don = 360;
		}
		
		else if (dgr.equalsIgnoreCase("Grad")||dgr.equalsIgnoreCase("G")) {
			System.out.println("Ýþleminiz Grad cinsinden hesaplanýcaktýr.");
			System.out.println("-------------------------------------------");
			don = 400;
		}
		
		else if (dgr.equalsIgnoreCase("Radyan")||dgr.equalsIgnoreCase("R")) {
			System.out.println("Ýþleminiz Radyan cinsinden hesaplanýcaktýr.");
			System.out.println("-------------------------------------------");
			don = 1;
		}
		
		return don;
	}

}
