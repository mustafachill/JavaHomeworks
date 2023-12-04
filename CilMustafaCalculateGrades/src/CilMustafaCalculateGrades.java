/**
 @Title:	CilMustafaCalculateGrades
 @Purpose:	To practice java loop and conditional statements.
 @Author:    (Cil Mustafa)
 @Date:   	(30.10.2023)
 @Version:	1.0
 */


import java.util.Scanner;
public class CilMustafaCalculateGrades {
    public static void main(String[] args) {
    GradesCalculator calculator = new GradesCalculator();
    calculator.announcer();
    }
}
class GradesCalculator{
    Scanner keyboard = new Scanner(System.in);
    int midtermExamGrade;
    int finalExamGrade;
    int assignment1Grade;
    int assignment2Grade;
    int assignment3Grade;
    int labGradeBeforeMidterm;
    int labGradeAfterMidterm;
    // grades:
    double midtermGrade;
    double finalGrade;
    double assumptionOfFinalCourseGrade;
    GradesCalculator(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your midterm exam grade: ");
        midtermExamGrade = keyboard.nextInt();
        System.out.print("Please enter your final exam grade: ");
        finalExamGrade = keyboard.nextInt();
        System.out.print("lease enter Assignment #1 grade: ");
        assignment1Grade = keyboard.nextInt();
        System.out.print("Please enter Assignment #2 grade:  ");
        assignment2Grade = keyboard.nextInt();
        System.out.print("Please enter Assignment #3 grade:  ");
        assignment3Grade = keyboard.nextInt();
        System.out.print("Please enter the lab grade before the midterm exam: ");
        labGradeBeforeMidterm = keyboard.nextInt();
        System.out.print("Please enter the lab grade after the midterm exam: ");
        labGradeAfterMidterm = keyboard.nextInt();
        midtermGrade = (double) (midtermExamGrade * 60/100) + (double) (assignment1Grade * 10/100) + (double) (assignment2Grade * 10/100) + (double) (labGradeBeforeMidterm * 20/100);
        finalGrade = (double) (finalExamGrade * 60/100) + (double) (assignment3Grade * 20/100) + (double) (labGradeAfterMidterm * 20/100);
        assumptionOfFinalCourseGrade = (double) (midtermGrade/2) + (double) (finalGrade/2);

    }
    void announcer(){
        System.out.println("The weighted midterm grade is: "+ midtermGrade);
        System.out.println("The weighted final grade is: "+ finalGrade);
        System.out.println("Final course grade is: "+ assumptionOfFinalCourseGrade);
        returner();
    }
    void returner(){
        Scanner keyboard = new Scanner(System.in);
        int continueOrExit = 0;
        System.out.println("Do you want to start calculate for another student?  Please type yes for '1' , no for '0'.");
        try {
            continueOrExit = keyboard.nextInt();
        }
        catch (Exception e){
            System.out.println("Please enter 1 or 0.");
            returner();
        }
        if (continueOrExit == 1){
            GradesCalculator calculation = new GradesCalculator();
            calculation.announcer();
        }
        else if (continueOrExit == 0){
            System.out.println("Bye Bye!");
            System.exit(0);
        }
        else {
            System.out.println("Wrong value for entering, please type '1' or '0'.");
            returner();
        }
    }
}
