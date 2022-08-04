package se.lexcion;


import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] array = new int[5];

        // Taking the first number
        System.out.println("Please enter your numbers: ");
        array[0] = in.nextInt();

      int  temp = 0, same = 0;


        // taking other inputs
        int count;
        for (count = 1; count < array.length; count++) {
            System.out.println("Enter array elements:");
            int num = in.nextInt();

            // Scanning the array for the number
            int condition;
            for (condition = 0; condition < count; condition++) {
                while (array[condition] == num) {
                    System.out.println("You have entered this number before! Add another..");
                    num = in.nextInt();
                    condition = 0;
                }
                array[count] = num;

            }
        }


        for (int i = 0; i < temp; i++) {
            for (int j = i + 1; j < count; j++) {
                if (array[i] < array[j])
                    temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        System.out.print("Array Elements in Ascending Order: ");
        for (int i = 0; i < count - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print(array[count - 1]);

    }


}






