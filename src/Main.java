import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Control Structures ex.1 - Given a number between 1 and 9, return its value as a string
        Scanner sc = new Scanner(System.in);
        System.out.print("Type a number between 1 si 9: ");
        int nr = sc.nextInt();
        String number = "";
        if (nr==0)
            number = "Zero";
        else if (nr==1)
            number = "One";
        else if (nr==2)
            number = "Two";
        else if (nr==3)
            number = "Three";
        else if (nr==4)
            number = "Four";
        else if (nr==5)
            number = "Five";
        else if (nr==6)
            number = "Six";
        else if (nr==7)
            number = "Seven";
        else if (nr==8)
            number = "Eight";
        else if (nr==9)
            number = "Nine";
        System.out.println(number);

        //Control Structures ex. 2 - sum of odd numbers up to 100
        int sum = 0;
        for (int i=1;i<=100;i++) {
            if (i%2!=0)
                sum+=i;
        }
        System.out.println("The sum of the odd numbers up to 100 is: " + sum);

        //Control Structures ex. 3 - Calculate the sum of the digits of a given number
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Type in a number with at least four digits: ");
        int largeNumber = sc2.nextInt();
        int digitSum = 0;
        while (largeNumber>0) {
            digitSum += largeNumber % 10;
            largeNumber /= 10;
        }
        System.out.println("The sum of the digits of your number is: " + digitSum);

        //Control Structures ex. 4 - Reverse the digit order of a given number
        Scanner sc3 = new Scanner(System.in);
        System.out.print("Type in another number with at least four digits: ");
        int anotherNumber = sc3.nextInt();
        StringBuilder reversedNumber = new StringBuilder();
        while (anotherNumber>0) {
            reversedNumber.append(anotherNumber % 10);
            anotherNumber /=10;
        }
        System.out.println("The reversed number is: " + reversedNumber);

        //Control Structures ex. 5 - check if a given char is a vowel or not
        Scanner sc4 = new Scanner(System.in);
        System.out.print("Type an upper case letter: ");
        char character = sc4.next().charAt(0);
        if (character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
            System.out.println("This " + character + " is a vowel");
        }
        else {
            System.out.println("This " + character + " is a consonant");
        }


        //Control Structures ex. 6 - check byte size of a given integer using switch case
        Scanner sc5 = new Scanner(System.in);
        System.out.print("Type in one of the following numbers: 8, 16, 32 or 64 - ");
        int constant = sc5.nextInt();
        switch (constant) {
            case 8:
                System.out.println("Byte");
                break;
            case 16:
                System.out.println("Short");
                break;
            case 32:
                System.out.println("Integer");
                break;
            case 64:
                System.out.println("Long");
                break;
        }

        //Control Structures ex. 7 - print all odd numbers from -100 to 100
        for (int i=-100;i<=100;i++)
            if (i%2!=0)
                System.out.println(" " + i);

        //Control Structures ex. 8  - calculate the factorial value of a given number
        Scanner sc6 = new Scanner(System.in);
        System.out.print("Type in a number in order to calculate its factorial value: ");
        int yetAnotherNumber = sc6.nextInt();
        int factorialValue = 1;
        for (int i=1;i<=yetAnotherNumber;i++)
            factorialValue *= i;
        System.out.println("The factorial value is: " + factorialValue);

        //Control Structures ex. 9 - check if all the digits of a given number are odd
        Scanner sc12 = new Scanner(System.in);
        System.out.print("Type in a number to check if its digits are all odd numbers: ");
        int enteredNumber = sc12.nextInt();
        int digit;
        boolean allOdd = true;
        boolean Even = true;
        while (enteredNumber>0) {
            digit = enteredNumber % 10;
            if (digit % 2 == 0) {
                allOdd = false;
                break;
            }
            else {
                Even = false;
            }
            enteredNumber /= 10;
        }
        if (!allOdd)
            System.out.println("The number is NOT made of all odd digits");
        else if (!Even)
            System.out.println("The number is made of only odd digits");

        // Control Structures ex. 10 - show all the divisors of a given number
        Scanner sc13 = new Scanner(System.in );
        System.out.print("Type in a number to see all of its divisors: ");
        int nr13 = sc13.nextInt();
        for(int i=1;i<=nr13;i++) {
            if (nr13%i == 0)
                System.out.print(" " + i);
        }
    }
}
