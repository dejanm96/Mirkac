package osnove;

import java.util.Scanner;

public class Main {
	//Scanner je klasa od jave koja je za unos sa tastature ovdje smo je inicijalizovali i nazvali in
	private static Scanner in;

	/**
	 * Ovo je main klasa, ona je glavna bez main klase ne mozes nista da radis
	 * a posto je java objektno orjentisana znaci da su sve klase i objekti
	 * za razliku od c++ gdje nije nuzno objektno orjentisana, mozes sve da radis
	 * a da ne moras praviti klase i objekte. Ovdje cu ti proci samo osnovne funkcije
	 * da ti lakse mozda bude shvatiti a objasnim ti jos sve i uzivo na laksi nacin.
	 * @param args
	 */
	
	public static void main(String[] args) {

		/**
		 * za ispis stvari na ekran pri pokretanju koristi se sledeca metoda
		 * 
		 * Samo napises syso i ctrl + space i ono ti samo predlozi tu metodu
		 * samo stisnes enter samo ispise. u Zagradama pod navodnike pises sta hoces da ispises
		 * 
		 */
		System.out.println("Primjer jednog ispisa");
		
		//inicijalizujemo integer varijablu sa brojem 3
		int broj = 3;

		/**
		 * ako hoces kraj ispisa da ispises neki broj, samo stavis + kao u sledecem primjeru
		 * npr napisacemo kod da ispise "vrijednost broja je 3";
		 */
		System.out.println("Vrijednost broja je " + broj);
		
		/**
		 * za unos broja koristi se funkcija scanner
		 * taj unos pamtimo u neku novu varijablu
		 * evo jedan primjer
		 */
		System.out.print("Unesi jedan br: "); //ako napises print umjesto println onda ne prelazi u novi red
		in = new Scanner(System.in);
		int pamtimUnos = in.nextInt();
		System.out.println("Ispisujemo broj koji smo prethodno unijeli::: " + pamtimUnos);
		System.out.println("---------------------------------------------------");
		
		//ovdje kreiram objekte za nove klase - tipa za ForPetlja.java klasu
		//Pomocu petljaFunc cu pozivati funkcije koje se nalaze u toj klasi
		ForPetlja petljaFunc = new ForPetlja();
		WhilePetlja whilePetljaFunc = new WhilePetlja();
		IfOdluke ifFunc = new IfOdluke();
		SwitchCaseOdluke caseFunc = new SwitchCaseOdluke();
		
		
		//U nastavku cu samo pozivati klase koje cu praviti u novom fajlu, da ne natrpavam ovaj fajl previse.
		int[] listaPrimjer = {2, 1, 33, 24, 123, 3231, 999}; 
		petljaFunc.prolazakKrozArray(listaPrimjer);
		petljaFunc.prolazSaRangeBased(listaPrimjer);
		System.out.println("----------------ISPIS WHILE PETLJOM---------------");
		whilePetljaFunc.prolazWhilePetljom(listaPrimjer);
		System.out.println("---------------------------------------------------");
		
		ifFunc.brojJeParan(2);
		ifFunc.brojJeParan(3);
		ifFunc.brojJeParan(128);
		ifFunc.brojJeParan(-5);
		
		System.out.println("---------------------------------------------------");
		
		ifFunc.brojJeParanLista(listaPrimjer);
		
		System.out.println("---------------------------------------------------");
		
		System.out.println("Primjer jednog switch case");
		int key = -1;
		System.out.println("------------Za rad sa switch case upisi 1----------");
		System.out.println("------------Za zavrsetak programa upisi 0----------");
		key = in.nextInt();
		switch (key) {
			case 1:
				caseFunc.radiNesto();
				break;
	
			case 0:
				System.exit(1);
				break;
				
			default:
				System.out.println(" NETACAN UNOS!!! POKUSAJ 1 ILI 0 ");
				break;
		}
	}
}
