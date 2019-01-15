package duzenli;

public class Parantez {
	
	// !! WARNING DON'T TOUCH

	@SuppressWarnings("unused")
	public String parantez(String dizi[],double donusum){
		
		// String dizi[]={"(","(","2","+","5",")","+","5","(","1",")",")","+","0"};
		YeniHesaplama yh=new YeniHesaplama();
		int dongusayisi=0,asayisi=0,silindi=0,atandi=0;
		String donen=null;
		
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i].equals("(")) {
				dongusayisi++;
			}
		}
		
		// PARANTEZ DÖNGÜSÜ
		for (int l = 0; l < dongusayisi; l++) {
			
			
			
			// PARANTEZ ÝNDÝSÝ BULUCU
			int parantezsayisi=0,iparantez=0,dparantez=0;
			for (int i = 0; i < dizi.length; i++) {
				if (dizi[i].equals("(")) {
					parantezsayisi++;
					iparantez++;
				}else if (dizi[i].equals(")")) {
					parantezsayisi++;
					dparantez++;}}
			
			//SYNTAX ERROR
			if(iparantez!=dparantez){
				return "Syntax Error";
			}
			
			
			int ptzi[]=new int[parantezsayisi];
			int ptzs=0;
			for (int i = 0; i < dizi.length; i++) {
				if (dizi[i].equals("(")||dizi[i].equals(")")) {
					ptzi[ptzs]=i;
					ptzs++;}}
			
			
			// PARANTEZ ÖNCELÝÐÝ
			for (int t = 0; t < ptzi.length; t++) {
				if (dizi[ptzi[t]].equals("(")) {
					if (dizi[ptzi[t+1]].equals(")")) {
						
						
						
						String pislemi[]=new String[ptzi[t+1]-ptzi[t]-1]; // Hesaplanmaya Gönderilecek Ýþlem...
						
						for (int i = 0; i < pislemi.length; i++) {
							pislemi[i]=dizi[ptzi[t]+i+1];
						}
						
						
						// YAZDIR
	/*					for (int i = 0; i < pislemi.length; i++) {
							System.out.println("pislemi["+i+"] = "+pislemi[i]);
						}System.out.println();
	*/					
						
						if (pislemi.length==0) {
							return "Syntax Error";
						}
						
						else if (pislemi.length==1) {
							donen=pislemi[0];
							
						}else if (pislemi.length>0) {
							donen=String.valueOf(yh.islem(pislemi,donusum));
							asayisi++;
						}
						
						
						
						
						
						
						// SÝLÝCÝ
						for (int s = 0; s < ptzi[t+1]-ptzi[t]; s++) {
							for (int i = ptzi[t]+1; i < dizi.length-1; i++) {
								dizi[i]=dizi[i+1];
							}
							silindi++;
						}
						dizi[ptzi[t]]=donen;
						
						
						
						
						
						// "*" ATAMA
						try {
							if (dizi[ptzi[t]-1].equals("+")||dizi[ptzi[t]-1].equals("(")||dizi[ptzi[t]-1].equals(")")||
									dizi[ptzi[t]-1].equals("*")||dizi[ptzi[t]-1].equals("k")||dizi[ptzi[t]-1].equals("^")||
									dizi[ptzi[t]-1].equals("t")||dizi[ptzi[t]-1].equals("s")||dizi[ptzi[t]-1].equals("c")||
									dizi[ptzi[t]-1].equals("at")||dizi[ptzi[t]-1].equals("as")||dizi[ptzi[t]-1].equals("ac")||
									dizi[ptzi[t]-1].equals("ht")||dizi[ptzi[t]-1].equals("hs")||dizi[ptzi[t]-1].equals("hc")||
									dizi[ptzi[t]-1].equals("P")||dizi[ptzi[t]-1].equals("C")||dizi[ptzi[t]-1].equals("l")||
									dizi[ptzi[t]-1].equals("ln")||dizi[ptzi[t]-1].equals("/")||dizi[ptzi[t]-1].equals("-")) {
								
							}else {
								for (int i = dizi.length-2; i >= ptzi[t] ; i--) {
									dizi[i+1]=dizi[i];}
								dizi[ptzi[t]]="*";
								atandi++;
							}
						} catch (ArrayIndexOutOfBoundsException e) {}
					}
				}
			}
		}
		String sonuc=dizi[0];
		return sonuc;
	}
}
