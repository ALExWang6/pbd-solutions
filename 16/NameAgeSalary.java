import java.util.Scanner;

public class NameAgeSalary {

    public static void main(String[] args) {

        String name;
        int age;
        double salary;
        Scanner input = new Scanner(System.in);
    
        System.out.println("What is your name?");
        name = input.nextLine();
    
        System.out.println("Hello " + name + " ! How old are you?");
        age = input.nextInt();
    
        System.out.println("So you are " + age + " years old. How much do you make per hour?");
        salary = input.nextDouble();
    
        System.out.println(salary + "! I hope that is per hour, not per year!");
    
    }
    
}
    
     
