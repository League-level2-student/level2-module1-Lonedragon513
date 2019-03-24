package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> stuff = new ArrayList<String>();
		//2. Add five Strings to your list
		stuff.add("a");
		stuff.add("b");
		stuff.add("c");
		stuff.add("d");
		stuff.add("e");
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i < stuff.size(); i++){
			String s = stuff.get(i);
			System.out.println(s);
		}
		System.out.println("\n");
		//4. Print all the Strings using a for-each loop
		for(String s : stuff){
			System.out.println(s);
		}
		System.out.println("\n");
		//5. Print only the even numbered elements in the list.
		for(int i = 1; i < stuff.size(); i =i+2){
			String s = stuff.get(i);
			System.out.println(s);
		}
		System.out.println("\n");
		//6. Print all the Strings in reverse order.
		for(int i = stuff.size()-1; i > -1; i--){
			String s = stuff.get(i);
			System.out.println(s);
		}
		System.out.println("\n");
		//7. Print only the Strings that have the letter 'e' in them.
	}
}
