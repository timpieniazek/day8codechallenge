import java.util.ArrayList;
// Jonah Wooten & Tim Pieniazek
// Day 8 Pre-lunch Code Challenge


/*
 * Write a method that accepts an ArrayList of Strings and and int for an index
 * Modify the name in the ArrayList at the index specified to "Merc"
 */
public class ArrayListCodeChallenge {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		ArrayList<LinkedListDemo> lld = new ArrayList<>();
		names.add("Vicky");
		names.add("Brent");
		names.add("Julhasur");
		names.add("Alli");
		names.add("Mike");
		names.add("Anthony");
		names.add("John");
		names.add("Tim");
		names.add("Jonah");
		names.add("Jiao");
		names.add("Ben");
		
		mercReplacer(names, 8);
		
		System.out.println(names);

	}
	
	// your method should go here
	public static ArrayList<String> mercReplacer(ArrayList<String> list, int index) {
		list.set(index, "Merc");
		return list;
	}


}