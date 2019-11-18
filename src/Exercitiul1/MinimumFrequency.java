package Exercitiul1;

public class MinimumFrequency {
	public static void minimumFrequency(String str) {
		
		str = str.toLowerCase();
		
		int minCounter = str.length();
		
		for(int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i) == ' ' || str.indexOf(str.charAt(i)) != i) {
				continue;	
			}
			
			int charCounter = 1;
			
			for(int j = i + 1; j < str.length(); j++) {
				
				if(str.charAt(i) == str.charAt(j)) {
					charCounter++;
				}				
			}
			
			minCounter = charCounter < minCounter ? charCounter : minCounter;
			
		}
		
		for(int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i) == ' ' || str.indexOf(str.charAt(i)) != i) {
				continue;	
			}
			
			int charCounter = 1;
			
			for(int j = i + 1; j < str.length(); j++) {
				
				if(str.charAt(i) == str.charAt(j)) {
					charCounter++;
				}				
			}
			
			if(charCounter == minCounter) {
				System.out.println("Character '" + str.charAt(i)
									+ "' appears " + minCounter + " times.");
			}
		}
		
	}

	public static void main(String[] args) {
		
	System.out.println("Argument: \" Simple sentence.\"");
	minimumFrequency("Simple sentence.");
	System.out.println();
	System.out.println("Argument : \"Becoming a programmer is like gaining super powers!\"");
	minimumFrequency("Becoming a programmer is like gaining super powers!");
	System.out.println();
	System.out.println("Argument : \"aaaarbbb\"");
	minimumFrequency("aaaarbbb");
	}
}
