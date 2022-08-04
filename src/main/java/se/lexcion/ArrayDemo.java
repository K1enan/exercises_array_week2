package se.lexcion;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {


//1
        /*

        System.out.println("Enter the size of the array");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int array [] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter element NO " + (i+1));
            array[i] = input.nextInt();
        }

        System.out.println("The array is ");

        for (int n : array)
            System.out.print(n);

         */

//2
        /*{
            System.out.println("Enter the size of array");
            int size = input.nextInt();
            int array[] = new int[size];

            fillArray(array);
            System.out.println("Enter a number for give the index");
            int number = input.nextInt();
            System.out.println("The index of the No " + number + " is \n" + indexOf(array, number));
        }

         */

//3
        /*  {
            System.out.println("Enter the size of the array");
            Scanner input = new Scanner(System.in);
            int size = input.nextInt();
            String[] names = new String[size];

            for (int k = 0; k < size; k++) {
                System.out.println("Enter name No " + (k + 1));
                names[k] = input.next();
            }

            System.out.println("The names is ");

            for (String n : names) {
                System.out.println(n);
            }


        }*/

//4
        /*{
            int[] firstArray = {1, 15, 20};
            int[] secondArray = firstArray;
            int[] realCopy = Arrays.copyOf(firstArray, firstArray.length);
            firstArray[0] = 1;
            System.out.println("Elements from the first array ");
            printArray(firstArray);
            System.out.println("Elements from the second array ");
            printArray(secondArray);
        }

         */

//5
        /*{
            int rows = 2;
            int columns = 2;
            String[][] cites = new String[rows][columns];


            cites[0][0] = "Sweden";
            cites[0][1] = "Stockholm";

            cites[1][0] = "French";
            cites[1][1] = "Paris";

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.println(cites[i][j]);
                }
            }



        }*/

//6
        /*{
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the size of the array");
            int size = input.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Enter a number " + (i + 1));
                arr[i] = input.nextInt();
            }

            int sum = 0;
            double average = 0;
            for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i];
                average = sum / arr.length;
            }
            System.out.println("The sum of these numbers is " + sum);
            System.out.println("The average of these numbers is " + average);


        }*/

//7
        /*{
            int array[] = new int[10];
            Scanner input = new Scanner(System.in);
            System.out.println("Enter 10 numbers");

            for (int i = 0; i < array.length; i++)
                array[i] = input.nextInt();

            System.out.println("Odd numbers ");
            for (int j = 0; j < array.length; j++) {
                if (array[j] % 2 == 0) ;
                else
                    System.out.println(array[j]);
            }


        }*/

//8
        /*  {
            int arr[] = {20, 20, 40, 20, 30, 40, 50, 60, 50};//unsorted array
            Arrays.sort(arr);//sorting array
            int length = arr.length;
            length = removeDuplicateElements(arr, length);
            //printing array elements
            for (int i = 0; i < length; i++)
                System.out.print(arr[i] + " ");

        } */

//9
        /*{
            String[] name = new String[0];
            name = expandArray(name, "Kenan");
            name = expandArray(name, "Johan");
            for (String  n : name)
            System.out.println(n);
        }*/

//10
        /*  {
            int a[][] = multiplicationTable(10, 10);
            for (int row = 0; row < a.length; row++)
            {
                for (int column = 0; column < a[row].length; column++)
                    System.out.printf("%2d ", +a[row][column]);
                    System.out.println( );
            }

        }*/

//11

        /*{
            Scanner input = new Scanner(System.in);
            int[] array = new int[10];
            int count, num;

            // Taking the first number
            System.out.println("Please enter your numbers: ");
            array[0] = input.nextInt();

            // taking other inputs
            for (count = 1; count < array.length; count++) {
                System.out.println("Please enter your numbers: ");
                num = input.nextInt();

                // Scanning the array for the number

                for (int n = 0; n < count; n++) {
                    while (array[n] == num) { // if user gives duplicate after duplicate.
                        System.out.println("You have entered this number before! Add another..");
                        num = input.nextInt();
                        n = 0;
                    }

                }
                array[count] = num;

            }
            // reverse the array
            System.out.println("The array after reversing :\n");
            for (int i = 0; i < array.length; i++)
                System.out.print(array[array.length - i - 1] + ", ");
        } */

//12

        /*  {
            int[][] arr1 = {{1, 2, 3},
                    {2, 4, 6},
                    {3, 6, 9}};

            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1.length; j++) {
                    System.out.print(arr1[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("The diagonal elements is:");
            for (int k = 0; k < arr1.length; k++) {
                System.out.print(arr1[k][k] + " ");
            }
        } */

//13

        /*   {
            System.out.println("Original array ");
            int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            for (int a : arr) {
                System.out.print(a + " ");
            }
            System.out.println();

            System.out.print("Array after segregation ");
            System.out.println();
            arrangeOodEvenNum(arr);

            for (int i = 0; i < arr.length; i++)
                System.out.print(arr[i] + " ");
        }*/


    }


        public static void printArray ( int[] toPrint){
            for (int number : toPrint) {
                System.out.print(number);
            }
            System.out.println();
        }

        public static void fillArray ( int[] list){


            for (int i = 0; i < list.length; i++) {
                System.out.println("Enter number " + (i + 1));
                list[i] = input.nextInt();

            }


        }

        public static int indexOf ( int[] list, int target){

            // if array is Null
            if (list == null) {
                return -1;
            }

            // find length of array
            int len = list.length;
            int i = 0;

            // traverse in the array
            while (i < len) {
                // if the i-th element is target
                // then return the index
                if (list[i] == target) {
                    return i;
                } else {
                    i = i + 1;
                }
            }
            return -1;
        }

        public static int search ( int[] list, int target){

            for (int i = 0; i < list.length; i++) {
                if (list[i] == target)
                    return i;
            }

            return -1;
        }

        public static int removeDuplicateElements ( int arr[], int n){

            if (n == 0 || n == 1)
                return n;

            int[] temp = new int[n];
            int j = 0;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] != arr[i + 1]) {
                    temp[j++] = arr[i];
                }
            }
            temp[j++] = arr[n - 1];
            // Changing original array
            for (int i = 0; i < j; i++) {
                arr[i] = temp[i];
            }
            return j;
        }

        public static String[] expandArray (String[]source, String name){

            String[] newArray = Arrays.copyOf(source, source.length + 1);
            newArray[newArray.length - 1] = name; //Adding the name to last index of newArray
            return newArray;
        }

        public static int[][] multiplicationTable ( int r, int c){

            int[][] array = new int[r][c];

            for (int row = 0; row < array.length; row++) {

                for (int column = 0; column < array[row].length; column++)

                    array[row][column] = (row + 1) * (column + 1);
            }
            return array;
        }

        public static void arrangeOodEvenNum (int [] arr) {

            /* Initialize left and right indexes */
            int left = 0, right = arr.length - 1;
            while (left < right) {
                /* Increment left index while we see 0 at left */
                while (arr[left] % 2 == 0 && left < right)
                    left++;

                /* Decrement right index while we see 1 at right */
                while (arr[right] % 2 == 1 && left < right)
                    right--;

                if (left < right) {
                    /* Swap arr[left] and arr[right]*/
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                }
            }

        }


}