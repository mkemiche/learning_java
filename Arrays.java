
public class Arrays {

    public static void main(String[] args) {

        /*
           Write a program that creates an array of integers with a length of 3. Assign the values 1, 2, and 3 to the indexes. Print out each array element.
       */

        int[] intArray = new int[3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        for (int elt : intArray) {
            System.out.println(elt);
        }

        /*
        Write a program that returns the middle element in an array. Give the following values to the integer array: {13, 5, 7, 68, 2}
        and produce the following output: 7
        */
        int[] intArr = new int[]{13, 5, 7, 68, 2};
        System.out.println("the middle value of intArr is : " + intArr[intArr.length / 2]);


        /*
        Write a program that creates an array of String type and initializes it with the strings “red”, “green”, “blue” and “yellow”.
        Print out the array length. Make a copy using the clone( ) method. Use the Arrays.toString( ) method on the new array to verify
        that the original array was copied.
         */
        String[] strArray = {"red", "green", "blue", "yellow"};
        System.out.println("Original array elements are  : " + Arrays.toString(strArray));
        System.out.println("length of original array is : " + strArray.length);
        String[] strArrayCopie = strArray.clone();
        System.out.println("Copied array elements are : " + Arrays.toString(strArrayCopie));




        /*
        Write a program that creates an integer array with 5 elements (i.e., numbers). The numbers can be any integers.
        Print out the value at the first index and the last index using length - 1 as the index. Now try printing the value at index = length
        ( e.g., myArray[myArray.length ] ).  Notice the type of exception which is produced. Now try to assign a value to the array index 5.
        You should get the same type of exception.
         */
        int[] arr = new int[]{1, 43, 54, 23, 98};
        System.out.println("First element is : " + arr[0]);
        System.out.println("Last element is : " + arr[arr.length - 1]);
        // System.out.println(arr[arr.length]); runtime error : ArrayIndexOutOfBoundsException; because the index of start with 0 to length - 1 (5-1 = 4) then the last index of this array is 4
        // arr[5] = 7;  runtime error : ArrayIndexOutOfBoundsException;


        /*
        Write a program where you create an integer array with a length of 5. Loop through the array and assign the value of the loop control variable
        (e.g., i) to the corresponding index in the array.
         */
        int[] arr2 = new int[]{1, 19, 6, 74, 7};
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Value of index " + i + " is : " + arr2[i]);
        }

        /*
        Write a program where you create an integer array of 5 numbers. Loop through the array and assign the value of the loop control variable
        multiplied by 2 to the corresponding index in the array.
         */
        int[] arr3 = new int[]{1, 19, 6, 74, 7};
        System.out.println("contents of array : " + Arrays.toString(arr3));
        for (int i = 0; i < arr3.length; i++) {
            System.out.println("Value of index " + i + " multiplied by 2 is : " + (arr2[i] * 2));
        }


        /*
        Write a program where you create an array of 5 elements. Loop through the array and print the value of each element,
        except for the middle (index 2) element.
         */
        int[] arr4 = new int[]{1, 19, 23, 84, 7};
        for (int i = 0; i < arr4.length; i++) {
            if (i == arr.length / 2) {
                continue;
            }
            System.out.println("Value of index " + i + " is : " + arr4[i]);
        }

        /*
        Write a program that creates a String array of 5 elements and swaps the first element with the middle element without creating a new array.
         */
        String[] strArray2 = {"one", "two", "three", "four", "five"};
        System.out.println("Original array is  : " + Arrays.toString(strArray2));
        String temp = strArray2[0];
        strArray2[0] = strArray2[strArray2.length/2];
        strArray2[strArray2.length/2] = temp;
        System.out.println("Array after swaps is  : " + Arrays.toString(strArray2));



        /*
        Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}. Print the array in ascending order,
        print the smallest and the largest element of the array. The output will look like the following:
            Array in ascending order: 0, 1, 2, 4, 9, 13
            The smallest number is 0
            The biggest number is 13
         */
        int[] arr5 = {4, 2, 9, 13, 1, 0};
        System.out.println("Original array is  : " + Arrays.toString(arr5));
        Arrays.sort(arr5);
        StringBuilder sortNumber= new StringBuilder();
        for (int i = 0; i < arr5.length-1; i++) {
            sortNumber.append(String.format("%d, ", arr5[i]));
        }
        System.out.println("Array in ascending order: "+sortNumber+""+arr5[arr5.length-1]);
        System.out.println("The smallest number is "+arr5[0]);
        System.out.println("The biggest number is "+arr5[arr5.length-1]);

        /*
        Create an array that includes an integer, 3 strings, and 1 double. Print the array.
         */
        //exercise not realisable because an array must  contain unique type values and we cannot have multiple type in it.


    }


}
