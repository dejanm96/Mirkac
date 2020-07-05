package nizovi;

public class BubbleSort {

	public BubbleSort() {}

	private int cnt = 0;
	/**
	 * U sustini je isto kao normal sort samo ovdje poredimo po 2 broja jedan do drugog, pa onda tako iteriras kroz listu
	 * @param doubleList
	 */
	public void sortList(double[] doubleList) {  
		double temp = 0;  
		for(int i=0; i <doubleList.length; i++){  
			for(int j=1; j < (doubleList.length-i); j++){ 
				if(doubleList[j-1] > doubleList[j]){  
					cnt++;
					//swap elements  
					temp = doubleList[j-1];  
					doubleList[j-1] = doubleList[j];  
					doubleList[j] = temp;  
				}
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
