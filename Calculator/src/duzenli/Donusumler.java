package duzenli;

public class Donusumler {
	
	double don;
	
	public double dgr(String dgr){
		
		if (dgr.equalsIgnoreCase("Derece")||dgr.equalsIgnoreCase("D")) {
			System.out.println("��leminiz Derece cinsinden hesaplan�cakt�r.");
			System.out.println("-------------------------------------------");
			don = 360;
		}
		
		else if (dgr.equalsIgnoreCase("Grad")||dgr.equalsIgnoreCase("G")) {
			System.out.println("��leminiz Grad cinsinden hesaplan�cakt�r.");
			System.out.println("-------------------------------------------");
			don = 400;
		}
		
		else if (dgr.equalsIgnoreCase("Radyan")||dgr.equalsIgnoreCase("R")) {
			System.out.println("��leminiz Radyan cinsinden hesaplan�cakt�r.");
			System.out.println("-------------------------------------------");
			don = 1;
		}
		
		return don;
	}

}
