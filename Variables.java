import java.text.DecimalFormat;

public class Variables {

    public static void main(String[] args) {

        //declaration
        int a = 5, b=16;
        double c = 3.5, d = 16.87;

        //1. sum of 2 integers and, return an integer
        int e = a + b;
        System.out.println("sum of " + a + " + " + b + " = " + e);

        //2. sum of 2 double variable, return a double
        double g = Double.sum(c, d);
        System.out.println("sum of " + c + " + " + d + " = " + g);

        //3. sum between an integer and double, return a double
        double f = a + d;
        System.out.println("sum of " + a + " + " + d + " = " + f);


        //4.  devide 2 integers, return an integer
        int h = b/a;
        System.out.println("devide " + b + " by " + a + " = " + h);

          /*
            int l = k/a;  - doesn't compile because try to assign larger type (double) to a smaller type (int), we have 2 solution to solve this case :
            1° : double l = k/a;   //change result type to double
            2° : int l = (int) (k/a);  //or cast operation to int but have to check if the result does't not exceed the int value between -2e32 and 2e32 -1
         */
        double k = b;
        double l =  k/a;
        System.out.println("devide " + k + " by " + a + " = " + l);


        //5. devide 2 doubles, return a double value
        double m = d/c;
        System.out.println("devide " + d + " by " + c + " = " + m);

        //cast devide's result of 2 double and return an integer value
        int n = (int)(d/c);
        System.out.println("devide " + d + " by " + c + " = " + n);

        //6. devide 2 integer and return integer
        int x = 5, y = 6;
        int q1 = y/x;
        System.out.println("devide " + y + " by " + x + " = " + q1);

        double q2 = (double) y/x;
        System.out.println("devide " + (double) y + " by " + x + " = " + q2);

        //7.
        //Write a program that declares a named constant and uses it in a calculation. Print the result.
        final int RACIO = 4;
        double note = 12.75;
        double finalNote = note * RACIO;
        System.out.println("final examination note of Math = "+finalNote);



        //8.
        double coffee = 3.99;
        double cappuccino = 3.45;
        double expresso = 4.49;
        double greenTea = 4.99;
        final double SALES_TAX = 1.05;
        DecimalFormat df = new DecimalFormat(".##");

        double subTotal, totalSale;

        subTotal = 3 * coffee + 4 * cappuccino + 2 * expresso;

        totalSale = subTotal * SALES_TAX;

        System.out.println("the total sale is : "+ df.format(totalSale));




    }
}
