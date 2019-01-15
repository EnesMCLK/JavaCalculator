package duzenli;


public class Yakalayici {

	// !! WARNING DON'T TOUCH
	
	String s;
	
	@SuppressWarnings("unused")
	public String yakala(String islem,String dgr){
		
		//TANIMLAYICILAR
		s="(";
		s+=islem;
		String aa;
		String gi=s;
		s+=")+0";
		char c1[]=new char[s.length()];
		char c2[]=new char[gi.length()];
		int jj1=0,p=0,y=0,j1=0,u1=0,u2=0,a=0,by=0,
		ay=0,ey=0,iay=0,jj2=0,prn=0,jj4=0,jj3=0,pis=0,pds=0,py=0,pdd=0,ptzs=0,cis=0,eady=0;
		int sem[]=new int[s.length()];
		s.getChars(0, s.length(), c1, 0);
		gi.getChars(0, gi.length(), c2, 0);
		
		double don;
		calistir c = new calistir();
		don=(double) c.dgr(dgr);
				
				
				
				
				
				// ÝNDÝS BULUCU {'+','-','*','/','(',')','^','k','x','f','l','e','n','p','P','C','h','b','u'}
				for (int i = 0; i < s.length(); i++) {	
					if (c1[i]=='+'|c1[i]=='-'|c1[i]=='*'|c1[i]=='/'|c1[i]=='('|c1[i]==')'|c1[i]=='^'
							|c1[i]=='a'|c1[i]=='t'|c1[i]=='c'|c1[i]=='s'|c1[i]=='k'|c1[i]=='x'|c1[i]=='f'|c1[i]=='u'
							|c1[i]=='l'|c1[i]=='e'|c1[i]=='n'|c1[i]=='p'|c1[i]=='P'|c1[i]=='C'|c1[i]=='h'|c1[i]=='b') {
						
						if (sem[jj1]==0) {										// sem[] = Sembollerin Ýndis Deðerlerini Belirten Dizi
							sem[jj1]=i;
							jj1++;
							y=((s.length()-1));									// y = 's' Kelimesindeki Ýndis Sayýsý
						}
						p++;													// p = Döngü Sayýsý = Sembol Sayýsý
					}}
					String s1[]=new String[2*p+1];
					
					
					
					
					
					// AYIRICI
					s1[0]=s.substring(0,sem[0]);
					
					j1=y-sem[p-1];												// j1 = Son Kelimenin Uzunluðu	   sem[p-1] = Son þaretten önceki Ýþaretin Ýndisi
																				// j2 = Son Sembolün Uzunluðu	-> j2=y-sem[p]+1;
					
					
					for (int i = 2; i <=2*p ; i+=2) { try{ 						// RAKAM ARALIÐI
						s1[i]=s.substring(sem[u1]+1, sem[u1+1]);
						u1++;}
					catch (StringIndexOutOfBoundsException e) {
						s1[i]=s.substring(y-j1+1, y+1);}}
					
					
					for (int i = 1; i <=2*p-1; i+=2) { try{			 			//SEMBOL ARALIÐI
						s1[i]=s.substring(sem[u2], sem[u2]+1);
						u2++;}
					catch (StringIndexOutOfBoundsException e) {
						s1[i]=s.substring(y-1, y);}}
					
					
					
					
					
					// SÖZ DÝZÝMÝ HATASI
					if (c2[c2.length-1]==('+')) {
						return "Syntax Error";}
					else if (c2[c2.length-1]==('-')) {
						return "Syntax Error";}
					else if (c2[c2.length-1]==('/')) {
						return "Syntax Error";}
					else if (c2[c2.length-1]==('*')) {
						return "Syntax Error";}
					else if (c2[c2.length-1]==('(')) {
						return "Syntax Error";}
					
					
					
					
					
					// BOÞLUK SÝLÝCÝ v2
					for (int i = 0; i < s1.length; i++) {
							if (s1[s1.length-1].equals("")) {
								if (s1[i].equals("")) {
									by++;											// Boþluk Yakalayýcý -> by
								for (int j = i; j < s1.length-2; j++) {
									s1[j]=s1[j+1];}
								i--;}}
							else {
								if (s1[i].equals("")) {
									by++;											// Boþluk Yakalayýcý -> by
								for (int j = i; j < s1.length-1; j++) {
									s1[j]=s1[j+1];}
								i--;}}}
					
					
					
					
					
					// AKTARICI V1
					String s0[]=new String[s1.length-by];
					for (int i = 0; i < s0.length; i++) {
						s0[i]=s1[i];}
					
					
					
					
					
					// YAKALAYICI
					for (int i = 0; i < s0.length; i++) {
						if (s0[i].equals("-")) {
							if (s0[i+1].equals("-")) {
								s0[i]="+";
								for (int j = i+1; j < s0.length-1; j++) {
									s0[j]=s0[j+1];}
								ey++;										// Eksi Yakalayýcý -> ey
								i--;}
							else if (s0[i+1].equals("+")) {
								for (int j = i+1; j < s0.length-1; j++) {
									s0[j]=s0[j+1];}
								ey++;										// Eksi Yakalayýcý -> ey
								i--;}
							else if (s0[i+1].equals("*")) {
								return "Syntax Error";}
							else if (s0[i+1].equals("/")) {
								return "Syntax Error";}}}
					
					for (int i = 0; i < s0.length; i++) {
						if (s0[i].equals("+")) {
							if (s0[i+1].equals("+")) {
								for (int j = i; j < s0.length-1; j++) {
									s0[j]=s0[j+1];}
								ay++;										// Artý Yakalayýcý -> ay
								i--;}
							else if (s0[i+1].equals("-")) {
									s0[i]="-";
								for (int j = i; j < s0.length-1; j++) {
									s0[j]=s0[j+1];}
								ay++;										// Artý Yakalayýcý -> ay
								i--;}
							else if (s0[i+1].equals("*")) {
								return "Syntax Error";}
							else if (s0[i+1].equals("/")) {
								return "Syntax Error";}}}
					
					for (int i = 0; i < s0.length; i++) {
						if (s0[0].equals("+")) {
							for (int j = i; j < s0.length-1; j++) {
								s0[j]=s0[j+1];}
							iay++;											// Ýlk Artý Yakalayýcý -> iay
							i--;}}
					
					
					
					
					
					// "at","ac","as","xk","xf","xb","hs","hc","ht" DEÐERÝNÝ BÝRLEÞTÝRME
					for (int i = 0; i < s0.length-2; i++) {
						if (s0[i].equals("a")) {
							if (s0[i+1].equals("t")) {
								s0[i]=s0[i]+s0[i+1];
								
								for (int j = i+1; j < s0.length-1; j++) {
									s0[j]=s0[j+1];}
								eady++;
							}
							
							else if (s0[i+1].equals("c")) {
								s0[i]=s0[i]+s0[i+1];
								
								for (int j = i+1; j < s0.length-1; j++) {
									s0[j]=s0[j+1];}
								eady++;
							}
							
							else if (s0[i+1].equals("s")) {
								s0[i]=s0[i]+s0[i+1];
								
								for (int j = i+1; j < s0.length-1; j++) {
									s0[j]=s0[j+1];}
								eady++;
							}
						}
						else if (s0[i].equals("x")) {
							if (s0[i+1].equals("k")) {
								s0[i]=s0[i]+s0[i+1];
								
								for (int j = i+1; j < s0.length-1; j++) {
									s0[j]=s0[j+1];}
								eady++;
							}
							
							else if (s0[i+1].equals("f")) {
								s0[i]=s0[i]+s0[i+1];
								
								for (int j = i+1; j < s0.length-1; j++) {
									s0[j]=s0[j+1];}
								eady++;
							}
							
							else if (s0[i+1].equals("b")) {
								s0[i]=s0[i]+s0[i+1];
								
								for (int j = i+1; j < s0.length-1; j++) {
									s0[j]=s0[j+1];}
								eady++;
							}
							
							else if (s0[i+1].equals("u")) {
								s0[i]=s0[i]+s0[i+1];
								
								for (int j = i+1; j < s0.length-1; j++) {
									s0[j]=s0[j+1];}
								eady++;
							}
						}
						else if (s0[i].equals("l")) {
							if (s0[i+1].equals("n")) {
								s0[i]=s0[i]+s0[i+1];
								
								for (int j = i+1; j < s0.length-1; j++) {
									s0[j]=s0[j+1];}
								eady++;
							}
						}
						else if (s0[i].equals("h")) {
							if (s0[i+1].equals("s")) {
								s0[i]=s0[i]+s0[i+1];
								
								for (int j = i+1; j < s0.length-1; j++) {
									s0[j]=s0[j+1];}
								eady++;
							}
							else if (s0[i+1].equals("c")) {
								s0[i]=s0[i]+s0[i+1];
								
								for (int j = i+1; j < s0.length-1; j++) {
									s0[j]=s0[j+1];}
								eady++;
							}
							else if (s0[i+1].equals("t")) {
								s0[i]=s0[i]+s0[i+1];
								
								for (int j = i+1; j < s0.length-1; j++) {
									s0[j]=s0[j+1];}
								eady++;
							}
						}
					}
					
					
					
					
					
					// 'e','p' DEÐERÝNÝ TANIMLAMA
					for (int i = 0; i < s0.length-2; i++) {
						if (s0[i].equals("e")) {
							s0[i]=String.valueOf(Math.E);
						}
						
						else if (s0[i].equals("p")) {
							s0[i]=String.valueOf(Math.PI);
						}
					}
					
					
					
					
					
					// "+" DEÐERÝNÝ BÝRLEÞTÝRME
					for (int i = 0; i < s0.length-2; i++) {
						if (s0[i].equals("*")||s0[i].equals("/")||s0[i].equals("^")||s0[i].equals("k")
								||s0[i].equals("t")||s0[i].equals("at")||s0[i].equals("s")||s0[i].equals("as")
								||s0[i].equals("c")||s0[i].equals("ac")||s0[i].equals("l")||s0[i].equals("ln")
								||s0[i].equals("P")||s0[i].equals("C")||s0[i].equals("hs")||s0[i].equals("hc")
								||s0[i].equals("ht")) {
							if (s0[i+1].equals("+")) {
								s0[i+1]=s0[i+1]+s0[i+2];
								
								for (int j = i+2; j < s0.length-1; j++) {
									s0[j]=s0[j+1];}
								eady++;
							}}}
					
					
					
					
					
					// "-" DEÐERÝNÝ BÝRLEÞTÝRME
					for (int i = 0; i < s0.length-2; i++) {
						if (s0[i].equals("*")||s0[i].equals("/")||s0[i].equals("+")||s0[i].equals("k")
								||s0[i].equals("^")||s0[i].equals("t")||s0[i].equals("at")||s0[i].equals("s")
								||s0[i].equals("as")||s0[i].equals("c")||s0[i].equals("ac")||s0[i].equals("hs")
								||s0[i].equals("hc")||s0[i].equals("ht")) {
							if (s0[i+1].equals("-")) {
								s0[i+1]=s0[i+1]+s0[i+2];
								
								for (int j = i+2; j < s0.length-1; j++) {
									s0[j]=s0[j+1];}
								eady++;
							}}}
					
					
					
					
					
					// AKTARICI V2
					String s2[]=new String[s0.length-ay-ey-iay-eady];
					for (int i = 0; i < s2.length; i++) {
						s2[i]=s0[i];}
					
					
					
					
					
					// SEMBOL SAYI BULUCU
					int smbsy=0;
					for (int i = 1; i < s2.length; i++) {
						if ((s2[i].equals("t")||s2[i].equals("c")||s2[i].equals("s")||s2[i].equals("at")
								||s2[i].equals("ac")||s2[i].equals("as")||s2[i].equals("ht")||s2[i].equals("hc")
								||s2[i].equals("hs")||s2[i].equals("e")||s2[i].equals("p")||s2[i].equals("l")||s2[i].equals("ln")
								||s2[i].equals("k")||s2[i].equals("at")||s2[i].equals("ac")||s2[i].equals("as")||s2[i].equals("k"))) {
								
							if (s2[i-1].equals("+")||s2[i-1].equals("-")||s2[i-1].equals("*")||s2[i-1].equals("/")||s2[i-1].equals("(")
									||s2[i-1].equals("^")||s2[i-1].equals("P")||s2[i-1].equals("C"));
							else smbsy++;
						}}		 
					
					
					
					
					
					// '*' ATAMA	--> 't','c','s','ht','hc','hs','l','ln','k'
					String sy[]=new String[s2.length+smbsy];
					for (int j = 0; j < s2.length; j++) {
						sy[j]=s2[j];}
					
					for (int i = 1; i < sy.length-smbsy; i++) {
						if (sy[i].equals("t")||sy[i].equals("c")||sy[i].equals("s")||sy[i].equals("ht")||sy[i].equals("hc")||
								sy[i].equals("hs")||sy[i].equals("l")||sy[i].equals("ln")||sy[i].equals("k")||sy[i].equals("at")||
								sy[i].equals("as")||sy[i].equals("ac")||sy[i].equals("e")|sy[i].equals("p")){
							
							if (sy[i-1].equals("+")||sy[i-1].equals("-")||sy[i-1].equals("*")||sy[i-1].equals("/")||
									sy[i-1].equals("t")||sy[i-1].equals("(")||sy[i-1].equals("c")||sy[i-1].equals("s")||
									sy[i-1].equals("ht")||sy[i-1].equals("hc")||sy[i-1].equals("hs")||sy[i-1].equals("l")||
									sy[i-1].equals("ln")||sy[i-1].equals("k")||sy[i-1].equals("at")||sy[i-1].equals("as")||sy[i-1].equals("ac")||
									sy[i-1].equals("^")||sy[i-1].equals("C")||sy[i-1].equals("P")) {
							}
							else {
								for (int j = sy.length-smbsy; j>i; j--) {
									sy[j]=sy[j-1];}
								sy[i]="*";
								i++;
								smbsy--;
							}
						}}
					
					
					
					
					
					// AKTARICI V3
					String s3[]=new String[sy.length-smbsy];
					for (int i = 0; i < s3.length; i++) {
							s3[i]=sy[i];}
					
					
					
					/*
					// "*" ATAYICI
					for (int i = 0; i < s3.length; i++) {
						if (s3[i].equals("k")||s3[i].equals("t")||s3[i].equals("c")||s3[i].equals("s")
								||s3[i].equals("ac")||s3[i].equals("at")||s3[i].equals("as")||s3[i].equals("hs")
								||s3[i].equals("ht")||s3[i].equals("hc")||s3[i].equals("l")||s3[i].equals("ln")) {
							
							if (s3[i-1].equals("k")||s3[i-1].equals("(")||s3[i-1].equals("t")||s3[i-1].equals("c")
									||s3[i-1].equals("s")||s3[i-1].equals("at")||s3[i-1].equals("ac")||s3[i-1].equals("as")
									||s3[i-1].equals("ht")||s3[i-1].equals("hc")||s3[i-1].equals("hs")||s3[i-1].equals("l")
									||s3[i-1].equals("ln")) {}
							else {	
								for (int j = s3.length-1; j > i; j--) {
									s3[j]=s3[j-1];}
								s3[i]="*";
								i++;}}}
					
					*/
					
					
					
					// ÜS DEN SONRA PARANTEZ AÇICI
					int us=0;
					for (int i = 0; i < s3.length; i++) {
						if (s3[i].equals("^")) {
							us++;}}
					String s4[]=new String[s3.length+(2*us)];
					for (int i = 0; i < s3.length; i++) {
						s4[i]=s3[i];}
					for (int i = 0; i < s4.length; i++) {
						if (s4[i].equals("^")) {
							for (int j = s4.length-1; j > i; j--) {
								s4[j]=s4[j-1];}
							s4[i+1]="(";
							s4[s4.length-1]="0";
							s4[s4.length-2]="+";
							s4[s4.length-3]=")";
							s4[s4.length-4]=")";
						}
					}
					
					
					
					
					// DIÞ PARANTEZ SONRASI HATA KONTROLCÜSÜ
					for (int i = 0; i < s4.length; i++) {
						if (s4[i].equals(")")||s4[i].equals("xb")||s4[i].equals("xf")||s4[i].equals("xk")||
								s4[i].equals("xu")) {
							int aaaa;
							try {
								aaaa=Integer.valueOf(s4[i+1]);}
							catch (NumberFormatException e) {
								break;}
							if (s4[i+1].equals(String.valueOf(aaaa))) {
								return "Syntax Error";
							}
						}}
					
					
					
					
					
/*					// YAZDIR
					for (int i = 0; i < s4.length; i++) {
						System.out.println("["+i+"] = "+s4[i]);}System.out.println();*/
					
					Parantez pin=new Parantez();
					String sonuc =pin.parantez(s4,don);
		return sonuc;
	}
}
