import java.util.Scanner;

public class UserInfo {

    public static void main (String[] args) {
    
        Scanner input = new Scanner(System.in);
        String firstName;
        String lastName;
        String login;
        int grade;
        int iD;
        double average;
        
        System.out.println("Enter your info.");
        
        System.out.println("");
        
        System.out.print("First name: ");
        firstName = input.nextLine();
        System.out.println("");
        
        System.out.print("Last name: ");
        lastName = input.nextLine();
        System.out.println("");
        
        System.out.print("Grade (9-12): ");
        grade = input.nextInt();
        System.out.println("");
        
        System.out.print("Student ID: ");
        iD = input.nextInt();
        System.out.println("");
        
        System.out.print("Login: ");
        login = input.next();
        System.out.println("");
        
        System.out.print("Average: ");
        average = input.nextDouble();
        System.out.println("");
        
        System.out.println("Your information:");
        System.out.println("Login: " + login);
        System.out.println("ID:    " + iD);
        System.out.println("Name:  " + lastName + ", " + firstName);
        System.out.println("Avg:   " + average);
        System.out.println("Grade: " + grade);
        
     }
        
} 
