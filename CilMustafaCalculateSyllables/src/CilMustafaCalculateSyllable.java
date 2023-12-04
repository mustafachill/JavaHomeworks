/**
 @Title:	CilMustafaCalculateSyllables
 @Purpose:	To get familiar with loop and conditional structures in Java.
 @Author:    (Cil Mustafa)
 @Date:   	(31.10.2023)
 @Version:	1.0
 */



import java.util.Scanner;

public class CilMustafaCalculateSyllable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a word for calculate syllable: ");
        String word = scanner.nextLine().toLowerCase();

        int syllableCount = 0;
        boolean beforeSyllable = false;

        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);

            if (isVowel(character)) {
                if (!beforeSyllable == true) {
                    syllableCount++;
                    beforeSyllable = true;
                }
            } else {
                beforeSyllable = false;
            }
            if (i == word.length() - 1 && character == 'e') {
                syllableCount--;
            }
        }

        if (syllableCount == 0) {
            syllableCount = 1;
        }

        System.out.println("We have " + syllableCount + " pieces of syllable.");
    }

    public static boolean isVowel(char character) {

        return character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' || character == 'y';
    }
}
