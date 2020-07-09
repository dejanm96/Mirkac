package osnove;

public class IfOdluke {
	public IfOdluke() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * Ova funkcija ce samo da ispise broj da li je paran ili neparan
	 * 
	 * modulo ako nisi radio se racuna kao sledece npr 12 % 2 = 0 jer pri dijeljenju nema ostatka
	 * ako je lijevi br manji od desnog npr ako je 2 % 12 onda je to uvijek ovaj lijevi br u ovom slucaju 2
	 * 14 % 6 = 2 npr jer je 14/6 = 2 i ovaj ostatak do 14 je rjesenje
	 * 22 % 7 = 1 jer je 21 / 7 = 3 i ostatak do 22 je 1 sto je rjesenje
	 * 
	 * 
	 * u nastavku su if else
	 * ako u if ispunis uslov radis if zagradu, u slucaju da se ne ispuni ide u else i ispisuje neparan!
	 * @param broj
	 */
	public void brojJeParan(int broj) {
		if(broj % 2 == 0) {//% je modulo, ako je broj primljen modulo 2 == 0 onda ce uraditi sto je u sl zagradi
						   // kada poredis stvari stavis 2 puta jednako, ako predajes vrijednost onda jednom jednako
			System.out.println("PARAN");
		}else System.out.println("NEPARAN");
	}
	
	//Kad je lista u pitanju moramo je preci sa for petljom pa tek onda provjeriti pojedinacni jesu li parni ili neparni
	public void brojJeParanLista(int[] brojevi) {
		for(int i = 0; i < brojevi.length; i++) {
			if(brojevi[i] % 2 == 0) System.out.println("broj " + brojevi[i] + " je pozitivan");
			else System.out.println("broj " + brojevi[i] + " je negativan");
		}
	}
}
