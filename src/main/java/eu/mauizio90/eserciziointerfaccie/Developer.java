
package eu.mauizio90.eserciziointerfaccie;

/**
 *
 * @author mauiz
 */
public class Developer extends AbstractEmployee{

    private String programmingLanguage;

    public Developer(String programmingLanguage, String name, Account account, double salary) {
        super(name, account, salary);
        this.programmingLanguage = programmingLanguage;
    }




    @Override
    public Account getAccount() {
        return super.getAccount();
    }

    @Override
    public String getName() {
        return super.getName();
    }


    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    @Override
    public double getSalary() {
        return super.getSalary();
    }
    
}





