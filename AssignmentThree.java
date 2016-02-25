package sheridan;
import java.util.Scanner;
public class AssignmentThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // creates a scanner named input
        System.out.println("Input the x co-ordinate below: "); // simple print line statement
        double x; // gets a double value from user and assigns to variable x
        x = input.nextDouble();
        System.out.println("Input the y co-ordinate below: "); // same as line 6
        double y; // same as line 7
        y = input.nextDouble();
        double total = x * x + y * y; /* squaring the two numbers. The formula for calculating distance as gives is
        squareroot((x2-x1)^2 + (y2-y1)^2) how ever since the origin of this circle are (0,0 there is no need to subtract from anything.) */
        double totalSquared = Math.sqrt(total); // gets square root of total used the Math library/class 
        if (totalSquared <= 10) { // simple if statement if totalSquared is less than or equal to 10 
            System.out.println("These co-ordinates are within the circle"); // same as l 6
        } 
        else { // simple else statement if line 13 is not evaluated to true this part is executed
            System.out.println("These co-orindates are not within the circle"); // same as l 6
        }
    }
}

