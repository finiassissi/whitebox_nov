package maptest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class TwoDimeToHashMap {
	public void testHashMap() {
		String[][] login= {{"user1","pwd1"},
						{"user2","pwd2"},
						{"user3","pwd3"}};
		
				
		HashMap<String,String> mp=new HashMap<String, String>(login.length);
		
		for(String[] maping:login) {
			mp.put(maping[0], maping[1]);
		}
		for(Entry <String,String> e:mp.entrySet() ) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}
	/*List<List<String>> arrayList2D = new ArrayList<>(array2D.length);

for (String[] record : array2D) {
    arrayList2D.add(Arrays.asList(record));
}*/
	
	public void twoDToArrayList() {
		String[][] arr1= {{"user1","pwd1"},
				{"user2","pwd2"},
				{"user3","pwd3"}};
		
		List<List<String>> arrayList2D = new ArrayList<>(arr1.length);
		
		for (String[] record : arr1) {
		    arrayList2D.add(Arrays.asList(record));
		}
		System.out.println(arrayList2D);
	}
	
	
	public void test3() {
		Map<Integer,ArrayList<String>> cp=new HashMap<Integer,ArrayList<String>>();
		cp.put(1, new ArrayList<String>(Arrays.asList(new String[] {"user1","pwd",}))) ;	
		cp.put(2, new ArrayList<String>(Arrays.asList(new String[] {"user2","pwd2"}))) ;	

		for(Entry <Integer,ArrayList<String>> e:cp.entrySet() ) {
			System.out.println(e.getKey()+" "+e.getValue());

		}
	}
	
	
	public void testarraylistandmap() {
		
		 //private ArrayList<String> symbolsPresent = new ArrayList<String>(Arrays.asList(new String[] {"One","Two","Three","Four"}));

		Map<String,ArrayList<String>> mp=new HashMap<String,ArrayList<String>>();
		mp.put("tayota", new ArrayList<String>(Arrays.asList(new String[] {"corola","cami",}))) ;	
		mp.put("Honda", new ArrayList<String>(Arrays.asList(new String[] {"Accord","Civic","CR-V"}))) ;	

		for(Entry <String,ArrayList<String>> e:mp.entrySet() ) {
			System.out.println(e.getKey()+" "+e.getValue());

		}
	}

	public static void main(String[] args) {
		TwoDimeToHashMap obj=new TwoDimeToHashMap();
		obj.testHashMap();
		obj.testarraylistandmap();
		obj.twoDToArrayList();
		obj.test3();
	}

}
