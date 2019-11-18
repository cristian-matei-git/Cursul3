package Exercitiul2;

import java.util.Arrays;

public class Anagrams {
	
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
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		return Arrays.equals(str1, str2);
	
		
	}

	public static void main(String[] args) {
		
		
		System.out.println(anagramSolver("fairy tales!", "rail, safety"));
		System.out.println(anagramSolver("silver bullet", "sunny day"));
		System.out.println(anagramSolver("William Shakespeare", "I am a weakish speller!"));	

	}

}
