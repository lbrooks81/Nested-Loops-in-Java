/*
 * Name: [Logan Brooks]
 * South Hills Username: [lbrooks81@southhills.edu]
 */


import java.util.Scanner;

public class Main
{
    public static String PART_LABEL = "Part";
    public static int PARTS = 5;
    public static String QUIT = "ZZZ ";
    public static int QUESTIONS = 3;
    public static String LINE = ". ___";
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        String quizName = houseKeeping();
        while(!quizName.equalsIgnoreCase(QUIT))
        {
            quizName = detailLoop(quizName);
        }
        endOfJob();
    }
    public static String houseKeeping()
    {
        System.out.print("Enter quiz name or " + QUIT + " to quit " );
        return input.nextLine();
    }
    public static void endOfJob()
    {
        input.close();
    }
    public static String detailLoop(String quizName)
    {
        System.out.println(quizName);
        int partCounter = 1;
        while(partCounter <= PARTS)
        {
            System.out.println(PART_LABEL + ", " + partCounter);
            int questionCounter = 1;
            while(questionCounter <= QUESTIONS)
            {
                System.out.println(questionCounter + ", " + LINE);
                questionCounter += 1;
            }
            partCounter += 1;
        }
        System.out.println("Enter next quiz name or " + QUIT + " to quit ");
        quizName = input.nextLine();
        return quizName;
    }
}