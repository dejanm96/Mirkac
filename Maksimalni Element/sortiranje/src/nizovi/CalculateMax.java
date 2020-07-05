package nizovi;

public class CalculateMax {
	CalculateMax() {}
	
	public int maxNumber(int[] list) {
		int maxNo = list[0];
		for(int i = 0;  i < list.length; i++) {
			if (maxNo < list[i])
				maxNo = list[i];
		}	
		return maxNo;
	}
}
