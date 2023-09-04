package CollectionsEx;

import java.util.HashMap;

public class MapEx {

	public static void main(String[] args) 
	{
		HashMap<Integer, String> CountryDetails = new HashMap<Integer, String>();
		CountryDetails.put(004, "Afghanistan");
		CountryDetails.put(248, "Aland Islands");
		CountryDetails.put(016, "American Samoa");
		CountryDetails.put(020, "Andorra");
		
		System.out.println(CountryDetails);
		System.out.println(CountryDetails.get(004));
		System.out.println(CountryDetails.containsKey("005"));
		System.out.println(CountryDetails.containsValue("Andorra"));
		System.out.println(CountryDetails.isEmpty());
		System.out.println(CountryDetails.keySet());
		System.out.println(CountryDetails.values());
		System.out.println(CountryDetails.entrySet());
		
		
	}

}
