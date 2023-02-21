package eu.mauizio90.eserciziointerfaccie;

/**
 *
 * @author mauiz
 */
public class Security extends AbstractEmployee{
    
    private String weapon;
    
    public Security(String name, Account account, double salary, String weapon) {
        super(name, account, salary);
        this.weapon = weapon;
    }


    @Override
    public Account getAccount() {
        return super.getAccount();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getSalary() {
        return super.getSalary();
    }

 
    

    
    
    
}
