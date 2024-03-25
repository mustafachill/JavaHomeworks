import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
public class Main{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        try{

            String sentence1 = keyboard.nextLine();
            String sentence2 = keyboard.nextLine();
            String sentence3 = keyboard.nextLine();
            String sentence4 = keyboard.nextLine();
            String sentence5 = keyboard.nextLine();
            keyboard.close();

            File file = new File("elifim.txt");

            PrintWriter writer = new PrintWriter("elifim.txt");
            writer.println(sentence1);
            writer.println(sentence2);
            writer.println(sentence3);
            writer.println(sentence4);
            writer.println(sentence5);
            writer.close();


            Scanner fileReader = new Scanner(new File("elifim.txt"));
            String line;
            while(fileReader.hasNextLine()){
                line = fileReader.nextLine();
                System.out.println(line);
            }

        }
        catch(Exception e){
            System.out.println(e);
        }




    }
}