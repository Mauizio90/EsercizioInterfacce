
package eu.mauizio90.eserciziointerfaccie;

/**
 *
 * @author mauiz
 */
public class Account {

    private int IBAN;
    private double money;

    public void setIBAN(int IBAN) throws IllegalArgumentException {
        if (IBAN > 27){
            throw new IllegalArgumentException("L'IBAN non può superare i 27 caratteri.");
        }
        this.IBAN = IBAN;
    }
    
    
    public Account(int IBAN, double money){
        this.IBAN = IBAN;
        this.money = money;
    }
            
    public double getMoney() {
        return money;
        
    }
    
    public void transferTo(Account to, double amount)throws IllegalArgumentException{
        if(amount <= 0){
            throw new IllegalArgumentException("L'importo deve essere superiore di 0");
        }
        if(money < amount){
            throw new IllegalArgumentException("Sei povero");
        }
        this.money -= amount;
        to.money += amount;
        
    }

    public String getIBAN() {
        return "IT000" + IBAN;
    }
    
    
    
    public static void transferTo(Account from, Account to, double amount){
        from.transferTo(to, amount);
    } 
    
}
