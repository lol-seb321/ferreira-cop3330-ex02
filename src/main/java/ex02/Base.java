package ex02;

/*
Exercise 2 - Counting the Number of Characters
Create a program that prompts for an input string and displays output that shows the input string and the number of characters the string contains.

Example Output

What is the input string? Homer
Homer has 5 characters.

Constraints

Be sure the output contains the original string.
Use a single output statement to construct the output.
Use a built-in function of the programming language to determine the length of the string.

 */

import java.util.Scanner;

public class Base {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Base myBase = new Base();

        String inputS = myBase.inputString();
        myBase.printOutput(inputS);
    }

    private void printOutput(String inputS) {
        System.out.print("Length of ");
        System.out.print(inputS);
        System.out.print(" =");
        System.out.println(" " + inputS.length());
    }

    public String inputString() {
        System.out.print("Enter a string to display the number of characters:  ");
        String inputS = input.nextLine();
        return inputS;
    }

    }
