package codsoft_pkg;

import java.util.*;
import java.util.HashMap;


public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Vector<String> arr = new Vector<String>();
		HashMap<String, Integer> map = new HashMap<>();
		String text = new String();
		String word = new String();
		int i = 0;
		
		System.out.println("\n**\n");
		System.out.println("\t------WORD GAME------");
		System.out.println("\n**\n");
		
		System.out.println("Enter a text: ");
		text = sc.nextLine();
		
		
		
		if(text.length() == 0) {
			System.out.println("\n**\n");
			System.out.println("String not defined...");
			System.out.println("\n**\n");
			return;
		}
		
		
		
		while(i < text.length()) {
			
			if(text.charAt(i) != ' '  &&  text.charAt(i) != '!'  &&  text.charAt(i) != '.'  
					&&  text.charAt(i) != '?'  &&  text.charAt(i) != '"') {
				word += text.charAt(i);
			}
			
			if(text.charAt(i) == ' ') {
				arr.add(word);
				
				if(map.containsKey(word)) { 
					map.put(word, map.get(word) + 1); 
				} 
				else { 
					map.put(word, 1); 
				}
				
				word = "";
			}
			
			i++;
		}
		
		
		if(map.containsKey(word)) { 
			map.put(word, map.get(word) + 1); 
		} 
		else { 
			map.put(word, 1); 
		}
		
		arr.add(word);
		
		
		System.out.println("\n**\n");
		
		for(i = 0; i < arr.size(); i++) {
			System.out.println(arr.elementAt(i));
		}
		
		System.out.println("\n**\n");
		
		System.out.println("Therefore there are " + arr.size() + " number of words in the text!");
		
		System.out.println("\n**\n");
		
		System.out.println("There are " + map.size() + " number of unique words!!");
		
		System.out.println("\n**\n");
		
		
		Iterator hmIterator = map.entrySet().iterator();
		
		
		System.out.println("|	WORD	|	COUNT	|");
		while (hmIterator.hasNext()) {
			 
            Map.Entry mapElement
                = (Map.Entry)hmIterator.next();
            int count = (int)mapElement.getValue();
 
            // Printing mark corresponding to string entries
            System.out.println("|\t" + mapElement.getKey() + "\t|\t"
                               + count + "\t|");
        }
		
		
		System.out.println("\n**\n");
		
		sc.close();
	}
}
