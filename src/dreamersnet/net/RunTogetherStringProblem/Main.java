package dreamersnet.net.RunTogetherStringProblem;

import java.util.ArrayList;

/**
 * A program that converts a camel case string into a sentence.
 * Take a string that is a "run together" string where each word is camel cased so the first letter in each word is capital.
 * For example "buffaloChickenDipTastesReallyGood." --> "Buffalo chicken dip tastes really good."
 * @author Waterlgndx
 *
 */

public class Main {
	public static void main(String[] args) {
		StringBuilder original = new StringBuilder();
		ReadUserInput myReader = new ReadUserInput();
		
		original.append(myReader.prompt("Enter a camel case string to convert to a sentence:"));
		ArrayList<String> words= new ArrayList<>();
		int startPos = 0;
		original.setCharAt(0, Character.toUpperCase(original.charAt(0)));
		for (int i=1; i < original.length(); i++ ) {
			if (Character.isUpperCase(original.charAt(i))) {
				words.add(getWord(original,startPos,i));
				startPos = i;
			} else if (i==original.length()-1) {
				words.add(getWord(original,startPos,i+1));				
			}
		}
		
		
		String result = String.join(" ", words);
		System.out.println(result);
	}
	
	private static String getWord(StringBuilder originalWord, int startPos, int endPos) {
		String newWord;
		if (startPos == 0) {
			newWord = originalWord.substring(startPos, endPos);
		} else {
			newWord = originalWord.substring(startPos, endPos).toLowerCase();
		}
		return newWord;
	}
}
