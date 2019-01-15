package duzenli;

public class YeniHesaplama {

	
	public void topla(String dizi[],int isaretindisi){
		
		double s01,s02,donen;
		s01=Double.valueOf(dizi[isaretindisi-1]);
		s02=Double.valueOf(dizi[isaretindisi+1]);
		donen=(s01)+(s02);
		
		dizi[isaretindisi-1]=String.valueOf(donen);
	}

	public void cikar(String dizi[],int isaretindisi){
		
		double s01,s02,donen;
		s01=Double.valueOf(dizi[isaretindisi-1]);
		s02=Double.valueOf(dizi[isaretindisi+1]);
		donen=(s01)-(s02);
		
		dizi[isaretindisi-1]=String.valueOf(donen);
	}
	
	public void carp(String dizi[],int isaretindisi){
		
		double s01,s02,donen;
		s01=Double.valueOf(dizi[isaretindisi-1]);
		s02=Double.valueOf(dizi[isaretindisi+1]);
		donen=(s01)*(s02);
		
		dizi[isaretindisi-1]=String.valueOf(donen);
	}
	
	public void bol(String dizi[],int isaretindisi){
		
		double s01,s02,donen;
		s01=Double.valueOf(dizi[isaretindisi-1]);
		s02=Double.valueOf(dizi[isaretindisi+1]);
		donen=(s01)/(s02);
		
		dizi[isaretindisi-1]=String.valueOf(donen);		// ISARET ORTADA veya SONDAYSA (-1)
	}
	
	public void kok(String dizi[],int isaretindisi){
		double s02,donen;
		s02=Double.valueOf(dizi[isaretindisi+1]);
		donen=Math.sqrt(s02);
		
		dizi[isaretindisi]=String.valueOf(donen);		// ISARET ONDEYSE (0)
	}
	
	public void xkup(String dizi[],int isaretindisi){
		double s01,donen;
		s01=Double.valueOf(dizi[isaretindisi-1]);
		donen=Math.pow(s01, 3);
		
		dizi[isaretindisi-1]=String.valueOf(donen);
	}
	
	public void xkare(String dizi[],int isaretindisi){
		double s01,donen;
		s01=Double.valueOf(dizi[isaretindisi-1]);
		donen=Math.pow(s01, 2);
		
		dizi[isaretindisi-1]=String.valueOf(donen);
	}
	
	public void xeksib(String dizi[],int isaretindisi){
		double s01,donen;
		s01=Double.valueOf(dizi[isaretindisi-1]);
		donen=Math.pow(s01, (-1));
		
		dizi[isaretindisi-1]=String.valueOf(donen);
	}
	
	public void xfak(String dizi[],int isaretindisi){
		double s01,donen;
		int faktoriyel = 1;
		s01=Double.valueOf(dizi[isaretindisi-1]);
		
		for (int j = (int) s01; j>0; j--) {
			faktoriyel*=j;}
		donen=faktoriyel;
		
		dizi[isaretindisi-1]=String.valueOf(donen);
	}
	
	public void us(String dizi[],int isaretindisi){
		
		double s01,s02,donen;
		s01=Double.valueOf(dizi[isaretindisi-1]);
		s02=Double.valueOf(dizi[isaretindisi+1]);
		donen=Math.pow((s01), (s02));
		
		dizi[isaretindisi-1]=String.valueOf(donen);
	}
	
	public void tan(String dizi[],int isaretindisi,double donusum){
		
		double s02,donen=0;
		s02=Double.valueOf(dizi[isaretindisi+1]);
		
		if (donusum==360||donusum==400) {
			donen=Math.tan((s02/donusum)*(2*Math.PI));}
		else if (donusum==1) {
			donen=Math.tan(s02);}
		
		dizi[isaretindisi]=String.valueOf(donen);
	}
	
	public void sin(String dizi[],int isaretindisi,double donusum){
		
		double s02,donen=0;
		s02=Double.valueOf(dizi[isaretindisi+1]);
		
		if (donusum==360||donusum==400) {
			donen=Math.sin((s02/donusum)*(2*Math.PI));}
		else if (donusum==1) {
			donen=Math.sin(s02);}
		
		dizi[isaretindisi]=String.valueOf(donen);
	}

	public void cos(String dizi[],int isaretindisi,double donusum){
		
		double s02,donen=0;
		s02=Double.valueOf(dizi[isaretindisi+1]);
		
		if (donusum==360||donusum==400) {
			donen=Math.cos((s02/donusum)*(2*Math.PI));}
		else if (donusum==1) {
			donen=Math.cos(s02);}
		
		dizi[isaretindisi]=String.valueOf(donen);
	}
	
	public void atan(String dizi[],int isaretindisi,double donusum){
		
		double s02,donen=0;
		s02=Double.valueOf(dizi[isaretindisi+1]);
		
		if (donusum==360||donusum==400) {
			donen=Math.atan(s02)*(donusum)/(2*Math.PI);}
		else if (donusum==1) {
			donen=Math.atan(s02);}
		
		dizi[isaretindisi]=String.valueOf(donen);
	}

	public void asin(String dizi[],int isaretindisi,double donusum){
		
		double s02,donen=0;
		s02=Double.valueOf(dizi[isaretindisi+1]);
		
		if (donusum==360||donusum==400) {
			donen=Math.asin(s02)*(donusum)/(2*Math.PI);}
		else if (donusum==1) {
			donen=Math.asin(s02);}
		
		dizi[isaretindisi]=String.valueOf(donen);
	}

	public void acos(String dizi[],int isaretindisi,double donusum){
		
		double s02,donen=0;
		s02=Double.valueOf(dizi[isaretindisi+1]);
		
		if (donusum==360||donusum==400) {
			donen=Math.acos(s02)*(donusum)/(2*Math.PI);}
		else if (donusum==1) {
			donen=Math.acos(s02);}
		
		dizi[isaretindisi]=String.valueOf(donen);
	}

	public void hsin(String dizi[],int isaretindisi,double donusum){
		
		double s02,donen=0;
		s02=Double.valueOf(dizi[isaretindisi+1]);
		
		donen=(Math.pow(Math.E, s02)-Math.pow(Math.E, (-(s02))))/2;
		
		dizi[isaretindisi]=String.valueOf(donen);
	}
	
	public void hcos(String dizi[],int isaretindisi,double donusum){
		
		double s02,donen=0;
		s02=Double.valueOf(dizi[isaretindisi+1]);
		
		donen=(Math.pow(Math.E, s02)+Math.pow(Math.E, (-(s02))))/2;
		
		dizi[isaretindisi]=String.valueOf(donen);
	}
	
	public void htan(String dizi[],int isaretindisi,double donusum){
		
		double s02,donen=0;
		s02=Double.valueOf(dizi[isaretindisi+1]);
		
		donen=((Math.pow(Math.E, s02)-Math.pow(Math.E, (-(s02))))/
				(Math.pow(Math.E, s02)+Math.pow(Math.E, (-(s02)))));
		
		dizi[isaretindisi]=String.valueOf(donen);
	}

	public void log(String dizi[],int isaretindisi){
		double s02,donen;
		s02=Double.valueOf(dizi[isaretindisi+1]);
		
		donen=Math.log10(s02);
		
		dizi[isaretindisi]=String.valueOf(donen);
	}
	
	public void loge(String dizi[],int isaretindisi){
		double s02,donen;
		s02=Double.valueOf(dizi[isaretindisi+1]);
		
		donen=Math.log(s02);
		
		dizi[isaretindisi]=String.valueOf(donen);
	}

	public void per(String dizi[],int isaretindisi){
		double s01,s02,donen;
		int nf=1,nrf=1;
		s01=Float.valueOf(dizi[isaretindisi-1]);
		s02=Float.valueOf(dizi[isaretindisi+1]);
		
		for (int j = 1; j <= s01 && j>0; j++) {
			nf*=j;}
		for (int j = 1; j <= (s01-s02) && j>0; j++) {
			nrf*=j;}
		
		donen=(nf)/(nrf);
		
		dizi[isaretindisi-1]=String.valueOf(donen);
	}
	
	public void com(String dizi[],int isaretindisi){
		double s01,s02,donen;
		int nf=1,rf=1,nrf=1;
		s01=Float.valueOf(dizi[isaretindisi-1]);
		s02=Float.valueOf(dizi[isaretindisi+1]);
		
		for (int j = 1; j <= s01 && j>0; j++) {
			nf*=j;}
		for (int j = 1; j <= s02 && j>0; j++) {
			rf*=j;}
		for (int j = 1; j <= (s01-s02) && j>0; j++) {
			nrf*=j;}
		
		donen=(nf)/(nrf*rf);
		
		dizi[isaretindisi-1]=String.valueOf(donen);
	}

	public void silici(String dizi[],String isaretkonumu,int isaretindisi,int isleminuzunlugu){
		
		int dongusayisi=isleminuzunlugu-1;
		int ik = 0;
		if (isaretkonumu.equals("On")) {
			ik=1;
		}else if (isaretkonumu.equals("orta")) {
			ik=2;
		}else if (isaretkonumu.equals("arka")) {
			ik=2;}
		
		for (int d = dongusayisi; d > 0; d--) {
			
			//SÝLÝCÝ
			for (int s = (isaretindisi+2-ik); s <= dizi.length-2; s++) {
				dizi[s]=dizi[s+1];
			}
		}
	}

	
	public Double islem(String dizi[],double donusum) {
		
		YeniHesaplama yh=new YeniHesaplama();
		double sonuc;
		
		
		// ISLEM SIRASI KÖK
		for (int i = dizi.length-1; i >= 0; i--) {
			if (dizi[i].equals("k")) {
				yh.kok(dizi, i);
				yh.silici(dizi, "On", i, 2);
			}
		}
		
		
		
		
		// ISLEM SIRASI X
		int xs=0;
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i].equals("xb")||dizi[i].equals("xf")||dizi[i].equals("xu")||dizi[i].equals("xk")) {xs++;}}
		
		for (int k = 0; k < xs; k++) {
			for (int i = 0; i < dizi.length;i++) {
				if (dizi[i].equals("xb")) {
					yh.xeksib(dizi, i);
					yh.silici(dizi, "arka", i, 2);
					break;
				}else if (dizi[i].equals("xf")) {
					yh.xfak(dizi, i);
					yh.silici(dizi, "arka", i, 2);
					break;
				}else if (dizi[i].equals("xu")) {
					yh.xkup(dizi, i);
					yh.silici(dizi, "arka", i, 2);
					break;
				}else if (dizi[i].equals("xk")) {
					yh.xkare(dizi, i);
					yh.silici(dizi, "arka", i, 2);
					break;
				}
			}
		}
		
		
		
		
		// ISLEM SIRASI ÜS
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i].equals("^")) {
				yh.us(dizi, i);
				yh.silici(dizi, "orta", i, 3);
				i=0;
			}
		}
		
		
		
		
		// TRI HYP LOG nPr nCr
		// ISLEM SIRASI TRIGONOMETRI
		for (int i = dizi.length-1; i >= 0; i--) {
			if (dizi[i].equals("t")) {
				yh.tan(dizi, i, donusum);
				yh.silici(dizi, "On", i, 2);
			}else if (dizi[i].equals("s")) {
				yh.sin(dizi, i, donusum);
				yh.silici(dizi, "On", i, 2);
			}else if (dizi[i].equals("c")) {
				yh.cos(dizi, i, donusum);
				yh.silici(dizi, "On", i, 2);
			}else if (dizi[i].equals("at")) {
				yh.atan(dizi, i, donusum);
				yh.silici(dizi, "On", i, 2);
			}else if (dizi[i].equals("as")) {
				yh.asin(dizi, i, donusum);
				yh.silici(dizi, "On", i, 2);
			}else if (dizi[i].equals("ac")) {
				yh.acos(dizi, i, donusum);
				yh.silici(dizi, "On", i, 2);
			}else if (dizi[i].equals("ht")) {
				yh.htan(dizi, i, donusum);
				yh.silici(dizi, "On", i, 2);
			}else if (dizi[i].equals("hs")) {
				yh.hsin(dizi, i, donusum);
				yh.silici(dizi, "On", i, 2);
			}else if (dizi[i].equals("hc")) {
				yh.hcos(dizi, i, donusum);
				yh.silici(dizi, "On", i, 2);}
		}
		
		
		
		
		// ISLEM SIRASI LOGARITMA
		for (int i = dizi.length-1; i >= 0; i--) {
			if (dizi[i].equals("l")) {
				yh.log(dizi, i);
				yh.silici(dizi, "On", i, 2);
			}else if (dizi[i].equals("ln")) {
				yh.loge(dizi, i);
				yh.silici(dizi, "On", i, 2);}
		}
		
		
		
		
		// ISLEM SIRASI PER, COM
		for (int i = dizi.length-1; i >= 0; i--) {
			if (dizi[i].equals("P")) {
				yh.per(dizi, i);
				yh.silici(dizi, "orta", i, 3);
			}else if (dizi[i].equals("C")) {
				yh.com(dizi, i);
				yh.silici(dizi, "orta", i, 3);
			}
		}

		
		
		
		// ISLEM SIRASI ÇARPMA, BÖLME
		for (int i = dizi.length-1; i >= 0; i--) {
			if (dizi[i].equals("*")) {
				yh.carp(dizi, i);
				yh.silici(dizi, "orta", i, 3);
			}else if (dizi[i].equals("/")) {
				yh.bol(dizi, i);
				yh.silici(dizi, "orta", i, 3);
			}
		}
		
		
		
		// ISLEM SIRASI TOPLAMA,ÇIKARMA
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i].equals("+")) {
				yh.topla(dizi, i);
				yh.silici(dizi, "orta", i, 3);
				i=0;
			} else if (dizi[i].equals("-")) {
				yh.cikar(dizi, i);
				yh.silici(dizi, "orta", i, 3);
				i=0;
			} 
		}
		
		sonuc=Double.valueOf(dizi[0]);
		
		
		return sonuc;
		

	}

}
