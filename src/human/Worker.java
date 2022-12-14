package src.human;

public class Worker extends Human {
    private double salary;
    private String company;

    public Worker(String name, int age) {
        super(name, age);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public String getCompany() {
        return company;
    }

    public void live() {}
}