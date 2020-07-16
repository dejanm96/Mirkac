package kviz;

import java.util.Scanner;

public class KvizZnanja {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		int cnt = 1;
		System.out.println("Dobrodosao u kviz znanja!");
		int i = -1;
		while(i != 0) {
			System.out.println("Koja komanda je za ispis teksta na ekran uz prelazak u novi red?");
			System.out.println("1. System.out.println();");
			System.out.println("2. System.out.print();");
			System.out.println("3. System.println();");
			i = input.nextInt();
			System.out.println("broj pokusaja je : " + cnt);
			if(cnt > 2) { System.out.println("DOSTIGNUT JE MAX BROJ POKUSAJA");
			pitanjeDva();
			}else
			switch (i) {
				case 1:
					System.out.println("Tacan odg");
					i = 0;
					pitanjeDva();
					break;
				case 2: 
					System.out.println("Pokusaj ponovo");
					cnt++;
					break;
				case 3: 
					System.out.println("Pokusaj ponovo");
					cnt++;
					break;
				default:
					System.out.println("pogresan unos");
					break;
			}
		}
	}
	public static void pitanjeDva() {
		int i = -1;
		while(i != 0) {
			System.out.println("Koja komanda je za ispis teksta na ekran bez prelaska u novi red?");
			System.out.println("1. System.out.println();");
			System.out.println("2. System.out.print();");
			System.out.println("3. System.println();");
			i = input.nextInt();
			
			switch (i) {
			case 1:
				System.out.println("Pokusaj ponovo");
				break;
			case 2: 
				System.out.println("Tacan odg!");
				i = 0;
				pitanjeTri();
				break;
			case 3: 
				System.out.println("Pokusaj ponovo");
				break;
			default:
				System.out.println("pogresan unos");
				break;
			}
		}
	}
	private static void pitanjeTri() {
		int i = -1;
		while(i != 0) {
			System.out.println("izaberi tacan odgovor:");
			System.out.println("1. int i = 2; double d = 2.5; int[] array = {2,3,4,2}; ");
			System.out.println("2. int i = {2,3,4,1,4}; double d = 2; int[] array = {2.4,2.1,5.2};");
			System.out.println("3. int i = 2.3; double d = 2.3; int[] array = {2,3,1,2,2};");
			i = input.nextInt();
			
			switch (i) {
			case 1:
				System.out.println("Tacan odg!");
				i = 0;
				break;
			case 2: 
				System.out.println("Pokusaj ponovo");
				break;
			case 3: 
				System.out.println("Pokusaj ponovo");
				break;
			default:
				System.out.println("pogresan unos");
				break;
			}
		}
	}
}
		
