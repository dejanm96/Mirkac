package vjezba;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		
		double suma = 0;
		int uplata = 0;
		double kusur = 0;
		String hljeb = "Hljeb";
		String pivo = "Pivo";
		String voda = "Voda";
		String meso = "Meso";
		
		double cijenaHljeba = 2.0;
		double cijenaPiva = 2.5;
		double cijenaVode = 1;
		double cijenaMesa = 4.5;
		
		System.out.print("Koliko zelite hljebova? ----> ");
		int brojHljebova = in.nextInt();
		System.out.println();
		
		System.out.print("Koliko zelite piva? ----> ");
		int brojPiva = in.nextInt();
		System.out.println();
		
		System.out.print("Koliko zelite voda? ----> ");
		int brojVode = in.nextInt();
		System.out.println();
		
		System.out.print("Koliko zelite mesa? ----> ");
		int brojMesa = in.nextInt();
		System.out.println();

		
		suma = (brojHljebova * cijenaHljeba) + (brojMesa * cijenaMesa) + (brojVode * cijenaVode) + (brojPiva * cijenaPiva);
		
		System.out.println("--------Vas racun je--------");
		if(brojHljebova > 0) System.out.println(hljeb + " " + brojHljebova + "  x  " + cijenaHljeba + " KM = " + brojHljebova * cijenaHljeba + " KM");
		System.out.println();
		if(brojPiva > 0) System.out.println(pivo + " " + brojPiva + "  x  " + cijenaPiva + " KM = " + brojPiva * cijenaPiva + " KM");
		System.out.println();
		if(brojVode > 0) System.out.println(voda + " " + brojVode + "  x  " + cijenaVode + " KM = " + brojVode * cijenaVode + " KM");
		System.out.println();
		if(brojMesa > 0) System.out.println(meso + " " + brojMesa + "  x  " + cijenaMesa + " KM = " + brojMesa * cijenaMesa + " KM");


		System.out.println("----------------------------");
		System.out.println("             ukupno: " + suma + " KM");
		
		System.out.print("Kojom novcanicom placate ----> ");
		uplata = in.nextInt();
		System.out.println();
		System.out.println("Placanje novcanicom: " + uplata + " KM");

		BigDecimal tacno = new BigDecimal(uplata).subtract(new BigDecimal(suma));
		if(kusur >= 0) System.out.println("              Kusur: " + tacno + " KM");
		else System.err.println("    NOVAC NIJE DOVOLJAN!");
	}

}
