//Ex 17
package company;
import java.util.Scanner;

public class HealthProfileApp {
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name: ");
    String firstName = input.nextLine();

        System.out.print("Enter you last name: ");
    String lastName = input.nextLine();

        System.out.print("Enter your gender (male/female): ");
    String gen = input.nextLine();
        //System.out.printf("Enter you day of birth: ");
        System.out.print("Enter Date of birth dd mm yyyy: ");
    int[] db = new int[3];

        for(int i=0; i<3; i++){
        db[i] = input.nextInt();
    }

        System.out.printf("Input weight in kilograms: ");
        double weight = input.nextDouble();

        System.out.printf("Input height in metres: ");
        double height = input.nextDouble();

        HealthProfile profile = new HealthProfile(firstName, lastName, gen, db, height, weight);
        profile.showHealthProfile();
}
}