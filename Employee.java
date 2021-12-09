//Ex 13
package company;

public class Employee {
    private String LastName;
    private String FirstName;
    private  double salary;

    public Employee(String LastName, String FirstName, double salary){
this.LastName=LastName;
this.FirstName=FirstName;
if(salary >= 0)
{ this.salary=salary;}
    }
    public void setLastName(String LastName){
        this.LastName=LastName;
    }
    public String getLastName()
    {
        return LastName;
    }
    public void setFirstName(String FirstName){
        this.FirstName=FirstName;
    }
    public String getFirstName()
    {
        return FirstName;
    }
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
    }
    public double getSalary() {
        return salary;
    }
}