package practiceQuestions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CheckVowelIsPresent {
	public static void main(String[] args) {
		Set<Character> vowels = new HashSet<>();
		for(Character v:"aeiouAEIOU".toCharArray()) {
			vowels.add(v);
		}
		
		boolean flag = false;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any string");
		String str = s.nextLine();
		for(int i=0;i<str.length();i++) {
			if(vowels.contains(str.charAt(i))) {
				flag = true;
			}
		}
		if(flag) {
			System.out.println("Provided string contain vowels!");
		}else
		{
			System.out.println("Provided string contain no vowels!");
		}
		s.close();
	}
}
