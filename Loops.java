public class Loops {

    public static void main(String[] args) {


        /*
        Write a program that uses a for-loop to loop through the numbers 1-10 and prints out each number.
         */
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        /*
        Write a program that uses a while loop to loop through the numbers 0-100 in increments of 10 and prints out each number.
         */
        int n = 0;
        while (n <= 100) {
            System.out.println(n);
            n += 10;
        }

        /*
        Write a program that uses a do-while-loop to loop through the numbers 1-10 and prints out each number.
         */
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 10);

        /*
        Write a program that uses a for-loop to loop through the numbers 1-100. Print out each number if is a multiple
        of 5, but do not print out any numbers between 25 and 75. Use the “continue” statement to accomplish this.
         */

        for (int i = 1; i <= 100; i++) {
            if (i >= 25 && i <= 75) {
                continue;
            }
            if (i % 5 == 0) {
                System.out.println("Multiple de 5 is : " + i);
            }
        }

        /*
        Write a program that uses a for-loop to loop through the numbers 1-100. Print out each number if is a multiple of 5,
        but do not print out any numbers greater than 50. Use the “break” keyword to accomplish this.
         */
        for (int i = 1; i <= 100; i++) {
            if (i > 50) {
                break;
            }
            if (i % 5 == 0) {
                System.out.println("Multiple de 5 is : " + i);
            }
        }

        /*
        Write a program that uses nested for-loops to output week 1 : Day 1 to 5 and week 2 : Day 1 to 5.
         */

        for (int i = 1; i <= 2; i++) {
            System.out.println("Week " + i + " :");
            for (int j = 1; j <= 5; j++) {
                System.out.println("\t Day " + j);
            }
        }

        /*
        Write a program that returns all the available palindromes within 10 and 200. The following output will be produced:
        11, 22, 33, 44, 55, 66, 77, 88, 99, 101, 111, 121, 131, 141, 151, 161, 171, 181, 191,

        there're 2 ways to resolve this exercise :
        1° : create function that allow to reverse integer as a String and return new integer reversed.
        2° : using StringBuilder.reverse.
        */
        for (int i = 10; i <= 200; i++) {
            int newInt = reverseInt(i);
            if (i == newInt) {
                System.out.println(i);
            }
        }

        /*
        Write a program that prints the Fibonacci Sequence from 0 to 50. The following output will be produced:
        0, 1, 1, 2, 3, 5, 8, 13, 21, 34,
         */


    }

    /*
    function that allows to transform an integer to String
    reverse the String and return an integer value.
     */
    static int reverseInt(int nb){

        //convert number to String.
        String convertNbreToStr = String.valueOf(nb);
        String newStrReversedNumber ="";

        for(int j = convertNbreToStr.length() - 1; j >= 0; j--){

            //get character a from the last index
            char c = convertNbreToStr.charAt(j);
            //convert character to String and concat value with newStrReversedNumber
            newStrReversedNumber = newStrReversedNumber.concat(String.valueOf(c));

        }
        //return reversed String as an integer
        return Integer.parseInt(newStrReversedNumber);
    }
}
