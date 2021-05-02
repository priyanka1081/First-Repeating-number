package HashTables;

import java.util.HashMap;
import java.util.Map;

public class GetFirstDuplicateInt {

	public static void main(String[] args) {
		int[] arr= {2,1,3,3,5,6,5,7,4};
		GetFirstDuplicateInt d= new GetFirstDuplicateInt();
		System.out.println(d.repeatCheck(arr));
	}
	
	public int repeatCheck(int[] arr) {
		int num=0;
		
		Map<Integer, Boolean> mp= new HashMap<Integer, Boolean>();
		
		for(int i=0; i<arr.length; i++) {
			if(!mp.containsKey(arr[i]))
				mp.put(arr[i], true);
			else {
				num=arr[i];
				break;
				}
		}
		
		return num;
	}

}
