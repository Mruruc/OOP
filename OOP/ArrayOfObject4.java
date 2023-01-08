package Object_Oriented_Programing;

public class ArrayOfObject4 {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Alice", 45000);
        Employee.print(employee1);
        employee1.raiseSalary(2000); // To just give one employee raise.
        Employee employee2 = new Employee("Bob", 5000.00);
        Employee.print(employee1);
        Employee.print(employee2);
        Employee employee3 = new Employee("Charlie", 8800);
        Employee.print(employee3);

        System.out.println("=================================================");

        Company company = new Company(new Employee[]{employee1, employee2, employee3});

        for (Employee employee : company.getEmployees()) {
            System.out.println(employee.getName() + " " + employee.getSalary());
        }
        System.out.println("After giving raise to everyone;");

        company.giveRaise(300);
        for (Employee employee : company.getEmployees()) {
            System.out.println(employee.getName() + " " + employee.getSalary());
        }
        System.out.println("Total salaries " + company.getTotalSalaries());

     /*   for (int i = 0; i < company.getEmployees().length; i++) {
            System.out.println(company.getEmployees()[i].getName() + ": $" + company.getEmployees()[i].getSalary());
        }*/


    }


}


class Employee {
    private String name;
    private double salary;

    public Employee() {
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double amount) {
        this.salary = this.salary + amount;
    }

    public static void print(Employee employee) {
        System.out.println("Name: " + employee.getName() + " Salary: " + employee.getSalary());
    }

}

class Company {
    private Employee[] employees;

    public Company(Employee[] employees) {
        this.employees = employees;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void giveRaise(double amount) {
       /* for (Employee employee:employees) {
            employee.raiseSalary(amount);
        }*/
        for (int i = 0; i < employees.length; i++) { // classic fori loop my preferable
            employees[i].raiseSalary(amount);
        }
    }

    public double getTotalSalaries() {
        double total = 0;
       /* for(Employee employee: employees)
            total=total+ employee.getSalary();
        return total;*/
        for (int i = 0; i < employees.length; i++) {
            total = total + employees[i].getSalary();
        }
        return total;
    }

}

