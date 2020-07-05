package nizovi;

public class NormalSort {


	NormalSort() {}
	
	private int cnt = 0;
	/**
	 * Kod normalnog sortiranja bukvalno poredimo svaki broj sa svakim pa ako je vece promijenis
	 * ovaj tmp te ne treba buniti jer ne mijenjamo odamh nego taj koji ce se zamijeniti moramo 
	 * negdje zapamtiti da se ne izgubi i pamtimo ga onda u tmp
	 * 
	 * fakticki ovako 
	 * a=1
	 * b=2
	 * 
	 * kada stavis a = b 
	 * dobijemo da je a = 2 i b = 2
	 * 
	 * zato cemo prvo a sacuvati u tmp
	 * zamijeniti a i b  i onda staviti da je b jednak tom tmp
	 * @param list
	 */
	public void sortList(int[] list) {
		int tmp = 0;	
		for(int i = 0; i < list.length; i++) {
			for(int j = i + 1; j <list.length - 1; j++)
				if(list[i] > list[j]) {
					cnt++;
					tmp = list[i];
					list[i] = list[j];
		            list[j] = tmp;
				}
		}
	}
	
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

}
