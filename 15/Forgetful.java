import java.util.Scanner;

public class Forgetful {

    public static void main (String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Give me a name!");
        String name1 = input.nextLine();
        
        System.out.println("Who is the coolest guy in the world?");
        String name2 = input.nextLine();
        
        System.out.println("Now can you give a number?");
        int num1 = input.nextInt();
        
        System.out.println("then give a number with decimal.");
        double num2 = input.nextDouble();
        
        System.out.println("Thanks for cooperating!");
        
     }
     
}
