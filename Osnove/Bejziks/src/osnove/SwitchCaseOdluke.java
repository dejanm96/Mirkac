package osnove;

import java.util.Scanner;

public class SwitchCaseOdluke {
	public SwitchCaseOdluke() {
		// TODO Auto-generated constructor stub
	}
	Scanner input = new Scanner(System.in);
	IfOdluke func = new IfOdluke();
	int[] listaPrimjer = {2, 1, 33, 24, 123, 3231, 999}; 
	
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
				break;

			case 2:
				int broj = -1;
				System.out.println("Kad bude dost stisni 0");
				while(broj != 0) {
					broj = input.nextInt();
					if(broj != 0)
						func.brojJeParan(broj);
				}
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
