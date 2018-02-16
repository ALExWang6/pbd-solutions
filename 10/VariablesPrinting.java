// Alex Feb/16

public class VariablesPrinting {
    
	public static void main(String[] args) {
        
	String name, eyes, teeth, hair;
        double age, height, weight;

        name = "Wang";
        age = 17;     
        height = 74;  // inches
        weight = 180; // lbs
        eyes = "grey";
        teeth = "White";
        hair = "black";
        
        // transfer inches to cm
        height = height * 2.14;
        
        // transfer lbs to kg
        weight = weight * 0.45;

        System.out.println("Let's talk about " + name + ".");
        System.out.println("He's " + height + " cm tall.");
        System.out.println("He's " + weight + " kg heavy.");
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + eyes + " eyes and " + hair + " hair.");
        System.out.println("His teeth are usually " + teeth + " depending on the coffee.");

        // This line is tricky; try to get it exactly right.
        System.out.println("If I add " + age + ", " + height + ", and " + weight + " I get " + (age + height + weight) + ".");
    }
}
