import java.util.Scanner;  // Import the Scanner class

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Enter first number");
        int firstNum = myObj.nextInt();

        System.out.println("Enter first number");
        int secNum = myObj.nextInt();

        System.out.println("Enter first number");
        int thirdNum = myObj.nextInt();

        //System.out.println("Largest number " + Math.max(Math.max(firstNum, secNum), Math.max(secNum, thirdNum)));
    
        int largest = 0;

        if(firstNum>=secNum && firstNum>thirdNum)
        {
            largest = firstNum;
        }

        if(secNum>=firstNum && secNum>thirdNum)
        {
            largest = secNum;
        }

        if(thirdNum>=firstNum && thirdNum>firstNum)
        {
            largest = thirdNum;
        }

        System.out.println("largest number: " + largest);
    }
  }