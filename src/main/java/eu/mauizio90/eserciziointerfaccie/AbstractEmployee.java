package eu.mauizio90.eserciziointerfaccie;

/**
 *
 * @author mauiz
 */
public abstract class AbstractEmployee implements Employee{
    private String name;
    private Account account;
    private double salary;

    public AbstractEmployee(String name, Account account, double salary) {
        this.name = name;
        this.account = account;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return name;
    
    }

    @Override
    public Account getAccount() {
        return account;
    
    }

    @Override
    public double getSalary(){
        return salary;
    }
    
    
}
