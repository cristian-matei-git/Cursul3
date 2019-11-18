package Exercitiul4;

import java.util.Arrays;

public class Filter {
	
	public static String[] selectiveFilter(String[] words, String key, int matchKey) {
		
		String[] filteredWords = new String[words.length];
		
		int size = 0;
		
		key = key.toLowerCase();
	 
		for (int i=0; i<words.length; i++) {
			
			String currentWord = words[i].toLowerCase();
			
			int minLength = Math.min(currentWord.length(), key.length());
			
			int counter = 0;
			
			for (int j=0; j<minLength; j++) {
				
				if (currentWord.charAt(j) == key.charAt(j)) {
					
					counter++;
				}
			}
			
			if (counter >= matchKey) {
				
				filteredWords[size] = words[i];
				size++;
			}
		}
		 
		return Arrays.copyOf(filteredWords, size);
	}
	
	public static void printArray(String[] array){
		
		for(int i = 0; i < array.length; i++) {
			
			System.out.print(array[i] + " ");
			
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		String[] array = new String[] {"clothes", "ant", "drop", "Fly", "racoon", "class", "Plane"};
		
		printArray(selectiveFilter(array, "plot", 1));
		printArray(selectiveFilter(array, "plot", 2));
		printArray(selectiveFilter(array, "plot", 3));
		
		
	}

}
