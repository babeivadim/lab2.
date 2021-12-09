//Ex 13
package company;

public class EmployeeTestEx3 {
    public static void main(String[] args)
    {
        Employee Vadim = new Employee("Babei", "Vadim", 21000);
        Employee Alexandru = new Employee("Moraru","Alexandru",20000);
        System.out.println(Vadim.getFirstName()+" " +Vadim.getLastName()+ "'s yearly salary is "+Vadim.getSalary()*12);
        System.out.println(Alexandru.getFirstName()+" "+Alexandru.getLastName() +"'s yearly salary is "+Alexandru.getSalary()*12);
        Vadim.setSalary(Vadim.getSalary() * 1.10);
        Alexandru.setSalary(Alexandru.getSalary() * 1.10);
        System.out.println("Yearly salary after 10% boost: ");
        System.out.println(Vadim.getFirstName()+" "+Vadim.getLastName()+"'s yearly salary is "+Vadim.getSalary()*12);
        System.out.println(Alexandru.getFirstName()+" "+Alexandru.getLastName()+"'s yearly salary is "+Alexandru.getSalary()*12);
    }
}