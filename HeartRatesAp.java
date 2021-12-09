//Ex 16
package company;
import java.util.Scanner;

public class HeartRatesAp {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter first name: ");
        String firstName = input.nextLine();

        System.out.printf("Enter last name: ");
        String lastName = input.nextLine();

        System.out.printf("Enter Date of birth dd mm yyyy: ");
        int[] tdb = new int[3];

        for(int i=0; i<3; i++){
            tdb[i] = input.nextInt();
        }

        HeartRates user1 = new HeartRates(firstName, lastName, tdb[0], tdb[1], tdb[2]);

        printInfo(user1);
    }
    private static void printInfo(HeartRates user){
        System.out.printf("%s %s\n%s - %d years of age\nMax HeartRate: %d\n",
                user.getFirstName(), user.getLastName(), user.getAge(),
                user.getAge(), user.getMaxHeartRate());

        System.out.printf("Target Heart Rate Range: %s\n", user.getTargetHeartRate());
    }

}