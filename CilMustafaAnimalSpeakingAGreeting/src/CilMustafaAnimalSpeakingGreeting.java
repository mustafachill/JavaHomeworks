/***********************************************************************
 @Title:	CilMustafaAnimalSpeakingAGreeting
 @Purpose:	To get familiar with Java
 @Author:    (Cil Mustafa)
 @Date:   	(30.10.2023)
 @Version:	1.0
 ************************************************************************/


public class CilMustafaAnimalSpeakingGreeting {
    public static void main(String[] args) {
        drawer();

        System.out.println("++++++++++++++++++++++++++++++++++++++");
        PartsOfAnimal animal = new PartsOfAnimal();
        SpeakingBubble bubble = new SpeakingBubble();

        animal.drawTheAnimal();
        bubble.drawTheSpeakingBubble();
    }
    static void drawer(){
        PartsOfAnimal animal = new PartsOfAnimal();
        SpeakingBubble bubble = new SpeakingBubble();

        System.out.println(animal.ears + "          " + bubble.topSide);
        System.out.println(animal.head + "        " + bubble.messageLine1);
        System.out.println(animal.body + "  <<<" + "   " + bubble.messageLine2);
        System.out.println(animal.legs + "          " + bubble.messageLine3);
        System.out.println(animal.foot + "        " + bubble.bottomSide);
    }
}
class PartsOfAnimal{
    String ears = "    /\\_/\\ ";
    String head = "(   ‘   `  )";
    String body = "(    -     )";
    String legs = "   |  |  |";
    String foot = "  (___|___) ";
    void drawTheAnimal(){
        System.out.println(ears);
        System.out.println(head);
        System.out.println(body);
        System.out.println(legs);
        System.out.println(foot);
    }
}
class SpeakingBubble{
    String message1 = "Hello";
    String message2 = "Junior";
    String message3 = "Coder!";


    String topSide = "  -------";
    String messageLine1 = " / " + message1 + " \\";
    String messageLine2 = "| " + message2 + " |";
    String messageLine3 = "\\ " + message3 + " /";
    String bottomSide = "  -------";

    void drawTheSpeakingBubble(){
        System.out.println(topSide);
        System.out.println(messageLine1);
        System.out.println(messageLine2);
        System.out.println(messageLine3);
        System.out.println(bottomSide);
    }
}