//Ex 16
package company;

public class HeartRates {
    private String firstName;
    private String lastName;
   // private LocalDate db;
    private int day;
    private int month;
    private int year;
    public HeartRates(String firstName, String lastName, int day, int month, int year)
    {
    this.firstName=firstName;
    this.lastName=lastName;
    this.day = day;
    this.month = month;
    this.year = year;
    }
public void setFirstName(String firstName)
{
    this.firstName=firstName;
}

    public String getFirstName() {
        return firstName;
    }
    public void setLastName(String lastName)
    {
        this.lastName=lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setDay(int day)
    {
        this.day=day;
    }

    public int getDay() {
        return day;
    }
    public void setMonth(int month)
    {
        this.month=month;
    }

    public int getMonth() {
        return month;
    }
    public void setYear(int year)
    {
        this.year=year;
    }

    public int getYear() {
        return year;
    }
    public String getBirth()
    {
        return String.format("%d/%d/%d", day, month, year);
    }
    public int getAge(){
        return java.util.Calendar.getInstance().get(java.util.Calendar.YEAR) - year;
    }

    public int getMaxHeartRate(){

        return 220 - getAge();
    }
    public String getTargetHeartRate(){
        return String.format("%.0f - %.0f",
                getMaxHeartRate() * 0.5, getMaxHeartRate() * 0.85);
    }
}