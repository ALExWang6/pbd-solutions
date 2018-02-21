import java.util.Scanner;

public class FiveYears {

    public static void main (String[] args) {
    
        Scanner input = new Scanner(System.in);
        String name;
        int age;
        int age1;
        int age2;
        
        System.out.print("What is your name? ");
        name = input.nextLine();
        
        System.out.print("Hello! " + name + "! How old are you? ");
        age = input.nextInt();
        
        age1 = age + 5;
        age2 = age - 5;
        
        System.out.printf("You will be " + age1 + " years old after 5 years \nand you were " + age2 + " years old 5 years ago.");
       
    }
    
}
