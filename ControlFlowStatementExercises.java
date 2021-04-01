
import java.util.Scanner;

public class ControlFlowStatementExercises {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        boolean stopLoop = false;
        /*
            infinite loop
            In this case !stop always true
         */
        while(!stopLoop){
            System.out.println("Select exercise number : (expected value 1 to 6)");
            int exerciseNumber =sc.nextInt();

            switch(exerciseNumber){
                case 1:
                    System.out.println("Exercise 1 :\n");
                    System.out.println("Annoucement : \nWrite a program that declares 1 integer variable x, and then assigns 7 to it. \n" +
                            "Write an if statement to print out “Less than 10” if x is less than 10. \n" +
                            "Change x to equal 15 and notice the result (console should not display anything).\n");
                    System.out.println();
                    int x1 = getIntNumber();
                    if(x1 < 10){
                        System.out.println("Less than 10");
                    }
                    break;

                case 2:
                    System.out.println("Exercise 2 :\n");
                    System.out.println("Annoucement : \nWrite a program that declares 1 integer variable x, and then assigns 7 to it. \n" +
                            "Write an if-else statement that prints out “Less than 10” if x is less than 10 and \n" +
                            "“Greater than 10” if x is greater than 10. Change x to 15 and notice the result.\n");
                    int x2 = getIntNumber();
                    if(x2 < 10){
                        System.out.println("Less than 10");
                    }else{
                        System.out.println("Greater than 10.");
                    }
                    break;

                case 3:
                    System.out.println("Exercise 3 :\n");
                    System.out.println("Annoucement : \nWrite a program that declares 1 integer variable x, and then assigns 15 to it. \n" +
                            "Write an “if-else-if” statement that prints out “Less than 10” if x is less than 10, \n" +
                            "“Between 10 and 20” if x is greater than 10 but less than 20, and “Greater than or \n" +
                            "equal to 20” if x is greater than or equal to 20. Change x to 50 and notice the result.\n");
                    int x3 = getIntNumber();
                    if(x3<10){
                        System.out.println("Less than 10.");
                    }else if(x3 > 10 && x3 < 20){
                        System.out.println("Between 10 and 20.");
                    }else{
                        System.out.println("Greater than or equal to 20.");
                    }
                    break;

                case 4 :
                    System.out.println("Exercise 4 :\n");
                    System.out.println("Annoucement : \nWrite a program that declares 1 integer variable x, and then assigns 15 to it. \n" +
                            "Write an if-else statement that prints “Out of range” if the number is less than 10 or \n" +
                            "greater than 20 and prints “In range” if between 10 and 20 (including equal to 10 or 20). \n" +
                            "Change x to 5 and notice the result.\n");
                    int x4 = getIntNumber();
                    if(x4 >= 10 && x4 <= 20){
                        System.out.println("In range");
                    }else{
                        System.out.println("Out of range");
                    }
                    break;

                case 5 :
                    System.out.println("Annoucement : \nWrite a program that uses if-else-if statements to print out grades A, B, C, D, F according to the following criteria:\n" +
                            "A: 90-100\n" +
                            "\n" +
                            "B: 80-89\n" +
                            "\n" +
                            "C: 70-79\n" +
                            "\n" +
                            "D: 60-69\n" +
                            "\n" +
                            "F: <60\n" +
                            "\n" +
                            "Use the Scanner class to accept a number score from the user to determine the letter grade. \n" +
                            "Print out “Score out of range.” if the score is less than 0 or greater than 100.\n");
                    int x5 = getIntNumber();
                    if(x5 >=90 && x5 <= 100){
                        System.out.println("A");
                    }else if(x5 >=80 && x5 <90){
                        System.out.println("B");
                    }else if(x5 >=70 && x5 <80){
                        System.out.println("C");
                    }else if(x5 >=60 && x5 <70){
                        System.out.println("D");
                    }else if(x5 >=0 && x5 < 60){
                        System.out.println("F");
                    }else{
                        System.out.println("Score out of range");
                    }
                    break;

                case 6 :
                    System.out.println("Annoucement : \nWrite a program that accepts an integer between 1 and 7 from the user. \n" +
                            "Use a switch statement to print out the corresponding weekday. Print “Out of range” \n" +
                            "if the number is less than 1 or greater than 7. Don’t forget to include “break” \n" +
                            "statements in each of your cases.\n");
                   int int6 = getIntNumber();

                   switch (int6){
                       case 1 :
                           System.out.println("Monday");
                           break;
                       case 2 :
                           System.out.println("Thuesday");
                           break;
                       case 3 :
                           System.out.println("Wednesday");
                           break;
                       case 4 :
                           System.out.println("Thursday");
                           break;
                       case 5 :
                           System.out.println("Friday");
                           break;
                       case 6 :
                           System.out.println("Saturday");
                           break;
                       case 7 :
                           System.out.println("Friday");
                           break;
                       default:
                           System.out.println("Out of range");
                   }
                   break;
                default:
                    // set stopLoop to true for stoping loop
                    // in this default case, while statement will be false then its quit the loop
                    stopLoop = true;
                    System.out.println("Out of range.\r\nExit program !");
            }

        }

    }

    // function to get an integer value using scanner object.
    private static int getIntNumber(){
        System.out.println("Enter an integer value : ");
        return sc.nextInt();
    }
}
