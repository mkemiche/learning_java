import java.util.Scanner;

public class OperatorsAndNumber {

    public static void main(String[] args) {



        System.out.println("---------------------------------------");
        System.out.println("------------- Exercise 3 --------------");
        System.out.println("---------------------------------------");
        /*
            binary value of 2 is 0010.
            x1 = 2 = 0010
            the left shift operator shift the bits to the left by 1 and fill the right shidt by 0.
            ex: x1 << 1 ==> 0010 ==> shift 1 bit to the left ==> 0100 ==> x = 4.
         */
        int x1 = 2;
        System.out.println("binary value of "+x1+" is : "+ Integer.toBinaryString(x1));
        x1 = x1 << 1;
        System.out.println("binary value of 2 << 1 is : "+Integer.toBinaryString(x1));
        System.out.println("decimal value of "+Integer.toBinaryString(x1)+" is : "+ x1);

        System.out.println("---------------------------------------");
        /*
        calculate left shift value of 9 by 2 (9 << 2)
        x2 = 9 = 1001
        ex : 9 << 2 ==> 1001 ==> shift 2 bits to left ==> 0010 0100 ==> 36
         */
        int x2 = 9;
        System.out.println("binary value of "+x2+" is : "+ Integer.toBinaryString(x2));
        x2 = x2 << 2;
        System.out.println("binary value of 9 << 1 is : "+Integer.toBinaryString(x2));
        System.out.println("decimal value of "+Integer.toBinaryString(x2)+" is : "+ x2);

        System.out.println("---------------------------------------");
        /*
        binary value of 17 is : 0001 0001
        x3 = 17 = 0001 0001
        17 << 1 = ==> 0001 0001 => shift 1 bit to left ==> 0010 0010 ==> 34
         */
        int x3 = 17;
        System.out.println("binary value of "+x3+" is : "+ Integer.toBinaryString(x3));
        x3 = x3 << 1;
        System.out.println("binary value of 17 << 1 is : "+Integer.toBinaryString(x3));
        System.out.println("decimal value of "+Integer.toBinaryString(x3)+" is : "+ x3);

        System.out.println("---------------------------------------");
         /*
        binary value of 88 is : 0101 1000
        x3 = 88 = 0101 1000
        88 << 1 = ==> 0101 1000 => shift 1 bit to left ==> 1011 0000 ==> 176
         */
        int x4 = 88;
        System.out.println("binary value of "+x4+" is : "+ Integer.toBinaryString(x4));
        x4 = x4 << 1;
        System.out.println("binary string of 88 << 1  is : "+Integer.toBinaryString(x4));
        System.out.println("decimal form of "+ Integer.toBinaryString(x4) +" is : "+ x4);

        System.out.println("---------------------------------------");
        System.out.println("------------- Exercise 4 --------------");
        System.out.println("---------------------------------------");
        /*
        binary value of 150 is : 1001 0110
        y1 = 150 = 1001 0110
        150 >> 2 = ==> 1001 0110 => shift 2 bit to the right ==> 0010 0101 ==> 37
         */
        int y1 = 150;
        System.out.println("binary value of "+y1+" is : "+ Integer.toBinaryString(y1));
        y1 = y1 >> 2;
        System.out.println("binary value of 150 >> 2 is : "+Integer.toBinaryString(y1));
        System.out.println("decimal value of "+Integer.toBinaryString(y1)+" is : "+ y1);

        System.out.println("---------------------------------------");

        /*
        binary value of 225 is : 1110 0001
        y2 = 225 = 1110 0001
        225 >> 2 = ==> 1110 0001 => shift 2 bit to the right ==> 0011 1000 ==> 56
         */
        int y2 = 225;
        System.out.println("binary value of "+y2+" is : "+ Integer.toBinaryString(y2));
        y2 = y2 >> 2;
        System.out.println("binary value of 225 >> 2 is : "+Integer.toBinaryString(y2));
        System.out.println("decimal value of "+Integer.toBinaryString(y2)+" is : "+ y2);

        System.out.println("---------------------------------------");

        /*
        binary value of 1555 is : 0110 0001 0011
        y3 = 1555 = 0110 0001 0011
        1555 >> 2 = ==> 0110 0001 0011 => shift 2 bit to the right ==> 0001 1000 0100==> 388
         */
        int y3 = 1555;
        System.out.println("binary value of "+y3+" is : "+ Integer.toBinaryString(y3));
        y3 = y3 >> 2;
        System.out.println("binary value of 1555 >> 2 is : "+Integer.toBinaryString(y3));
        System.out.println("decimal value of "+Integer.toBinaryString(y3)+" is : "+ y3);

        System.out.println("---------------------------------------");

        /*
        binary value of 32456 is : 0111 1110 1100 1000
        y4 = 32456 = 0111 1110 1100 1000
        32456 >> 2 = ==> 0111 1110 1100 1000 => shift 2 bit to the right ==> 0001 1111 1011 0010==> 8114
         */
        int y4 = 32456;
        System.out.println("binary value of "+y4+" is : "+ Integer.toBinaryString(y4));
        y4 = y4 >> 2;
        System.out.println("binary value of 1555 >> 2 is : "+Integer.toBinaryString(y4));
        System.out.println("decimal value of "+Integer.toBinaryString(y4)+" is : "+ y4);

        System.out.println("---------------------------------------");
        System.out.println("------------- Exercise 5 --------------");
        System.out.println("---------------------------------------");

        /*
        binary value of x = 7 = 0111
        binary value of y = 17 = 0001 0001
                      0000 0111
                      0001 0001
        x & y ===>   -----------  ==> result is 1
                      0000 0001

        it's work like truth table of && operator, if the 2 conditions are true then the result is true, else false.
         */
        int x = 7, y = 17;
        System.out.println("binary values of "+ x +" = "+Integer.toBinaryString(x)+" and "+y+" = "+Integer.toBinaryString(y));
        int z1 = x & y;
        System.out.println(x+" & "+y+" equals : "+z1);

        /*
        binary value of x = 7 = 0111
        binary value of y = 17 = 0001 0001
                      0000 0111
                      0001 0001
        x | y ===>   -----------  ==> result is 23
                     0001 0111

        it's work like truth table of && operator, if the 2 conditions are true then the result is true, else false.
         */
        int z2 = x | y;
        System.out.println(x+" | "+y+" equals : "+z2);

        System.out.println("---------------------------------------");
        System.out.println("------------- Exercise 6 --------------");
        System.out.println("---------------------------------------");

        /*
        postfix increment work left to right
        if a = 3 and b = a++ then the program assign value of a to b first and increment a after.
        then the result will be : b = 3 and a = 4.
         */
        int a = 3;
        System.out.println("before postfix increment : "+ a);
        int b = a++;
        System.out.println("value of a after postfix increment : "+a);
        System.out.println("value of b after postfix increment : "+b);

        System.out.println("---------------------------------------");

        /*
        it exist 3 way to increment value using the operator ++, += and + 1 value
         */
        int c = 6;
        System.out.println("first increment using operator ++ : "+ (++c));
        System.out.println("second increment using operator += : "+ (c+=1));
        System.out.println("third increment using + 1 operation : "+ (c+1));

        System.out.println("---------------------------------------");
        System.out.println("------------- Exercise 7 --------------");
        System.out.println("---------------------------------------");

        int m = 5, n = 8;
        int sum = ++m + n;
        System.out.println("sum using prefix increment is : "+sum);

        m = 5;
        int sum2 = m++ + n;
        System.out.println("sum using postfix incremen  is : "+sum2);

    }
}
