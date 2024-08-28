import java.util.Scanner;

/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: 
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    int age;

    String firstname;
    String favouriteFood;
    System.out.println("How old are you?");
    age = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Enter your first name:");
    firstname = scanner.nextLine();
    System.out.println("Enter your favourite food:");
    favouriteFood = scanner.nextLine();
    System.out.println("\nFirst name:" + firstname +"\n\nAge: " + age +"\n\nFavourite food:" + favouriteFood);
    }
}
