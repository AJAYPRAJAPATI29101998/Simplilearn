import java.util.Scanner;


public class Calculator {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Simple Calculator");

        System.out.println("\nHere are your options:");
        System.out.println("\n1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Division");
        System.out.println("4. Multiplication");

        System.out.print("\nWhat would you like to do?: ");
        int choice = sc.nextInt();
        System.out.println();


        if (choice == 1){
            addition();
        }
        else if (choice == 2){
            subtraction();
        }
        else if (choice == 3){
            division();
        }
        else if (choice == 4){
            multiplication();
        }
        else {
        	System.out.println("Plese re-run the program and select Right Option");
        }

    }

    public static void addition(){

        int nOne, nTwo;
        Scanner sc = new Scanner(System.in);

        System.out.println("Addition");

        System.out.print("\nFirst Number: ");
        nOne = sc.nextInt();

        System.out.print("\nSecond Number: ");
        nTwo = sc.nextInt();

        
        System.out.println("\nSum: " + nOne + " + " + nTwo + " = " + (nOne + nTwo));
    }

    public static void subtraction(){
        int nOne, nTwo;
        Scanner sc = new Scanner(System.in);

        System.out.println("Subtraction");

        System.out.print("\nFirst Number: ");
        nOne = sc.nextInt();

        System.out.print("\nSecond Number: ");
        nTwo = sc.nextInt();


        System.out.println("\nSubtraction: " + nOne + " - " + nTwo + " = " + (nOne - nTwo));
    }

    public static void division(){
        int nOne, nTwo;
        Scanner sc = new Scanner(System.in);

        System.out.println("Division");

        System.out.print("\nFirst Number: ");
        nOne = sc.nextInt();

        System.out.print("\nSecond Number: ");
        nTwo = sc.nextInt();


        System.out.println("\nDivision: " + nOne + " / " + nTwo + " = " + (nOne / nTwo));
    }

    public static void multiplication(){
        int nOne, nTwo;
        Scanner sc = new Scanner(System.in);

        System.out.println("Multiplication");

        System.out.print("\nFirst Number: ");
        nOne = sc.nextInt();

        System.out.print("\nSecond Number: ");
        nTwo = sc.nextInt();


        System.out.println("\nMultiplication: " + nOne + " x " + nTwo + " = " + (nOne * nTwo));
    }
}
