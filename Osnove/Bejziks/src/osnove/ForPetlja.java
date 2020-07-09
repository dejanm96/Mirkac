package osnove;

public class ForPetlja {
	public ForPetlja() {/*za skracen nacin pisanja cu ti live objasniti*/	}
		//Metoda void ne vraca nikakvu vrijednost
	public void prolazakKrozArray(int[] prijemListe){
		System.out.println("------------------tradicionalna for petlja ------------------");
		//prvi nacin for petlje "tradicionalni nacin"
		//3 dijela, inicijalizujes varijablu npr int i, drugi dio uslov, treci inkrementovanje(povecavanje)
		//Ici ce od vrijednosti 0 sve dok ne dodje do velicine ovog array koji cemo morati proci
		for(int i = 0; i < prijemListe.length; i++) {
			System.out.println(" broj na " + i + " mjestu je: " + prijemListe[i]);
		}
	}
	public void prolazSaRangeBased(int[] prijemListe) {
		System.out.println("------------------rangeBased for petlja ------------------");	
		for(int i : prijemListe)
			System.out.println(i);
	}
}
