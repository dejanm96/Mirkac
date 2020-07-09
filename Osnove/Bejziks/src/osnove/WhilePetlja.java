package osnove;

public class WhilePetlja {
	public WhilePetlja() {	} //svaka klasa mora imati ovakav konstruktor msm naravno ime klase mora biti ime konstruktora

	public void prolazWhilePetljom(int[] lista) {
		int i = 0;
		while(i < lista.length) {
			System.out.println(lista[i]);
			i++;
		}
	}
}
