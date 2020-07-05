package nizovi;

/**
 * Funkcija koja racuna minimalan element u nizu koji posaljes u "Main.java" klasi
 * @author micic
 *
 */

public class CalculateMin {
	/**
	 * Svaka klasa koja nije main mora imati konstruktor u kojem bi bile vrijednosti 
	 * neke koje ta klasa moze primiti - u nasem slucaju klasa ne prima nista - saljemo u ovoj dole 
	 * funkciji "minNumber" niz tako da nam konstruktor koji pravi objekat ostaje prazan
	 */
	CalculateMin() {}
	
	/**
	 * funkcija koja racuna minimalni elemenat niza tako sto primi listu u mainu koju posaljemo
	 * postavlja "int minNo" na prvu poziciju u nizu, pretpostavimo znaci da je prvi elemenat 
	 * na pocetku minimum
	 * onda for petljom prolazimo taj niz - ovo je ta normalna for petlja
	 * ako je taj minNo veci od sledecih brojeva, samo taj broj sacuvas kao minimalan broj - jednostavno
	 * 
	 * Isto tako je i kod max brojeva da ne pisem dva puta isto
	 * @param list
	 * @return
	 */
	public int minNumber(int[] list) {
		int minNo = list[0];
		for(int i = 0;  i < list.length; i++) {
			if (minNo > list[i])
				minNo = list[i];
		}	
		return minNo;
	}
}
