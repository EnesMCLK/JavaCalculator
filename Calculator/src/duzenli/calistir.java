package duzenli;

import java.util.Scanner;

public class calistir{
	
	public double dgr(String sa)
	{
		double don;
		Donusumler d = new Donusumler();
		don=d.dgr(sa);
		
		return don;
	}
	

	
	public static void main (String args[]){
		
		
		String sonuc;
		
		
		Scanner ss=new Scanner(System.in);
		System.out.println("Lütfen Ýþlem Giriniz... | Please Enter Math Process...");
		String s=ss.nextLine();
		s = s.replaceAll("\\s", "");
		s = s.trim();
		
		
			
		Yakalayici calistir = new Yakalayici();
		
		
/* 		   "d","Derece","Degress"
		   "g","Grad" , "Gradian"
		   "r","Radyan","Radians"|
		  						 |
		  						 |
		                         v           */
		sonuc=calistir.yakala(s,"d");
		
		System.out.println(sonuc);
}
}
