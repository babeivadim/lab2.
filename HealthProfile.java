//Ex 17
package company;

public class HealthProfile {
    private String firstName;
    private String lastName;
    private String gen;
    private int day;
    private int month;
    private int year;
    private double height;
    private double weight;
    private  int  mSystem;
    private int[] db = new int[3];
    public HealthProfile(String firstName, String lastName, String gen,
                         int[] db,double height, double weight){

        this.firstName=firstName;
        this.lastName=lastName;
        this.day = day;
        this.month = month;
        this.year = year;
        this.db=db;
        this.gen=gen;
        this.height=height;
        this.weight=weight;

    }

    public void setFirstName(String fName){
        this.firstName = firstName;
    }
    public void setLastName(String lName){
        this.lastName = lastName;
    }
    public void setGender(String gender){
        this.gen = gen;
    }
    public void setDb(int[] db){
        this.db = db;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
   /* public void setMeasurementSystem(int mSystem){
        this.mSystem = mSystem;
    }*/
    // GETTERS
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getGender(){
        return gen;
    }
    public int[] getDOB(){
        return db;
    }
    public double getHeight(){
        return height;
    }
    public double getWeight(){
        return weight;
    }
    public int getAge(){
        return java.util.Calendar.getInstance().get(java.util.Calendar.YEAR) - db[2];
    }
    public double getBMI(){
        return  calculateMetric( height, weight);
    }

    private double calculateMetric(double height, double weight){
        return weight / (height * height);
    }
    public int getMaxHeartRate(){

        return 220 - getAge();
    }
    public String getTargetHeartRate(){
        return String.format("%.0f - %.0f",
                getMaxHeartRate() * 0.5, getMaxHeartRate() * 0.85);
    }

    // print health information
    public void showHealthProfile(){
        System.out.println("\n YOUR HEALTH PROFILE");
        System.out.printf("Name:\t%s %s\n", firstName, lastName);
        System.out.printf("DOB:\t%d/%d/%d\nAge:\t%d\n", db[0], db[1], db[2], getAge());
        System.out.printf("Height:\t%.2f inches\nWeight: %.2f pounds\n", height, weight);
        System.out.printf("\n HEARTRATE:\n");
        System.out.printf("Max:\t%d\nTarget:\t%s\n", getMaxHeartRate(), getTargetHeartRate());
        System.out.printf("\nBMI:\n");
        System.out.printf("Your BMI: %.1f\n\n", getBMI());
        printBmiTable();
    }
    private void printBmiTable(){
        System.out.println("BMI VALUES:");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal:      between 18.5 and 24.9");
        System.out.println("Overweight:  between 25 and 29.9");
        System.out.println("Obese:       30 or greater");
    }
}