package staff;

public class Employee {

    private String name;
    private String nINo;
    private double salary;

    public Employee (String name, String nINo, double salary){
        this.name = name;
        this.nINo = nINo;
        this.salary = salary;

    }

    public String getName() {
        return this.name;
    }

    public String getNumber() {
        return this.nINo;
    }

    public double getSalary() {
        return this.salary;
    }

    public double raiseSalary(double raise) {
        return this.salary * raise ;
    }

    public double payBonus() {
        return this.salary / 100;
    }
}
