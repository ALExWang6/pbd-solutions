import java.util.Scanner;

public class BMi {

    public static void main (String[] args) {
    
        Scanner input = new Scanner(System.in);
        double weight;
        double height;
        double bMI;
        
        System.out.print("Your height in m: ");
        height = input.nextDouble();
        
        System.out.print("Your weight in kg: ");
        weight = input.nextDouble();
        
        bMI = weight / (height * height);
        
        System.out.println("Your BMI is " + bMI);
        
    }
    
}
