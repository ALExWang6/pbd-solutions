import java.util.Scanner;

public class AskQuestions {

    public static void main (String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        System.out.print("How old are you? ");
        int age = input.nextInt();
        
        System.out.print("How many feet tall are you? ");
        int feet = input.nextInt();
        
        System.out.print("And how many inches? ");
        int inches = input.nextInt();
        
        System.out.print("How much do you weigh? ");
        double weight = input.nextDouble();
        
        System.out.println("So you're " + age + " years old, " + feet + " feet and " + inches + " inches tall and " + weight + " heavy.");
    }

}
