/*
	Author: Joshua Won
	Date: 12/5/24
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String word = sc.nextLine();
		String finalSent = "";
		
		while(true){
			if(sentence.indexOf(" ") == -1){
			finalSent = finalSent + " " + spongeCase(sentence);
				break;
			}
			int space = sentence.indexOf(" ");
			String word = sentence.subsring(0,space);

			sentence = sentence.substring(space + 1);
		}
		System.out.println(finalSent);
		
		public static String spongeCase(String word){
		String result = "";
		for(int i = 0; i < word.length(); i++){
			String letter = word.substring(i, i+1);
			if (i%2 == 0 ){
			letter = letter.toLowerCase();
			}
			else {
			letter = letter.toUpperCase();
			}
			result = result + letter;
			}
		}
	}
}
