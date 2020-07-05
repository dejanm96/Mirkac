package nizovi;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		/**
		 * Uvijek kada pravis neku klasu posebnu koje ce ti izvrsavat
		 * nesto onda moras prvo da kreiras njen objekat pomocu konstruktora
		 * kao u ova sledeca 4 slucaja
		 * 1. Ime klase npr CalculateMax
		 * 2. das joj neko ime npr maxFunc (imena funkcija i imena varijabli se pisu pocetno malo svako sledece veliko 
		 * primjerJednogImenaKlase
		 * 3. pozivas konstruktor te klase "new CalculateMax()"
		 */
		
		CalculateMax maxFunc = new CalculateMax(); 
		CalculateMin minFunc = new CalculateMin();
		NormalSort sortFunc = new NormalSort();
		BubbleSort bubbleSortFunc = new BubbleSort();
		
		/**
		 * ovdje pravimo array listu od "int" ( cijeli brojevi ), od "double" ( brojevi sa zarezom koje mozes
		 * ako je zarez nula napisati ili 4.0 ili samo 4.
		 * 
		 * "[]" ovo znaci da je array
		 * u zagradi naravno dodajes vrijednosti 
		 */
		int[] list =  {2, 3, 12, 1, 0, -1, 100, 120};
		double[] doubleList = {2.1, 3.5, 12.8, 99.2, -12.3, 4.3, -1213., 1000.};
		
		
		/**
		 * ArrayList je funkcija od Jave tu u ovim <> stavis koje ce vrijednosti biti da li double int ili cak
		 * neki objekti nekih klasa, mogu i stringovi sto je text.
		 * 
		 * U ArrayList se dodaje komandom "add" pozivas je preko objekta ArrayList-e u donjem primjeru
		 *  "arrayList.add(vrijednost)"
		 */
		ArrayList<Double> arrayList = new ArrayList<>();
		arrayList.add(4.5);
		arrayList.add(5.5);
		arrayList.add(12.3);
		arrayList.add(123.6);
		arrayList.add(-0.12);
		
		/**
		 * Ovo je funkcija za ispis na ekran
		 * array lista sama ispisuje dok kod array liste moras prolaziti "for" petljom pojedine elemente te liste
		 * pri ispisu, ako ne prodjes for petljom ispise ti samo adresu na kojoj je sacuvan taj array
		 */
		System.out.println("---------------------------");
		System.out.println("Primjer ArrayList - liste sa double vrijednostima");
		System.out.println(arrayList);

		/**
		 * for(double a : doubleList) se zove range based for loop, ona nikada ne moze izaci izvan granica niza
		 * ako izadje baca gresku da je izaslo izvan granice (to je kod normalne for petlje) zato je ova brza i bolja
		 * u normalnim slucajevima ako ne moras nista provjeravati u pojedinim elementima
		 */
		System.out.println("---------------------------");
		System.out.println("Primjer array liste sa double vrijednostima: ");
		for(double a : doubleList)
			System.out.print(" " + a);
		
		System.out.println();
		System.out.println("---------------------------");
		int maxNumber = maxFunc.maxNumber(list);
		int minNumber = minFunc.minNumber(list);
		
		System.out.println("Maksimalni element niza je: " + maxNumber);
		System.out.println("Minimalni element niza je: " + minNumber);
		
		System.out.println("Niz prije sortiranja:");
		for(int a: list)
			System.out.print(a + " ");
		System.out.println("");
		
		sortFunc.sortList(list);
		
		System.out.println("Niz nakon sortiranja i nakon " + sortFunc.getCnt() + " poredjenja glasi :");
		for(int a: list)
			System.out.print(a + " ");
		
		System.out.println();
		System.out.println("---------------------------");
		
		System.out.println("Niz prije bubble sortiranja:");
		for(double a: doubleList)
			System.out.print(a + " ");
		System.out.println("");
		
		bubbleSortFunc.sortList(doubleList);
		
		System.out.println("Niz nakon bubble sortiranja i nakon " + bubbleSortFunc.getCnt() + " poredjenja glasi: ");
		for(double a: doubleList)
			System.out.print(a + " ");
		
	}

}
