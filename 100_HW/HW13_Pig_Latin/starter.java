/*
   * Author: Joshua Won
   * Date: 12/8/24
   * Collaborator(s):
*/

import java.util.*;

class starter {
	private static String toPigLatin(String x){
        if (x.length() == 1){
            return  x + "-way";
        }
        String joshua = x.substring(0, 1);
        String won = x.substring(1, 2);

        if (isVowel(joshua)){
            return x + "-way";
        }
        else if (isVowel(won)){
            return x.substring(1) + "-" + x.substring(0,1) + "ay";
        }
        else {
            return x.substring(2) + "-" + x.substring(0,2) + "ay";
        }
    }
    private static boolean isVowel(String letter){
        return letter.contains("a") || letter.contains("e") || letter.contains("i") || letter.contains("o") || letter.contains("u") || letter.contains("A") || letter.contains("E") || letter.contains("I") || letter.contains("O")|| letter.contains("U");
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence: ");
        String sentence = sc.nextLine();
        String newsent = (sentence + " ");
        int c = 0;
        String stop = "";

        for (int i = 0; i < newsent.length(); i++){
            if (newsent.substring(i, i+1).equals(" ")){
                String word = newsent.substring(c, i);
                stop = stop + toPigLatin(word) + " ";
                c = i;
            }
        }
        System.out.println("Here's your sentence in Pig Latin!");
        System.out.println(stop);

    }
}