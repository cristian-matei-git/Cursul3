package Exercitiul2;

public class AnagramsHardMode {
	
	public static void bubbleSort(char[] values) {
		
		char aux = '\0';
		
		for(int i = 0; i < values.length; i++) {
			
			for(int j = 0; j < values.length - i - 1; j++) {
				
				if(values[j] > values[j+1]) {
					
					aux = values[j];
					values[j] = values[j+1];
					values[j+1] = aux;
					
				
				}
			}
		}
		
	}
	
	public static String filterNonLetters(String str) {
		
		str = str.toLowerCase();
		StringBuilder sb = new StringBuilder(str);
		
		for(int i = 0; i < sb.length(); i++) {
			
			if(!Character.isLetter(sb.charAt(i))) {
				
				sb.deleteCharAt(i);
				i--;
				
			}
		}
		
		return sb.toString();
		
	}
	
	
	public static boolean anagramSolver(String anag1, String anag2) {
		
		anag1 = filterNonLetters(anag1);
		anag2 = filterNonLetters(anag2);
		
		char[] str1 = anag1.toCharArray();
		char[] str2 = anag2.toCharArray();
		
		bubbleSort(str1);
		bubbleSort(str2);
		
		anag1 = "";
		anag2 = "";
		
		for(int i = 0; i < str1.length; i++) {
			
			anag1 += str1[i];
			
			
		}
		
		for(int i = 0; i < str2.length; i++) {
			
			
			anag2 += str2[i];
			
		}
		
		return anag1.equals(anag2);
		
	}

	public static void main(String[] args) {
		
		System.out.println(anagramSolver("fairy tales!", "rail, safety"));
		System.out.println(anagramSolver("silver bullet", "sunny day"));
		System.out.println(anagramSolver("William Shakespeare", "I am a weakish speller!"));	

	}

}
