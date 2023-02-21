package eu.mauizio90.eserciziointerfaccie;

/**
 *
 * @author mauiz
 */
public class Bank {
    public String name;
    public int nextIban;
    
    public Bank(String name){
        this.name = name;
        this.nextIban = 0;
    }
    
    public Account newIstance(double amount){
        Account account = new Account(nextIban, amount);
        nextIban++;
        
        return account;
    }
    
}
