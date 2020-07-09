package osnove;

import java.util.Scanner;

public class SwitchCaseOdluke {
	//Kao u svakoj klasi osim main - pravimo konstruktor da mozemo pozvati funkcije u main klasi
	public SwitchCaseOdluke() {
		// TODO Auto-generated constructor stub
	}
	//Scanner za unosenje broja
	Scanner input = new Scanner(System.in);
	//da pozovemo funkcije za parne ili neparne brojeve pravimo objekat func
	IfOdluke func = new IfOdluke();
	//Lista brojeva za case 1
	int[] listaPrimjer = {2, 1, 33, 24, 123, 3231, 999}; 
	
	/**
	 * Funkcija koja ce da te pita sta zelis da radis, unosimo broj sa tastature ako je 
	 * uneseni broj br 0 prekida se i vraca se u main. Sve dok br "cin" nije 0 ono ce te pitati
	 * sta zelis da radis. Ako upises br 1 switch ide u case 1 i poziva odgovarajucu funkciju
	 * Ako upises 2. pitace te iznova i iznova da uneses broj te ce ti svaki put ispisati da li
	 * je paran ili neparan. kada upises nulu ono opet pita sta zelis da radis ovdje. ako ponovo 
	 * upises 0 vraca se u main u switch case!
	 * 
	 * default je kada uneses pogresan unos, znaci da nije ni 0 ni 1 ni 2
	 * 
	 * I ovo se moze pokrenuti sa ctrl + space kao i dosta toga to cu ti sve objasniti lako je 
	 */
	public void radiNesto() {
		int cin = -1;
		while(cin != 0) {
			System.out.println(" Hoces da gledas da li je lista parna ili neparna pritisni 1");
			System.out.println(" Hoces da gledas da li je broj paran ili neparan pritisni 2");
			System.out.println(" Hoces da se vratis nazad pritisni 0");
			cin = input.nextInt();
			
			switch (cin) {
			case 1:
				func.brojJeParanLista(listaPrimjer);
				System.out.println("------------------------------");
				break;

			case 2:
				int broj = -1;
				System.out.println("Kad bude dost stisni 0");
				while(broj != 0) {
					broj = input.nextInt();
					if(broj != 0)
						func.brojJeParan(broj);
				}
				System.out.println("DO SLEDECEG VIDJENJA");
				break;

			case 0:
				break;

			default:
				System.out.println("Pogresan unos!");
				break;
			}
		}
	}
}
