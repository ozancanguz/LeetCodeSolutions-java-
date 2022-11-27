package DataStructures;
import java.util.ArrayList;
import java.util.LinkedList;

public class Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList<String> cities=new LinkedList<String>();
		cities.addLast("paris");
		cities.addLast("roma");
		cities.addLast("dublin");
		
		for(String city:cities) {
			System.out.println(city);
		}
		
		System.out.println("------------------");
		
		ArrayList<String> names=new ArrayList<String>();
		names.add("ozan");
		names.add("þule");
		names.add("bero");
		
	       
		 for(String name:names) {
			 System.out.println(name);
		 }
	}

}
