package Exercitiul4;

import java.util.Arrays;

public class Filter {
	
	public static String[] selectiveFilter(String[] words, String key, int matchKey) {
		String[] filteredWords = new String[words.length];
		int size = 0;
		key = key.toLowerCase();
	 
		for (int i=0; i<words.length; i++) {
			String crtWord = words[i].toLowerCase();
			int minLength = Math.min(crtWord.length(), key.length());
			int countMatches = 0;
			for (int j=0; j<minLength; j++) {
				if (crtWord.charAt(j) == key.charAt(j)) {
					countMatches++;
				}
			}
			if (countMatches >= matchKey) {
				filteredWords[size] = words[i]; // the original word (not crtWord)
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
