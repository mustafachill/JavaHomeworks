/***********************************************************************
 @Title:	CilMustafaWordGuessGame.java
 @Purpose:	to learning create basic game && algorithms
 @Author:    (Cil Mustafa)
 @Date:   	(13.01.2024)
 @Version:	1.0
 ************************************************************************/

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static Scanner keyboard = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        boolean returnGame = true;
        while(returnGame){
            String chosenWord = "";
            int randomIndex = 0;
            int howManyWords;

            System.out.println("Welcome to Word Guess Game!");
            System.out.println("-----------------------------");

            // for number of words
            System.out.println("How many words do you want to enter?");
            howManyWords = keyboard.nextInt();
            if (howManyWords <= 0 || howManyWords > 10) {
                System.out.println("Wrong entry, system closing...");
                System.exit(0);
            }
            System.out.println("Okay, you want to enter " + howManyWords + " words.");

            // for filling the array
            System.out.println("Please enter your words:");
            String[] words = new String[howManyWords];
            for(int i = 0; i < words.length; i++){
                words[i] = keyboard.next();
            }

            // for choosing a word
            randomIndex = random.nextInt(words.length);
            chosenWord = words[randomIndex];

            playGame(chosenWord);

            System.out.println("-----------------------------");
            System.out.println("For quit the game, press 0");
            System.out.println("For try again the game, press any number");
            int repeatGame = keyboard.nextInt();
            switch (repeatGame){
                case 0:
                    returnGame = false;
                    System.out.println("Good Bye!");
                    break;
                case 1:
                    returnGame = true;
            }

        }

    }
    public static void prepareGame(){

    }
    public static void playGame(String chosenWord){
        // for writing "____" for chosen word && add to letter to an array
        ArrayList<Character> lettersPlace = new ArrayList<Character>();
        ArrayList<Character> letters = new ArrayList<Character>();
        for (int i = 0; i<chosenWord.length(); i++){
            lettersPlace.add('_');
            letters.add(chosenWord.charAt(i));
        }

        // for matching the letters
        char guess;
        int counter = 0;
        boolean success = false;
        System.out.println("You have 3 chance for finding some letters");
        while (lettersPlace.contains('_')){
            if(counter < 3){
                System.out.print("Make a guess: ");
                guess = keyboard.next().charAt(0);

                if(letters.contains(guess)){
                    System.out.println("Correct guess!");
                    for(int i = 0; i < letters.size(); i++){
                        if(letters.get(i) == guess){
                            lettersPlace.set(i, guess);
                        }
                    }
                    System.out.println(lettersPlace);
                }
                else{
                    System.out.println("Wrong guess. Try again!");
                }
                counter++;
            }
            else{
                System.out.println("You have run out of attempts.");
                break;
            }

        }

        System.out.println(lettersPlace);
        System.out.println("-----------------------------");
        System.out.println("You should find the word. Make your last guess: ");
        String lastGuess = keyboard.next();
        if (lastGuess.equals(chosenWord)){
            success = true;
            System.out.println("Congratulations!");
            System.out.println("You guessed the word: " + chosenWord);
        }

        else{
            success = false;
            System.out.println("You didn't find the word :( ");
            System.out.println("The word is: " + chosenWord);
        }
    }
}