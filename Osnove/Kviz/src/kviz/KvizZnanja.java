package kviz;

import java.util.Scanner;

public class KvizZnanja {
	static int brojTacnihOdgovora = 0;
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		int brojPokusaja = 0;
		System.out.println("Dobrodosao u kviz znanja!");
		int i = -1;
		while(i != 0) {
			System.out.println("Koja komanda je za ispis teksta na ekran uz prelazak u novi red?");
			System.out.println("1. System.out.println();");
			System.out.println("2. System.out.print();");
			System.out.println("3. System.println();");
			i = input.nextInt();
			if(brojPokusaja > 0 ) System.out.println("broj pokusaja je : " + brojPokusaja);
			if(brojPokusaja >= 2) { System.out.println("DOSTIGNUT JE MAX BROJ POKUSAJA");
			pitanjeDva();
			}else
			switch (i) {
				case 1:
					System.out.println("TACAN ODGOVOR!");
					brojTacnihOdgovora++;
					i = 0;
					pitanjeDva();
					break;
				case 2: 
					System.out.println("Pokusaj ponovo");
					brojPokusaja++;
					break;
				case 3: 
					System.out.println("Pokusaj ponovo");
					brojPokusaja++;
					break;
				default:
					System.out.println("pogresan unos");
					break;
			}
		}
	}
	public static void pitanjeDva() {
		int i = -1;
		int brojPokusaja = 1;
		while(i != 0) {
			System.out.println("Koja komanda je za ispis teksta na ekran bez prelaska u novi red?");
			System.out.println("1. System.out.println();");
			System.out.println("2. System.out.print();");
			System.out.println("3. System.println();");
			i = input.nextInt();
			if(brojPokusaja > 0 ) System.out.println("broj pokusaja je : " + brojPokusaja);
			if(brojPokusaja >= 2) { System.out.println("DOSTIGNUT JE MAX BROJ POKUSAJA");
			pitanjeTri();
			}else
			switch (i) {
			case 1:
				System.out.println("Pokusaj ponovo");
				brojPokusaja++;
				break;
			case 2: 
				System.out.println("TACAN ODGOVOR!");
				brojTacnihOdgovora++;
				i = 0;
				pitanjeTri();
				break;
			case 3: 
				System.out.println("Pokusaj ponovo");
				brojPokusaja++;
				break;
			default:
				System.out.println("pogresan unos");
				break;
			}
		}
	}
	private static void pitanjeTri() {
		int i = -1;
		int brojPokusaja = 1;
		while(i != 0) {
			System.out.println("izaberi tacan odgovor:");
			System.out.println("1. int i = 2; double d = 2.5; int[] array = {2,3,4,2}; ");
			System.out.println("2. int i = {2,3,4,1,4}; double d = 2; int[] array = {2.4,2.1,5.2};");
			System.out.println("3. int i = 2.3; double d = 2.3; int[] array = {2,3,1,2,2};");
			i = input.nextInt();
			if(brojPokusaja > 0 ) System.out.println("broj pokusaja je : " + brojPokusaja);
			if(brojPokusaja >= 2) { System.out.println("DOSTIGNUT JE MAX BROJ POKUSAJA");
			pitanjeCetiri();
			}else
			switch (i) {
			case 1:
				System.out.println("TACAN ODGOVOR!");
				brojTacnihOdgovora++;
				i = 0;
				pitanjeCetiri();
				break;
			case 2: 
				System.out.println("Pokusaj ponovo");
				brojPokusaja++;
				break;
			case 3: 
				System.out.println("Pokusaj ponovo");
				brojPokusaja++;
				break;
			default:
				System.out.println("pogresan unos");
				break;
			}
		}
	}
	private static void pitanjeCetiri() {
		int i = -1;
		int brojPokusaja = 1;
		while(i != 0) {
			System.out.println("Kojom deklaracijom se nekom programu prikljucuju raspolozive klase Java platforme?");
			System.out.println("1. import");
			System.out.println("2. export");
			System.out.println("3. package");
			System.out.println("4. module");	
			i = input.nextInt();
			if(brojPokusaja > 0 ) System.out.println("broj pokusaja je : " + brojPokusaja);
			if(brojPokusaja >= 2) { System.out.println("DOSTIGNUT JE MAX BROJ POKUSAJA");
			pitanjePet();
			}else
			switch (i) {
			case 1:
				System.out.println("TACAN ODGOVOR!");
				brojTacnihOdgovora++;
				pitanjePet();
				i = 0;
				break;
			case 2: 
				System.out.println("Pokusaj ponovo");
				brojPokusaja++;
				break;
			case 3: 
				System.out.println("Pokusaj ponovo");
				brojPokusaja++;
				break;
			case 4: 
				System.out.println("Pokusaj ponovo");
				brojPokusaja++;
				break;
			default:
				System.out.println("pogresan unos");
				break;
			}
		}
	}
	private static void pitanjePet() {
		int i = -1;
		while(i != 0) {
			System.out.println("Koji dio se ispunjava u sledecem if-statementu?"+
								"boolean yes = true; if(yes) System.out.println('Tacno'); else System.out.println('Netacno');");
			System.out.println("1. tacno");
			System.out.println("2. netacno");	
			i = input.nextInt();
			switch (i) {
			case 1:
				System.out.println("TACAN ODGOVOR!");
				brojTacnihOdgovora++;
				pitanjeSest();
				i = 0;
				break;
			case 2: 
				System.out.println("Pokusaj ponovo");
				break;
			default:
				System.out.println("pogresan unos");
				break;
			}
		}
	}
	
	private static void pitanjeSest() {
		int i = -1;
		while(i != 0) {
			System.out.println("sta od sledeceg nije komentar?");
			System.out.println("1. //komentar");
			System.out.println("2. /*komentar*/");
			System.out.println("3. /**\r\n" + 
					"	 * komentar\r\n" + 
					"	 */");	
			System.out.println("4. komentar//");
			i = input.nextInt();
			switch (i) {
			case 1:
				System.out.println("Pokusaj ponovo");
				break;
			case 2: 
				System.out.println("Pokusaj ponovo");
				break;
			case 3:
				System.out.println("Pokusaj ponovo");
				break;
			case 4:
				System.out.println("TACAN ODGOVOR!");
				brojTacnihOdgovora++;
				pitanjeSedam();
				i = 0;
				break;
			default:
				System.out.println("pogresan unos");
				break;
			}
		}
	}
	private static void pitanjeSedam() {
		int i = -1;
		int brojPokusaja = 1;
		while(i != 0) {
			System.out.println("Koji oblik nije ispravno napisana boolean varijabla?");
			System.out.println("1. boolean tacno = true;");
			System.out.println("2. boolean pogresno = false;");
			System.out.println("3. boolean tacno = 1");	
			i = input.nextInt();
			if(brojPokusaja > 0 ) System.out.println("broj pokusaja je : " + brojPokusaja);
			if(brojPokusaja >= 2) { System.out.println("DOSTIGNUT JE MAX BROJ POKUSAJA - BROJ TACNIH ODG JE: " + brojTacnihOdgovora);
			System.exit(0);
			}else
			switch (i) {
			case 1:
				System.out.println("Pokusaj ponovo");
				brojPokusaja++;
				break;
			case 2: 
				System.out.println("Pokusaj ponovo");
				brojPokusaja++;
				break;
			case 3: 
				System.out.println("TACAN ODGOVOR!");
				brojTacnihOdgovora++;
				System.out.println("broj tacnih odgovora: " + brojTacnihOdgovora + " od ukupno 7");
				if(brojTacnihOdgovora == 0 || brojTacnihOdgovora == 1 || brojTacnihOdgovora == 2 ) System.out.println("PONOVI GRADIVO PA PROBAJ OPET !!");
				else
				if(brojTacnihOdgovora == 3 || brojTacnihOdgovora == 4) System.out.println("Nije lose, nije lose!");
				else
				if(brojTacnihOdgovora == 5 || brojTacnihOdgovora == 6) System.out.println("SVAKA CAST, MOZEMO NASTAVIT SA UCENJEM!");
				else
				if(brojTacnihOdgovora == 7) System.out.println("PREKUCAO SI !");
				i = 0;
				break;
			default:
				System.out.println("pogresan unos");
				break;
			}
		}
	}
}
		
