package Exercitiul1;

public class MaximumFrequency {
	
	public static void maximumFrequency(String str) {
		
		str = str.toLowerCase();
		int maxCounter = 0;
		
		for(int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i) == ' ') {
				continue;	
			}
			
			int charCounter = 1;
			
			for(int j = i + 1; j < str.length(); j++) {
				
				if(str.charAt(i) == str.charAt(j)) {
					charCounter++;
				}				
			}
			
			maxCounter = charCounter > maxCounter ? charCounter : maxCounter;
			
		}
		
		for(int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i) == ' ') {
				continue;	
			}
			
			int charCounter = 1;
			
			for(int j = i + 1; j < str.length(); j++) {
				
				if(str.charAt(i) == str.charAt(j)) {
					charCounter++;
				}				
			}
			
			if(charCounter == maxCounter) {
				System.out.println("Character '" + str.charAt(i)
									+ "' appears " + maxCounter + " times.");
			}
		}
		
	}

	public static void main(String[] args) {
		
	System.out.println("Argument: \" Simple sentence.\"");
	maximumFrequency("Simple sentence.");
	System.out.println();
	System.out.println("Argument : \"Becoming a programmer is like gaining super powers!\"");
	maximumFrequency("Becoming a programmer is like gaining super powers!");
		
	}

}
