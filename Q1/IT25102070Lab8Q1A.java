import java.util.Scanner;

public class IT25102070Lab8Q1A {

    public static void main(String[] args) {

        int[] myArray = new int[5];
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 5 Numbers:");

        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            myArray[i] = input.nextInt();
        }

        System.out.println("\nArray in Reverse Order:");

        for (int i = myArray.length - 1; i >= 0; i--) {
            System.out.print(myArray[i] + " ");
        }

        System.out.println();
        input.close();
    }
}